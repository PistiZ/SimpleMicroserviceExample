package hu.pistiz.example.microservice.creatorui.service;

import hu.pistiz.example.microservice.chassisinterface.Chassis;
import hu.pistiz.example.microservice.engineinterface.Engine;
import hu.pistiz.example.microservice.wheelinterface.Wheel;

import java.util.List;

public interface CarPartService {

    List<Chassis> getChassisList();

    List<Engine> getEngines();

    List<Wheel> getWheels();

}
