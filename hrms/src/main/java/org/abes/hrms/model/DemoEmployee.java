package org.abes.hrms.model;

import org.abes.hrms.repository.EmpRepImp;
import org.abes.hrms.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoEmployee {
    @Autowired
    private EmpRepImp empRepo;
    public int add(int a, int b){
        return a+b;
    }
    public double sqrt(double a){
        return empRepo.squareRoot(a);
    }
    public int grt(int a,int b){
        return empRepo.greater(a,b);
    }
}
