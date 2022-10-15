package com.blitzstriker.projectmanagement.controllers;

import com.blitzstriker.projectmanagement.dto.ChartData;
import com.blitzstriker.projectmanagement.dto.EmployeeProject;
import com.blitzstriker.projectmanagement.entities.Employee;
import com.blitzstriker.projectmanagement.entities.Project;
import com.blitzstriker.projectmanagement.services.EmployeeService;
import com.blitzstriker.projectmanagement.services.ProjectService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final ProjectService projectService;

    private final EmployeeService employeeService;

    @GetMapping("/")
    public String displayHome(Model model) {
        model.addAttribute("title", "Home");
        return "main/index";
    }

    @GetMapping("/home")
    public String displayProject(Model model) throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();

        List<Project> projects = projectService.getAllProjects();
        model.addAttribute("projects", projects);

        List<EmployeeProject> employees = employeeService.getEmployeesWithProjects();
        model.addAttribute("employees", employees);

        List<ChartData> projectData = projectService.getProjectStatus();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(projectData);
        model.addAttribute("projectStatusCount", jsonString);

        return "main/home";
    }
}
