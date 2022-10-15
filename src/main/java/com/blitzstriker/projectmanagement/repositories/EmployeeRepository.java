package com.blitzstriker.projectmanagement.repositories;

import com.blitzstriker.projectmanagement.dto.EmployeeProject;
import com.blitzstriker.projectmanagement.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query(nativeQuery = true, value = "select emp.first_name as firstName, emp.last_name as lastName, emp.email as email, count(employee_id) as projectCount from employee emp " +
            "left join project_employee pe on emp.id = pe.employee_id " +
            "group by emp.first_name, emp.last_name order by 4 desc")
    public List<EmployeeProject> employeeProjects();
}
