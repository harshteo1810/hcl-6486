package org.abes.hcl_hrms.repository;
import org.abes.hcl_hrms.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo {
    String addEmp(Employee employee);
    String addEmpInBulk (List<Employee> empBulk);
    List<Employee> getEmp();
    Employee getEmpById(long emp_id);
    String deleteById(long emp_id);
    String updateById(long emp,Employee updatedEmp);



}
