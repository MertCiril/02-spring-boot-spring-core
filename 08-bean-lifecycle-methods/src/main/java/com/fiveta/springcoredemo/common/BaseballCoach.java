package com.fiveta.springcoredemo.common;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements ICoach{
    public BaseballCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Baseball";
    }
}
