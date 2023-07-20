package com.fiveta.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//yeni bir paket oluşturduk ve paketi ana dizin içerisinin dışında oluşturduğumuz
//için yeni oluşturulan paketin de görülmesi için aşağıdaki gibi tek tek paketleri
//yazmamız gerekiyor. Eğer util paketi springcoredemo paketi içerisinde olsaydı buna gerek olmayacaktı
/*@SpringBootApplication(
		scanBasePackages = {"com.fiveta.springcoredemo",
							"com.fiveta.util"}
)*/
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
