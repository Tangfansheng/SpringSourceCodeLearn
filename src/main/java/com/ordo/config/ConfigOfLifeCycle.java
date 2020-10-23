package com.ordo.config;

import com.ordo.entity.colors.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


public class ConfigOfLifeCycle {
    @Scope("prototype")
    @Bean(value = "blue", initMethod = "init", destroyMethod = "destroy")
    public Blue getBlue(){
        return new Blue();
    }
}
