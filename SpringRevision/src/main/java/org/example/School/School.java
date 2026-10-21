package org.example.School;

import org.example.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
    @Autowired
    Student st;

    public void studentName(){
        System.out.println(st.getName());
    }
}