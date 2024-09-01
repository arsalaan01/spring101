package org.example.spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class DemoMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "spring-spel.xml"});

        Demo d = context.getBean("demo", Demo.class);
        System.out.println(d);
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("23+50");
        System.out.println(expression.getValue());
    }
}
