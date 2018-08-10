package hu.pistiz.example.microservice.engineservice.controller;

import hu.pistiz.example.microservice.engineinterface.Engine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EngineController {

    @GetMapping("/")
    public List<Engine> getEngines() {
        return Arrays.asList(
                new Engine("Opel", "I4"),
                new Engine("BMW", "I6"),
                new Engine("Ferrari", "V8"));
    }

}
