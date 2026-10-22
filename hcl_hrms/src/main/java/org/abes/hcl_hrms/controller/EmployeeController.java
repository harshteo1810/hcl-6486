package org.abes.hcl_hrms.controller;

import org.abes.hcl_hrms.EmployeeServiceImp;
import org.abes.hcl_hrms.entity.Employee;
import org.abes.hcl_hrms.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServiceImp employeeServiceImp;
    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/")
    public String welcomeMsg(){
        return "Welcome to HRMS";
    }
    @GetMapping("/addEmp")
    public String addNewEmployee(){
        return employeeServiceImp.addEmp();
    }
    @GetMapping("/getEmp")
    public List<Employee> getEmp(){
        return employeeRepo.getEmp();
    }
    @GetMapping("/getEmpById")
    public Employee getEmpById(){
        return employeeServiceImp.getEmpById();
    }
    @GetMapping("/Empbulk")
    public String addEmpInBulk(){
        return employeeServiceImp.addEmpBulk();
    }
}
