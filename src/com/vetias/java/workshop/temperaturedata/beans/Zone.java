package src.com.vetias.java.workshop.temperaturedata.beans;

public class Zone {
    private String name;
    private int Zoneid;
    private String type;
    private double area;
       // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getZoneid() {
        return Zoneid;
    }
    public void setZoneid(int zoneid) {
        Zoneid = zoneid;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    
}
