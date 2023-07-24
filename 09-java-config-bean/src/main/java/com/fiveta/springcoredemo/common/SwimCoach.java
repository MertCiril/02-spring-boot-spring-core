package com.fiveta.springcoredemo.common;
//bu classı üçüncü taraf bir classmış gibi projeye dahil edeceğiz kaynak kodlarına erişemediğimizi varsayacağız
//o yüzden  @Component yok
public class SwimCoach implements ICoach{
    public SwimCoach(){
        System.out.println("In consturctor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 100 meters as a warm up";
    }
}
