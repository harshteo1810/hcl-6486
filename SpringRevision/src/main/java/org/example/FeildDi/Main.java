package org.example.FeildDi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Employee emp = context.getBean(Employee.class);

        System.out.println(emp.displayAddress());

        context.close();
    }
}