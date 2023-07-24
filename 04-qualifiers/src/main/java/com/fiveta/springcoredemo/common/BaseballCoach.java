package com.fiveta.springcoredemo.common;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements ICoach{
    @Override
    public String getDailyWorkout() {
        return "Baseball";
    }
}
