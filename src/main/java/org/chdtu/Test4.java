package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml"/*, "applicationContext.xml"*/);
        //singleton
/*       Cat myCat = context.getBean("myPet", Cat.class);
        myCat.setName("Lucy");
        Cat yourCat = context.getBean("myPet", Cat.class);
        yourCat.setName("Stitch");

        System.out.println(myCat.getName());
        System.out.println(yourCat.getName());*/

/*        System.out.println("Змінні посилаються на один і той же обєкт? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);*/
        //singleton

        //prototype
/*        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Nika");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Juja");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());*/

/*        System.out.println("Змінні посилаються на один і той же обєкт? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);*/

        //prototype

        context.close();
    }
}
