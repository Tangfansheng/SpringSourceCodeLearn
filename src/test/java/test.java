import com.ordo.aop.MathDiv;
import com.ordo.bean.Person;
import com.ordo.config.*;
import com.ordo.dao.BookDao;
import com.ordo.entity.Boss;
import com.ordo.ext.ExtConfig;
import com.ordo.proxy.IPerson;
import com.ordo.proxy.Man;
import com.ordo.proxy.NormalHandler;
import com.ordo.resource.JdbcProperties;
import com.ordo.service.BookService;
import com.ordo.service.RegisterService;
import com.ordo.tx.UserService;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;


public class test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("IOC容器创建完成...");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(String name : beanDefinitionNames){
            System.out.println(name);
        }
        Object person = context.getBean("person");
    }

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("IOC容器创建完成...");

//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for(String name : beanDefinitionNames){
//            System.out.println(name);
//        }

//        System.out.println("-------分割线-------");

//        Object getPerson1 = context.getBean("bluePerson");
//        System.out.println(getPerson1);
        RegisterService service = context.getBean(RegisterService.class);
        service.register("momo");
        context.close();
        System.out.println("Ioc容器关闭");
    }

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config2.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(String s : beanDefinitionNames){
            System.out.println(s);
        }
        Map<String, Person> beansOfType = context.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }

    @Test
    public void testLifeCycle(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigOfLifeCycle.class);
        Object blue = context.getBean("blue");
        Object blue1 = context.getBean("blue");
        System.out.println(blue==blue1);
        context.close();
    }
    @Test
    public void testAutowired(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConfigOfAutowire.class);
        BookService bean = annotationConfigApplicationContext.getBean(BookService.class);
        bean.print();
        BookDao dao1 = (BookDao) annotationConfigApplicationContext.getBean("bookdao");
        System.out.println(dao1);
        System.out.println(bean);
    }

    @Test
    public void testOfAop(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConfigOfAOP.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        MathDiv div = (MathDiv) annotationConfigApplicationContext.getBean("div");
        div.div(1,1);

    }

    @Test
    public void testOfTX(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigOfTx.class);
        UserService bean = context.getBean(UserService.class);
        bean.insert();
    }

    @Test
    public void testOfExt(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExtConfig.class);

        context.close();
    }
    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("dao.xml", "service.xml");
        String[] names = context.getBeanDefinitionNames();
        for(String n: names){
            System.out.println(n);
        }
    }
    @Test
    public void testJdkProxy(){
        IPerson man = new Man();
        IPerson proxyMan = (IPerson) new NormalHandler().getInstance(man);
        proxyMan.say();
    }

    @Test
    public void TestModuleImport(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ModuleConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        Boss bean = context.getBean(Boss.class);
        System.out.println(bean);

    }
    @Test
    public void TestOfPropertyRead(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcPropertiesConfiguration.class);
        System.out.println(ctx.getBean(JdbcProperties.class).toString());
    }

    @Test
    public void TestOfBeanDefinitionRegistry(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanDefinitionRegistryConfiguration.class);
        System.out.println(context.getBean(Person.class));
        BeanDefinition beanDefinition = context.getBeanDefinition("person");
        System.out.println(beanDefinition);

    }

}
