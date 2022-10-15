package com.blitzstriker.projectmanagement.services;

import com.blitzstriker.projectmanagement.dto.ChartData;
import com.blitzstriker.projectmanagement.entities.Project;
import com.blitzstriker.projectmanagement.repositories.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService{

    private final ProjectRepository projectRepository;
    @Override
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public List<ChartData> getProjectStatus() {
        return projectRepository.findProjectStatus();
    }
}
