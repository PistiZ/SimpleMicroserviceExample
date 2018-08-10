package hu.pistiz.example.microservice.wheelservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WheelServiceApplication {

    public static void main(String... args) {
        SpringApplication.run(WheelServiceApplication.class, args);
    }

}
