package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Cat myCat = context.getBean("myPet", Cat.class);
        myCat.say();

        context.close();
    }
}
