# ---------- Stage 1: Build with Webpack ----------
FROM node:18-alpine as builder

WORKDIR /app

COPY package.json ./
RUN npm install

COPY . .
RUN npm run build

# ---------- Stage 2: Serve with Nginx ----------
FROM nginx:alpine

COPY --from=builder /app/dist /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
