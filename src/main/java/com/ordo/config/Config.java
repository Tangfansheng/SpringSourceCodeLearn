package com.ordo.config;

import com.ordo.bean.Person;
import com.ordo.entity.colors.Blue;
import com.ordo.filter.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
//@ComponentScan(value = "com.ordo", excludeFilters ={
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class, Repository.class}),
////        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyFilter.class})
//})
@Import({Blue.class})

public class Config {
    @Scope("singleton")
    @Bean("person")
    @Lazy
    public Person getPerson1(){
        System.out.println("从容器中拿bean...");
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
