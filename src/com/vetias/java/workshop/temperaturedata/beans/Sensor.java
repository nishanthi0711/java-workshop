package com.vetias.java.workshop.temperaturedata.beans;

public class Sensor {
    private String id;
    private String location;
    private double value;

    public Sensor(String id, String location, double value) {
        this.id = id;
        this.location = location;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id='" + id + '\'' +
                ", location='" + location + '\'' +
                ", value=" + value +
                '}';
    }
}
