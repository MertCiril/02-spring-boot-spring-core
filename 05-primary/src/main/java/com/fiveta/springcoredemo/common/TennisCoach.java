package com.fiveta.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //bu sınıfın ICoach interfaceini implemente eden sınıflar içinde önceliği olduğunu belirledik
public class TennisCoach implements ICoach{
    @Override
    public String getDailyWorkout() {
        return "Tennis Coach";
    }
}
