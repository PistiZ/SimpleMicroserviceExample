package hu.pistiz.example.microservice.engineinterface;

import java.io.Serializable;

public class Engine implements Serializable {

    private static final long serialVersionUID = -5969612890211024609L;

    private String manufacturer;

    private String type;

    public Engine() {

    }

    public Engine(String manufacturer, String type) {
        this.manufacturer = manufacturer;
        this.type = type;
    }

    public Engine(Engine other) {
        this.manufacturer = other.manufacturer;
        this.type = other.type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
