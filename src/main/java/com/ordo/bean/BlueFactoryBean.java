package com.ordo.bean;

import com.ordo.entity.colors.Blue;
import org.springframework.beans.factory.FactoryBean;

public class BlueFactoryBean implements FactoryBean<Blue> {
    volatile Blue blue;
    @Override
    public Blue getObject() throws Exception {
        if(blue == null){
            synchronized (blue){
                if(blue == null){
                    blue = new Blue();
                }
            }
        }
        return blue;
    }

    @Override
    public Class<?> getObjectType() {
        return Blue.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
