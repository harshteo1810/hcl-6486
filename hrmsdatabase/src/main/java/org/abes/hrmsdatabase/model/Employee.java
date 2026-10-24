package org.abes.hrmsdatabase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private long id;
    private String name;
    private String stack;
    private String designation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Employee(long id, String name, String stack, String designation) {
        this.id = id;
        this.name = name;
        this.stack = stack;
        this.designation = designation;
    }
    public Employee(){

    }
}
