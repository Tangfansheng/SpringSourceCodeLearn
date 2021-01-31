package registry;

import com.ordo.bean.Person;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class PersonRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        //手动注册一个Bean
        registry.registerBeanDefinition("person", BeanDefinitionBuilder.genericBeanDefinition(Person.class).
                addPropertyValue("name", "zhangsan").getBeanDefinition());
    }
}
