package hu.pistiz.example.microservice.creatorui.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import hu.pistiz.example.microservice.chassisinterface.Chassis;
import hu.pistiz.example.microservice.creatorui.client.ChassisRestClient;
import hu.pistiz.example.microservice.creatorui.client.EngineRestClient;
import hu.pistiz.example.microservice.creatorui.client.WheelRestClient;
import hu.pistiz.example.microservice.creatorui.service.CarPartService;
import hu.pistiz.example.microservice.engineinterface.Engine;
import hu.pistiz.example.microservice.wheelinterface.Wheel;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;

@Service
public class CarPartServiceImpl implements CarPartService {

    private final ChassisRestClient chassisRestClient;

    private final EngineRestClient engineRestClient;

    private final WheelRestClient wheelRestClient;

    @Inject
    public CarPartServiceImpl(ChassisRestClient chassisRestClient, EngineRestClient engineRestClient, WheelRestClient wheelRestClient) {
        this.chassisRestClient = chassisRestClient;
        this.engineRestClient = engineRestClient;
        this.wheelRestClient = wheelRestClient;
    }

    @Override
    @HystrixCommand(fallbackMethod = "getDefaultChassisList")
    public List<Chassis> getChassisList() {
        return chassisRestClient.getChassisList();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getDefaultEngines")
    public List<Engine> getEngines() {
        return engineRestClient.getEngines();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getDefaultWheels")
    public List<Wheel> getWheels() {
        return wheelRestClient.getWheels();
    }

    private List<Chassis> getDefaultChassisList() {
        return Collections.singletonList(new Chassis("no manufacturer", -1, "no color"));
    }

    private List<Engine> getDefaultEngines() {
        return Collections.singletonList(new Engine("no manufacturer", "no type"));
    }

    private List<Wheel> getDefaultWheels() {
        return Collections.singletonList(new Wheel("no manufacturer", -1, -1, "no construction", -1));
    }
}
