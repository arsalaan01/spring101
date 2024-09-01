package org.example.awannotation;
import org.example.xmlconf.Records;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-xml-conf.xml",
        "spring-autowire-annotation-conf.xml"});
        Employee emp = (Employee) context.getBean("empAnno", Records.class);
        System.out.println(emp);

    }
}