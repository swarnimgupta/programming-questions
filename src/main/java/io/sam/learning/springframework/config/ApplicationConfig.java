package io.sam.learning.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "io.sam.learning.springframework")
public class ApplicationConfig {

    @Bean(name = "test")
    public String getTestMessage() {
        return "Test";
    }

}
