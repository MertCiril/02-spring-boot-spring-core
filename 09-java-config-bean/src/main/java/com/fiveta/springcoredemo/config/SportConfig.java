package com.fiveta.springcoredemo.config;

import com.fiveta.springcoredemo.common.ICoach;
import com.fiveta.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //yapılandırma sınıfı üçüncü taraf bir sınıfı dahil etmek için kullanılıyor
public class SportConfig {
    @Bean("herhangibirId")
    public ICoach swimCoach(){ //ilk harf küçük
        return new SwimCoach();
    }
}
