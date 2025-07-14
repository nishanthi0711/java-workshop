package com.vetias.java.workshop.temperaturedata.beans;

import com.vetias.java.workshop.temperaturedata.Organaization;
import java.time.LocalDate;

public class temperaturedataapplication {
    public static void main(String[]args){
        Organaization org = new Organaization("vet",
        "thindal erode",
        "www.vetias.com",
        "vetias@gmail.com",
        "9876543210",
        LocalDate.of(2025,07,11));
        System.out.println(org);

    }

    
}
