package com.example.finapi.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class FeiConfiger {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
