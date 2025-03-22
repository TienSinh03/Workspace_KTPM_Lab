FROM node:18-alpine 

WORKDIR /app

# Sao chép file package.json và package-lock.json vào container
COPY package*.json ./

# Cài đặt dependencies
RUN npm install

COPY . .

EXPOSE 5173

# Chạy server Vite ở mode development
CMD ["npm", "run", "dev", "--", "--host"]