package com.ordo.listener;

import com.ordo.listener.event.RegisterSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderListener {
    @Order(3)
    @EventListener
    public void onRegisterSuccess(RegisterSuccessEvent event){
        System.out.println("发送站内信息");
    }

}
