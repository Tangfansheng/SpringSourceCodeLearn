package com.ordo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import registry.PersonRegister;

@Configuration
@Import(PersonRegister.class)
public class BeanDefinitionRegistryConfiguration {

}
