package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Magazine myMagazine = context.getBean("myLibrary", Magazine.class);
        myMagazine.say();

        context.close();
    }
}
