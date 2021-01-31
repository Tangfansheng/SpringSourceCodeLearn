package com.ordo.config;

import com.ordo.entity.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
    @Bean
    public Bar bbb(){
        return new Bar();
    }
}
