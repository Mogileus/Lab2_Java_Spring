package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Cat myCat = context.getBean("cat", Cat.class);
        myCat.say();
        Cat yourCat = context.getBean("cat", Cat.class);

        System.out.println("Змінні посилаються на один і той обєкт? " + (myCat == yourCat));
        System.out.println(myCat);
        System.out.println(yourCat);

        context.close();
    }
}
