package com.blitzstriker.projectmanagement.services;

import com.blitzstriker.projectmanagement.dto.ChartData;
import com.blitzstriker.projectmanagement.entities.Project;

import java.util.List;

public interface ProjectService {
    Project createProject(Project project);

    List<Project> getAllProjects();

    List<ChartData> getProjectStatus();
}
