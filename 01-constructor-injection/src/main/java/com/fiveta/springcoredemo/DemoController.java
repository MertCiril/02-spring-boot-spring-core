package com.fiveta.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private ICoach myCoach;

    //constructor yapılırken autowired kullanılır tek constructor varsa olmasa da olur
    @Autowired
    public DemoController (ICoach theCoach){
        myCoach=theCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
