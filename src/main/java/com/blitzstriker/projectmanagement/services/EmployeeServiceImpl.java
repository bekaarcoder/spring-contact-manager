package com.blitzstriker.projectmanagement.services;

import com.blitzstriker.projectmanagement.dto.EmployeeProject;
import com.blitzstriker.projectmanagement.entities.Employee;
import com.blitzstriker.projectmanagement.entities.Project;
import com.blitzstriker.projectmanagement.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public List<EmployeeProject> getEmployeesWithProjects() {
        return employeeRepository.employeeProjects();
    }

}
