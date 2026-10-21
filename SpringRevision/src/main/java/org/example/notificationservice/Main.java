package org.example.notificationservice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean(Student.class);
        Student student1 = context.getBean(Student.class);

        System.out.println("Student 1: " + student.hashCode());
        System.out.println("Student 2: " + student1.hashCode());


        student.notifyStudent();
        student1.notifyStudent();

        context.close();
    }
}