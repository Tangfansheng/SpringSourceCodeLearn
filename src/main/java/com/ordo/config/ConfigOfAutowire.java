package com.ordo.config;

import com.ordo.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@ComponentScan(value = {"com.ordo.dao", "com.ordo.service", "com.ordo.controller"})
public class ConfigOfAutowire {
    @Bean("bookdao")
//    @DependsOn("book")
    public BookDao getBookDao(){
        return new BookDao();
    }
}
