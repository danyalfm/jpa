package com.uabc.database.example.examplejpa.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/*public static void main(String[] args) {
SpringApplication.run(ExamplejpaApplication.class, args);
}*/
@SpringBootApplication
public class JpaApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JpaApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(JpaApplication.class, args);
    }

}
