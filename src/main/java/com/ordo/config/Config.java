package com.ordo.config;

import com.ordo.bean.Person;
import com.ordo.entity.colors.Blue;
import com.ordo.service.RegisterService;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan(value = "com.ordo", excludeFilters ={
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class, Repository.class}),
////        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyFilter.class})
//})
@ComponentScan("com.ordo.listener")
@Import({Blue.class, RegisterService.class})

public class Config {
    @Scope("singleton")
    @Bean("person")
    @Lazy(value = false)
    public Person getPerson1(){
        System.out.println("getPerson1...");
        return new Person("momo",18);
    }

    @Bean
    public Person bluePerson(Blue blue){
        System.out.println("bluePerson construct...");
        Person person = new Person(blue);
        System.out.println("bluePerson constructed...");
        return person;
    }

    @Bean
    public Blue blue(){
        return new Blue();
    }
}
