package com.blitzstriker.projectmanagement.controllers;

import com.blitzstriker.projectmanagement.entities.Employee;
import com.blitzstriker.projectmanagement.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/new")
    public String displayEmployeeForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employees/new-employee";
    }

    @PostMapping("/save")
    public String createEmployee(Employee employee, Model model) {
        employeeService.createEmployee(employee);
        return "redirect:/employees/new";
    }

    @GetMapping
    public String displayEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "employees/list-employees";
    }
}
