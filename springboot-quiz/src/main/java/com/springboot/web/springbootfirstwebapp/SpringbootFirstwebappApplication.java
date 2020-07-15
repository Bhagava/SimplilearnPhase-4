package com.springboot.web.springbootfirstwebapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dao.MyRepo;
import com.springboot.web.model.Quiz;

@SpringBootApplication
@ComponentScan("com.springboot.web")
@EntityScan(basePackages = "com")
@EnableJpaRepositories(basePackages = "com")

public class SpringbootFirstwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstwebappApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(MyRepo repo) {
		repo.save(new Quiz(1, "Who is the defence minister in India", "RajNadh Singh","Nithin Gadgari","Arun Gokule","Nirmala SitaRaman","RajNadh Singh"));
		repo.save(new Quiz(2,"calculate 2+2", "4","1","2","3","4"));
		repo.save(new Quiz(3, "who is the FIRST prime minister of india", "Jawaharlal Nehru","Narendra Modi","Jawaharlal Nehru","Sarvepalli Rada Krishnan",
				"V.V giri"));
		repo.save(new Quiz(4, "who is the RBI governer", "Sakthi kanta Das","Nimala Sitsraman","P.Chitambaram","Sakthi kanta Das",
				"D.Subbarao"));
		repo.save(new Quiz(5,"calculate 2-2", "0","0","1","2","3"));
		repo.save(new Quiz(6, "How many states are present in india", "29","27","28","29","30"));
		return null;
	}
}
