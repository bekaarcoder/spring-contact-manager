package com.blitzstriker.projectmanagement.services;

import com.blitzstriker.projectmanagement.dto.EmployeeProject;
import com.blitzstriker.projectmanagement.entities.Employee;
import com.blitzstriker.projectmanagement.entities.Project;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    List<EmployeeProject> getEmployeesWithProjects();
}
