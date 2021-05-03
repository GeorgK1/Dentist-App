package com.cgi.dentistapp;

import com.cgi.dentistapp.repository.EntityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DentistAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DentistAppApplication.class, args);
    }

}
