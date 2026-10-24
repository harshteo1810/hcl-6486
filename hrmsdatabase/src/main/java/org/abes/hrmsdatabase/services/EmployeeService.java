package org.abes.hrmsdatabase.services;

import org.abes.hrmsdatabase.model.Employee;
import org.abes.hrmsdatabase.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepository;

    public String createNewEmployee(){
        Employee emp1 = new Employee(2000,"Ram","Java","FSD");
        employeeRepository.save(emp1);
        return "Employee Added Successfully";
    }
    public List<Employee> addAllEmployee(){
        List<Employee> emplist = new ArrayList<>();
        emplist.add(new Employee(2001,"Ramesh","Java","FSD"));
        emplist.add(new Employee(2002,"Raju","C++","GD"));
        emplist.add(new Employee(2003,"Gopal","C","Sf"));
        emplist.add(new Employee(2004,"Bal","Python","ML"));
        emplist.add(new Employee(2005,"Jaggoo","Java","MG"));
        employeeRepository.saveAll(emplist);
        return emplist;
    }
    public List<Employee> showEmployee(){
        List<Employee> emp = employeeRepository.findAll();
        return emp;
    }
    public Employee getEmployeeId(long empId){
        return employeeRepository.findById(empId).orElse(null);
    }
    public String updateEmployeeID(long empId){
        Employee getId = getEmployeeId(empId);
        if(getId==null){
            return "Employee not found";
        }
        getId.setDesignation("Manager");
        employeeRepository.save(getId);
        return "Employee updated with Id " + getId;
    }
    public String deleteById(long empId) {
        Employee emp = getEmployeeId(empId);
        if (emp == null) {
            return "Employee not found";
        }
        employeeRepository.deleteById(empId);
        return "Employee deleted with ID " + empId;
    }
}
