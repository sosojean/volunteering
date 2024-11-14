package com.inha.volunteer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//@EnableJpaRepositories(basePackages = "com.inha.volunteer")
@SpringBootApplication
public class VolunteerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VolunteerApplication.class, args);
    }

}

