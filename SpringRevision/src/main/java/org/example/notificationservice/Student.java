package org.example.notificationservice;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

    private final NotificationService notificationService;

    public Student(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyStudent() {
        notificationService.sendMsg("Your assessment is scheduled");
    }
    @PostConstruct
        public void init(){
            System.out.println("Object created");
        }
    @PreDestroy
        public void destroy(){
            System.out.println("Object destroyed");
        }
}