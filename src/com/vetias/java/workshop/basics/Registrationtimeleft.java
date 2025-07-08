package com.vetias.java.workshop.basics;

import java.time.LocalTime;

public class Registrationtimeleft { 
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        LocalTime registrationEndTime = LocalTime.of(23,00);
        int hoursLeft = registrationEndTime.getHour() - currentTime.getHour();
        int minutesLeft = registrationEndTime.getMinute() - currentTime.getMinute();
        int secondsLeft = registrationEndTime.getSecond() - currentTime.getSecond();
        System.out.println("Time left for registration: " + hoursLeft + " hours, " + minutesLeft + " minutes, " + secondsLeft + " seconds");
        
        }
    }


