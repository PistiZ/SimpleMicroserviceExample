package hu.pistiz.example.microservice.engineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EngineServiceApplication {

    public static void main(String... args) {
        SpringApplication.run(EngineServiceApplication.class, args);
    }

}
