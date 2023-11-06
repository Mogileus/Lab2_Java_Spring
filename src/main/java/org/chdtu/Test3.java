package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Library library = context.getBean("myLibrary", Library.class);
        Person person = new Person(library);
        person.YourOrder();

        Person person1 = context.getBean("myPerson", Person.class);
        System.out.println(person1.getSurname());
        System.out.println(person1.getAge());

        context.close();
    }
}
