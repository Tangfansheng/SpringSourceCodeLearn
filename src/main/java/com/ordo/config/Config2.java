package com.ordo.config;

import com.ordo.bean.Person;
import com.ordo.conditions.*;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.MessageSourceSupport;
import org.springframework.stereotype.Controller;

//@Conditional({WindowCondition.class})
@Import({MyImportSelector.class, MyImportBeanDefinitionRegister.class})
public class Config2 {
    @Scope("singleton")
    @Bean
    @Lazy //只有在singleton下才生效
    public Person getPerson(){
        System.out.println("向容器中添加bean...");
        return new Person("fanfan", 25);
    }
    @Bean("bill")
    @Conditional({MSCondition.class})
    public Person getBillGates(){
        return new Person("Bill Gates", 62);
    }

    @Bean("linus")
    @Conditional(MacCondition.class)
    public Person getLinus(){
        return new Person(" Linux", 50);
    }


}
