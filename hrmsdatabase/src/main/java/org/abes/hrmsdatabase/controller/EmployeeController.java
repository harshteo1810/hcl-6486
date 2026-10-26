package org.abes.hrmsdatabase.controller;

import org.abes.hrmsdatabase.model.Employee;
import org.abes.hrmsdatabase.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/")
    public String msg(){
        return "<h1> Welcome to HRMS</h1>";
    }
    @GetMapping("/addEmp")
    public String addEmp(){
        return employeeService.createNewEmployee();
    }
    @GetMapping("/addEmpls")
    public List<Employee> addEmpls(){
        return employeeService.addAllEmployee();
    }
    @GetMapping("/getEmp")
    public List<Employee> getEmp(){
        return employeeService.showEmployee();
    }
    @GetMapping("/findId/{empId}")
    public Object getEmpById(@PathVariable long empId){

        Employee ID = employeeService.getEmployeeId(empId);
        if (ID == null) {
            return "Employee doesn't exist";
        }
        return ID;
    }
    @PutMapping("/updateById/{empId}")
    public String updateById(@PathVariable long empId){
        return employeeService.updateEmployeeID(empId);
    }
    @DeleteMapping("/deleteById/{empId}")
    public String deleteEmp(@PathVariable long empId) {
        return employeeService.deleteById(empId);
    }
}
