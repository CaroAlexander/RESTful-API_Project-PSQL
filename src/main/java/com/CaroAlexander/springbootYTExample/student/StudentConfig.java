package com.CaroAlexander.springbootYTExample.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student alex = new Student(
                    "Alexander",
                    "yatobarcaro@gmail.com",
                    LocalDate.of(1996, Month.MARCH, 12)
            );
            Student yair = new Student(
                    "Yair",
                    "yatobarc@udistrital.edu.co",
                    LocalDate.of(1974, Month.DECEMBER, 23)
            );
            repository.saveAll(
                    List.of(alex,yair)
            );

        } ;
    }

}
