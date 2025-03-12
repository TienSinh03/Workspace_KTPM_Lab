# Bài tập 1: Một hệ thống quản lý đơn hàng có các trạng thái như: Mới tạo, Đang xử lý, Đã giao, và Hủy.
## Lựa chọn patter: State Pattern
> **State Pattern phù hợp vì**: <br>
> - Tách ra mỗi state riêng biệt dễ dàng xử lý<br>
> - Khi thêm một state mới thì không ảnh hưởng đến các state khác<br>
> - Dễ dàng chuyển từ state này sang state khác<br>

![minhChung_Ex1](https://github.com/user-attachments/assets/8d46824e-d6ca-4fdc-a798-fba6e338c5de)

# Bài tập 2: Tính toán thuế cho sản phẩm với các thuê khác nhau
## Lựa chọn patter: Strategy Pattern
> **Strategy Pattern phù hợp vì**:<br>
> - Giúp dễ dàng thêm hoặc thay đổi các loại thuế mà không ảnh hưởng đến sản phẩm.<br>
> - Dễ dàng mở rộng, có thể thêm các loại thuế mới như Thuế nhập khẩu mà không sửa code của sản phẩm.<br>
> - Dễ bảo trì,...

![minhChung_Ex2](https://github.com/user-attachments/assets/a726030c-0789-4769-9122-d62c20ed7724)

# Bài tập 3: Hệ thống thanh toán
## Lựa chọn patter: Decorator Pattern
> **Decorator Pattern phù hợp vì**:<br>
> - Cho phép thêm các tính năng bổ sung (phí xử lý, mã giảm giá) mà không sửa đổi phương thức thanh toán gốc.<br>
> - Dễ dàng mở rộng, có thể thêm nhiều loại phí hoặc ưu đãi mà không làm thay đổi lớp thanh toán chính.<br>

![minhChung_Ex3](https://github.com/user-attachments/assets/c19c7b6e-fff1-457c-a998-c05c13f4c842)
