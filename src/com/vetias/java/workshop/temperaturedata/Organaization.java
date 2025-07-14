package com.vetias.java.workshop.temperaturedata;
import java.time.LocalDate;

public record Organaization(String name,
   String completeAddress,
   String Website,
   String email,
   String phonenumber,
LocalDate establishedDate){
    
}
