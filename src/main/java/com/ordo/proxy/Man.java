package com.ordo.proxy;

import sun.rmi.runtime.Log;

public class Man  implements IPerson{
    private IPerson person;


    public Man setTarget(IPerson person){
        this.person = person;
        return this;
    }

    public void say() {
        if(person != null){
            //do sth.
            person.say();
            //do sth.
        }
    }
}
