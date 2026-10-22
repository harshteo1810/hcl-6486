package org.abes.hrms.repository;

import org.springframework.stereotype.Component;

@Component
public class EmpRepImp implements EmpRepo{

    @Override
    public double squareRoot(double d) {
        return Math.sqrt(d);
    }

    @Override
    public String empData(){
        return "";
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int greater(int a, int b) {
        return a>b?a:b;
    }
}
