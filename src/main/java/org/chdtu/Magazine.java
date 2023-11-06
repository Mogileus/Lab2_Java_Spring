package org.chdtu;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Magazine implements Library{

    @PostConstruct
    public void init(){
        System.out.println("Class Magazine: init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class Magazine: destroy method");
    }

    public Magazine() {
        System.out.println("Magazine bean is created");
    }
    public void say() {
        System.out.println("magazine");
    }
}
