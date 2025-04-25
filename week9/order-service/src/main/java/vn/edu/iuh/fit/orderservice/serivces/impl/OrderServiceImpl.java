/**
 * @ (#) OrderServiceImpl.java      4/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.orderservice.serivces.impl;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import vn.edu.iuh.fit.orderservice.entities.Order;
import vn.edu.iuh.fit.orderservice.entities.Product;
import vn.edu.iuh.fit.orderservice.repositories.OrderRepository;
import vn.edu.iuh.fit.orderservice.serivces.OrderService;

import java.util.List;
import java.util.Map;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 4/12/2025
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;


    @CircuitBreaker(name = "productService", fallbackMethod = "productServiceFallback")
    @Retry(name = "productService")
    @RateLimiter(name = "productService", fallbackMethod = "productServiceFallback")
    @Override
    public Order save(Order order) {
        System.out.println("Order: " + order.getId() + " " + order.getProductId() + " " + order.getOrderDate() + " " + order.getPhoneNumber() + " " + order.getAddress() + " " + order.getNote() + " " + order.getStatus());

        Long productId = order.getProductId();
        if (productId == null) {
            return null;
        }
        String productServiceUrl = "http://localhost:8080/api/v1/products/" + productId;
        System.out.println("Product Service URL: " + productServiceUrl);

        try {
            ResponseEntity<Product> productResponse = restTemplate.getForEntity(productServiceUrl, Product.class);

            if (!productResponse.getStatusCode().is2xxSuccessful()) {
                return null;
            }

            Product productResponseBody = productResponse.getBody();
            System.out.println("Product: " + productResponseBody.getId() + " " + productResponseBody.getName() + " " + productResponseBody.getDescription() + " " + productResponseBody.getPrice());
            if (order.getId() == null || order.getId() == 0) {
                order = order;
            } else {
                order = orderRepository.findById(order.getId()).orElse(null);
                if(order == null) {
                    return null;
                }
                if (order.getOrderDate() != null) {
                    order.setOrderDate(order.getOrderDate());
                }
                if (order.getPhoneNumber() != null) {
                    order.setPhoneNumber(order.getPhoneNumber());
                }
                if (order.getAddress() != null) {
                    order.setAddress(order.getAddress());
                }
                if (order.getNote() != null) {
                    order.setNote(order.getNote());
                }

                if (order.getStatus() != null) {
                    order.setStatus(order.getStatus());
                }

                if(order.getCustomerId() != null) {
                    order.setCustomerId(order.getCustomerId());
                }


            }
            System.out.println("haha" + order);
            return orderRepository.save(order);

        } catch (ResourceAccessException e) {
            System.err.println("Unable to connect to the product service: " + e.getMessage());
            throw new IllegalStateException("Product service is currently unavailable");
        } catch (Exception e) {
            System.err.println("Error while processing product information: " + e.getMessage());
            throw new IllegalArgumentException("Invalid product data or product not found");
        }


    }

    @Override
    public Order productServiceFallback(Order order, Throwable cause) {
        System.err.println("Fallback triggered due to: " + cause.getMessage());
        throw new RuntimeException("Fallback: Unable to process the order due to product service failure");
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found "+ id));
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
