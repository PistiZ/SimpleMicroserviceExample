package hu.pistiz.example.microservice.creatorui.test;

import hu.pistiz.example.microservice.chassisinterface.Chassis;
import hu.pistiz.example.microservice.creatorui.service.CarPartService;
import hu.pistiz.example.microservice.engineinterface.Engine;
import hu.pistiz.example.microservice.wheelinterface.Wheel;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;
import java.util.List;

@RestController
public class TestController {

    private final LoadBalancerClient loadBalancerClient;

    private final CarPartService carPartService;

    @Inject
    public TestController(LoadBalancerClient loadBalancerClient, CarPartService carPartService) {
        this.loadBalancerClient = loadBalancerClient;
        this.carPartService = carPartService;
    }

    @GetMapping("/getCarParts")
    public List<String> getCarParts() {
        ServiceInstance engineServiceInstance = loadBalancerClient.choose("engine-service");

        return new RestTemplate().getForObject(engineServiceInstance.getUri(), List.class);
    }

    @GetMapping("/getWheel")
    public String getWheel() {
        ServiceInstance wheelServiceInstance = loadBalancerClient.choose("wheel-service");

        return new RestTemplate().getForObject(wheelServiceInstance.getUri(), String.class);
    }

    @GetMapping("/getChassisList")
    public List<Chassis> getChassisList() {
        return carPartService.getChassisList();
    }

    @GetMapping("/getEngines")
    public List<Engine> getEngines() {
        return carPartService.getEngines();
    }

    @GetMapping("/getWheels")
    public List<Wheel> getWheels() {
        return carPartService.getWheels();
    }

}
