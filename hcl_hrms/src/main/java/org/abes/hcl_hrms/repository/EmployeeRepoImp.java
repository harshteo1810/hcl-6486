package org.abes.hcl_hrms.repository;

import org.abes.hcl_hrms.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class EmployeeRepoImp implements EmployeeRepo{
    List<Employee> employeeList = new ArrayList<>();
    @Override
    public String addEmp(Employee employee) {
        employeeList.add(employee);
        return "Employee Added successfully";
    }

    @Override
    public String addEmpInBulk(List<Employee> empBulk) {
        employeeList.addAll(empBulk);
        return "Employee Added in Bulk";
    }

    @Override
    public List<Employee> getEmp() {
        return employeeList;
    }

    @Override
    public Employee getEmpById(long emp_id) {
        return employeeList.stream().filter(e->e.getEmp_id()==emp_id).
                findFirst().orElse(null);
    }

    @Override
    public String deleteById(long emp_id) {
        return "";
    }

    @Override
    public String updateById(long emp, Employee updatedEmp) {
        return "";
    }
}
