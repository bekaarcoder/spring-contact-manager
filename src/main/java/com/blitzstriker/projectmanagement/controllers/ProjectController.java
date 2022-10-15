package com.blitzstriker.projectmanagement.controllers;

import com.blitzstriker.projectmanagement.entities.Employee;
import com.blitzstriker.projectmanagement.entities.Project;
import com.blitzstriker.projectmanagement.services.EmployeeService;
import com.blitzstriker.projectmanagement.services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService projectService;

    private final EmployeeService employeeService;

    @GetMapping("/new")
    public String displayProjectForm(Model model) {
        Project project = new Project();
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("project", project);
        model.addAttribute("allEmployees", allEmployees);
        return "projects/new-project";
    }

    @PostMapping("/save")
    public String createProject(Project project, @RequestParam List<Long> employees, Model model) {
        projectService.createProject(project);
        return "redirect:/projects";
    }

    @GetMapping
    public String displayProjects(Model model) {
        List<Project> projects = projectService.getAllProjects();
        model.addAttribute("projects", projects);
        return "projects/list-projects";
    }
}
