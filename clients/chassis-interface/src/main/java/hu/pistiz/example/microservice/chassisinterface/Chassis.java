package hu.pistiz.example.microservice.chassisinterface;

import java.io.Serializable;

public class Chassis implements Serializable {

    private static final long serialVersionUID = 7925879253246615945L;

    private String manufacturer;

    private Integer number;

    private String color;

    public Chassis() {

    }

    public Chassis(String manufacturer, Integer number, String color) {
        this.manufacturer = manufacturer;
        this.number = number;
        this.color = color;
    }

    public Chassis(Chassis other) {
        this.manufacturer = other.manufacturer;
        this.number = other.number;
        this.color = other.color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
