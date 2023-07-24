package com.fiveta.springcoredemo.rest;

import com.fiveta.springcoredemo.common.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private ICoach myCoach;


    //constructor yapılırken autowired kullanılır tek constructor varsa olmasa da olur
  /*  @Autowired
    public DemoController (ICoach theCoach){
        myCoach=theCoach;
    }*/


    //ICoach interface i sadece bir sınıfı implement etseydi aşağıdaki gibi kullanılabilirdi
    /*
    @Autowired
    public void DemoController(ICoach theCoach){
        myCoach = theCoach;
    }*/


    //birden fazla sınıfı implemente ettiği için aşağıdaki gibi kullanılır ve sınıfın ilk harfi küçük olur
   /* @Autowired
    public void DemoController(@Qualifier("baseballCoach") ICoach theCoach){
        myCoach = theCoach;
    }*/


    //Birden fazla sınıfı implemente ettiği için normalde hata verirdi ancak implemente edilen sınıflardan
    //sadece birini primary sınıf olarak tanımladığımız zaman onu alır
    @Autowired
    public void DemoController(@Qualifier("cricketCoach") ICoach theCoach){
        myCoach = theCoach;
    }



    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
