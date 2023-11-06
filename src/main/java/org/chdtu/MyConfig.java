package org.chdtu;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Library catBean(){
        return new Magazine();
    }

    @Bean
    public Person personBean(){
        return new Person(magazineBean());
    }
}
