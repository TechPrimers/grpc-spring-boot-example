# Spring Boot gRPC Example
This project covers usage of gRPC in a Spring Boot application

## Commands used
```
  grpcurl --plaintext localhost:9090 list
  grpcurl --plaintext localhost:9090 list com.techprimers.grpc.GreetingService
  grpcurl --plaintext -d '{"message": "How are you?"}' localhost:9090 com.techprimers.grpc.GreetingService/greeting
  
```

## Reference
- [Mike's Spring Boot gRPC Starter](https://yidongnan.github.io/grpc-spring-boot-starter/en/server/getting-started.html)