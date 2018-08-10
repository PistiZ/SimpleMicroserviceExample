package hu.pistiz.example.microservice.chassisservice.controller;

import hu.pistiz.example.microservice.chassisinterface.Chassis;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ChassisController {

    @RequestMapping("/")
    public List<Chassis> getChassisList() {
        return Arrays.asList(
                new Chassis("Opel", 156465156, "grey"),
                new Chassis("Suzuki", 578745116, "red"));
    }

}
