package org.example;

import org.example.autowirewithxml.TestAutowire;
import org.example.xmlconf.CollectionsInjector;
import org.example.xmlconf.Employee;
import org.example.xmlconf.PropertiesInjector;
import org.example.xmlconf.Records;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-xml-conf.xml",
        "spring-autowire-xml-conf.xml"});
        Employee emp = (Employee) context.getBean("emp3", Records.class);

//        printing the emp bean
        System.out.println(emp);
        emp.printRole();
        CollectionsInjector collectionsInjector = context.getBean("cInject1", CollectionsInjector.class);
        System.out.println(collectionsInjector);

        PropertiesInjector propertiesInjector = context.getBean("myBean", PropertiesInjector.class);
        System.out.println(propertiesInjector);

        TestAutowire testAutowire = context.getBean("testAutowire", TestAutowire.class);
        System.out.println(testAutowire);


    }
}