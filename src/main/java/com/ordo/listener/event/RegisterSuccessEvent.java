package com.ordo.listener.event;

import org.springframework.context.ApplicationEvent;

public class RegisterSuccessEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    private String username;
    public RegisterSuccessEvent(Object source) {
        super(source);
        this.username = source.toString();
    }

    public String getName(){
        return this.username;
    }

}
