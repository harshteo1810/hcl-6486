package org.abes.hrms.controller;

import org.abes.hrms.model.DemoEmployee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private DemoEmployee demoEmployee;
    EmployeeController(DemoEmployee demoEmployee){
        this.demoEmployee = demoEmployee;
    }
    @GetMapping("/") // we are using the GET Method of HTTP Protocol
    public String welcome(){
        return "<h2 style='color:red'>Welcome to HRMS App</h2>";
    }
    @GetMapping("/add")
    public int add(){
        System.out.println("Inside /add controller point");
        int result = demoEmployee.add(5,4);
        return result;
    }
    @GetMapping("/sqrt")
    public double sqrt(){
        return demoEmployee.sqrt(10);
    }
    @GetMapping("/grt")
    public int grt(){
        return  demoEmployee.grt(10,20);
    }
}
