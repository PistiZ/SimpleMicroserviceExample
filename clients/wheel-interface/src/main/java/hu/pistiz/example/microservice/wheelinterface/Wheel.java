package hu.pistiz.example.microservice.wheelinterface;

import java.io.Serializable;

public class Wheel implements Serializable {

    private static final long serialVersionUID = 1283477779617692720L;

    private String manufacturer;

    private Integer width;

    private Integer ratio;

    private String construction;

    private Integer rimSize;

    public Wheel() {

    }

    public Wheel(String manufacturer, Integer width, Integer ratio, String construction, Integer rimSize) {
        this.manufacturer = manufacturer;
        this.width = width;
        this.ratio = ratio;
        this.construction = construction;
        this.rimSize = rimSize;
    }

    public Wheel(Wheel other) {
        this.manufacturer = other.manufacturer;
        this.width = other.width;
        this.ratio = other.ratio;
        this.construction = other.construction;
        this.rimSize = other.rimSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getRatio() {
        return ratio;
    }

    public void setRatio(Integer ratio) {
        this.ratio = ratio;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public Integer getRimSize() {
        return rimSize;
    }

    public void setRimSize(Integer rimSize) {
        this.rimSize = rimSize;
    }
}
