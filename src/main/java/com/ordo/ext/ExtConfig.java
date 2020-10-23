package com.ordo.ext;

import com.ordo.entity.colors.Blue;

import com.ordo.tx.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(UserService.class)
@ComponentScan({"com.ordo.ext"})
@Configuration
public class ExtConfig {

    @Bean
    public Blue getBlue(){
        return new Blue();
    }

}
