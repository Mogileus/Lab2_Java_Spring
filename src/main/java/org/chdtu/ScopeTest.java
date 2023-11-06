package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Magazine myMagazine = context.getBean("magazine", Magazine.class);
        myMagazine.say();
        Magazine yourMagazine = context.getBean("magazine", Magazine.class);

        System.out.println("Змінні посилаються на один і той обєкт? " + (myMagazine == yourMagazine));
        System.out.println(myMagazine);
        System.out.println(yourMagazine);

        context.close();
    }
}
