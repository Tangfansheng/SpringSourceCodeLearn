package com.ordo.config;


import com.ordo.aop.LogsAspect;
import com.ordo.aop.MathDiv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy//开启注解的AOP:最重要的一步
@Configuration
public class ConfigOfAOP {

    @Bean("div")
    public MathDiv getMathDiv(){
        return new MathDiv();
    }

    @Bean
    public LogsAspect getLog(){
        return new LogsAspect();
    }




}
