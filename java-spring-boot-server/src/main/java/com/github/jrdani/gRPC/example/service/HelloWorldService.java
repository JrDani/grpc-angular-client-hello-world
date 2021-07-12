package com.github.jrdani.gRPC.example.service;

import com.github.jrdani.hello.*;
import io.grpc.stub.*;
import net.devh.boot.grpc.server.service.*;

@GrpcService
public class HelloWorldService extends HelloWorldServiceGrpc.HelloWorldServiceImplBase {
    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        System.out.println("request: " + request.getText());
        responseObserver.onNext(HelloResponse.newBuilder().setText(request.getText()).build());
        responseObserver.onCompleted();
    }
}
