package com.ordo.conditions;

import com.ordo.entity.colors.Rainbow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        boolean red = registry.containsBeanDefinition("com.ordo.entity.colors.Red");
        boolean blue = registry.containsBeanDefinition("com.ordo.entity.colors.Blue");
        if(red&& blue){
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Rainbow.class);
            registry.registerBeanDefinition("rainbow", rootBeanDefinition);
        }
    }
}
