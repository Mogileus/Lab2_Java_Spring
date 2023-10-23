package org.chdtu;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    //@ComponentScan("org.chdtu")
    @Bean
    @Scope("singleton")
    public Pet catBean(){
//        System.out.println("Create bean");
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
