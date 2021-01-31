package com.ordo.listener;

import com.ordo.listener.event.RegisterSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderListener implements ApplicationListener<RegisterSuccessEvent> {


    @Override
    @Order(1)
    public void onApplicationEvent(RegisterSuccessEvent event) {
        System.out.println(event.getName() + "发送邮件");
    }
}
