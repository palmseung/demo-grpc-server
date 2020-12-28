package com.example.demogrpcserver;

import com.example.demogrpcserver.service.SampleServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGrpcServerApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(DemoGrpcServerApplication.class, args);

		Server server = ServerBuilder.forPort(8080)
				.addService(new SampleServiceImpl())
				.build();

		server.start();

		server.awaitTermination();
	}

}
