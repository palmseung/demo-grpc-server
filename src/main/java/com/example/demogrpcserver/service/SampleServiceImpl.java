package com.example.demogrpcserver.service;

import com.example.demogrpcserver.grpc.SampleRequest;
import com.example.demogrpcserver.grpc.SampleResponse;
import com.example.demogrpcserver.grpc.SampleServiceGrpc.SampleServiceImplBase;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SampleServiceImpl extends SampleServiceImplBase {

  @Override
  public void sampleCall(SampleRequest request, StreamObserver<SampleResponse> responseObserver) {
    responseObserver.onNext(SampleResponse.newBuilder()
        .setMessage("success")
        .build());

    responseObserver.onCompleted();
  }
}
