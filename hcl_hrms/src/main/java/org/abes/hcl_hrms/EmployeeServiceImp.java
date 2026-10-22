package org.abes.hcl_hrms;

import org.abes.hcl_hrms.entity.Employee;
import org.abes.hcl_hrms.repository.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImp {
    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImp(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public String addEmp(){
        Employee emp1 = new Employee(2000,"Kamal","FSD","Java","prog@java.com");
        return employeeRepo.addEmp(emp1);
    }
    public String addEmpBulk(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(2001,"Kamla","FSD","Java","prog@java.com"));
        employeeList.add(new Employee(2002,"Kamli","Backend","Java","back@java.com"));
        employeeList.add(new Employee(2003,"Karan","Frontend","React","front@react.com"));
        employeeList.add(new Employee(2004,"Sharan","ML","Python","ml@py.com"));
        return employeeRepo.addEmpInBulk(employeeList);
    }
    public Employee getEmpById(){
        return employeeRepo.getEmpById(2000);
    }
}
