package com.fiveta.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//bean scope'un default değeri singleton'dır ve bu sınıftan oluşan her bir değer için aynı bean'i tutar
//ancak scope değişip prototype yaptığımız zaman her eleman için ayrı bean tutar
//aynı beande tutuluyorsa(singleton) karşılaştırması(==) true, farklı ise (prototype) false gelir aynı nesneyi ifade etmez
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements ICoach {
    public CricketCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }
}
