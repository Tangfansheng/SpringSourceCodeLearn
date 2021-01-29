package service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
     private static Properties properties;
     private static Map<String, Object> cache;
     static {
         properties = new Properties();
         cache = new HashMap<>();
         try {
             properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
         } catch (IOException e) {
             e.printStackTrace();
         }

     }
     public static Object getBean(String beanName){
         if(!cache.containsKey(beanName)){
             synchronized (cache){
                 if(!cache.containsKey(beanName)){
                     try {
                         Class<?> BeanClazz =  Class.forName(properties.getProperty(beanName));
                         Object bean = BeanClazz.newInstance();
                         cache.put(beanName, bean);
                     } catch (Exception e) {
                         e.printStackTrace();
                     }
                 }
             }
         }

         return cache.get(beanName);
     }

}
