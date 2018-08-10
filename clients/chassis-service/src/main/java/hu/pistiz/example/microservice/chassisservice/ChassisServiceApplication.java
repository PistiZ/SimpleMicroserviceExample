package hu.pistiz.example.microservice.chassisservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ChassisServiceApplication {

    public static void main(String... args) {
        SpringApplication.run(ChassisServiceApplication.class, args);
    }

}
