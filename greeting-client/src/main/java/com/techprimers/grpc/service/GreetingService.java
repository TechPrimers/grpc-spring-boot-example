package com.techprimers.grpc.service;

import com.techprimers.grpc.GreetingRequest;
import com.techprimers.grpc.GreetingResponse;
import com.techprimers.grpc.GreetingServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @GrpcClient("grpc-server")
    private GreetingServiceGrpc.GreetingServiceBlockingStub greetingServiceStub;

    public String receiveGreeting(String message) {
        GreetingRequest greetingRequest = GreetingRequest.newBuilder()
                .setMessage(message)
                .build();

        //call to grpc server
        GreetingResponse greetingResponse = greetingServiceStub.greeting(greetingRequest);

        System.out.println("Received Message In Client: " + greetingResponse.getMessage());
        return greetingResponse.getMessage();
    }
}