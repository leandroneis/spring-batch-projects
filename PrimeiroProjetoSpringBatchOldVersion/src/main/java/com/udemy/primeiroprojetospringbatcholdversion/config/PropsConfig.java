package com.udemy.primeiroprojetospringbatcholdversion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class PropsConfig {
    @Bean
    public PropertySourcesPlaceholderConfigurer config(){
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setLocations(new FileSystemResource("F:\\Programacao\\Udemy\\Giuliana\\SpringBatch\\primeirojobspringbatchConfiguracao\\application.properties"));
        return configurer;
    }
}
