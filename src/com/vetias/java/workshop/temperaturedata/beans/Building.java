import java.time.LocalDateTime;

package src.com.vetias.java.workshop.temperaturedata.beans;

public class Building {

    private String name;
    private double area;
    private int floors;
    private LocalDateTime opendatetime;
    private LocalDateTime closedatetime;
    public void setName (String aName){
        name=aName;
    }
    public String getname(){
        return name;
    }
    public void setArea(String aArea){
        name=aArea;
    }
    public double getarea(){
        return area;
    }
    public int getFloors(){
        return floors;
    }
}
  
 