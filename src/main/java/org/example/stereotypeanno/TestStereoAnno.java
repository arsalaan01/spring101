package org.example.stereotypeanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereoAnno {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-stereotype-annotations.xml");
        Register register = context.getBean("register", Register.class);
        System.out.println(register);
    }
}
