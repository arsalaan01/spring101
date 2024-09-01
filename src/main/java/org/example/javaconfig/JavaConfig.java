package org.example.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.javaconfig")
public class JavaConfig {

    @Bean
    public Marks getMarks() {
        Marks marks = new Marks();
        return marks;
    }

    @Bean
    public StudentWithBean getStudent() {
        System.out.println("@Bean getting used");
        StudentWithBean student = new StudentWithBean(getMarks());
        return student;
    }
}
