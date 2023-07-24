package com.fiveta.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy //gerekene kadar çalışmamasını oluşturulmamasını sağlar global olarak da tanımlanabilir böylece her sınıfa olur
public class TrackCoach implements ICoach {
    public TrackCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Track Coach";
    }
}
