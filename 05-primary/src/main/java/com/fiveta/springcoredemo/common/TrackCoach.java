package com.fiveta.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "Track Coach";
    }
}
