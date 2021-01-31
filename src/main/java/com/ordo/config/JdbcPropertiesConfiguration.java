package com.ordo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.ordo.resource")
@PropertySource("classpath:jdbc.properties")
public class JdbcPropertiesConfiguration {

}
