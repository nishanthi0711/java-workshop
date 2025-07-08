package src.com.vetias.java.workshop.temperaturedata;

public class location {
    private String name;
    private double latitude;
    private double longitude;
    private String description;
    private String country;
    private String city;
    private String address;
    private long postalcode;
    public void setName(String aName){
        name=aName;

    }

    public  String getName (){
        return name;
    }
    public void Setlatitude(double aLatitude){
        latitude=aLatitude;
    }
    public double getlongitute(){
        return longitude;

    }
    public void SetDescription(String aDescription){
        description=aDescription;
    }
    public String getDescription(){
        return description;
    }
    public void SetCountry(String aCountry){
        country=aCountry;
    }
    public String getCountry(){
        return country;
    }
    public void setCity(String aCity){
        city=aCity;
    }
    public String getCity(){
        return city;
    }
    public void setAddress(String aAddress){
    address=aAddress;
    }
    public String getAddress(){
        return address;
    }
    public  void setpostalcode(long aPostalcode){
        postalcode=aPostalcode;
    }
    public long getpostalcode(){
        return postalcode;
    }
    public string toString(){
        return "Location {name=:"+ name+
                ",Latitude=;"+Latitude+
                ",Longitude=;'"+longitude+
                ",Description=;'+description+
                ",country=;"+country+
                ",city=;"+city+
                ",address=;"+address+
                ",postalcode=;"+postalcode"}";
    }
}
