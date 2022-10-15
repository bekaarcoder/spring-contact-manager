package com.blitzstriker.projectmanagement.repositories;

import com.blitzstriker.projectmanagement.dto.ChartData;
import com.blitzstriker.projectmanagement.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    @Query(nativeQuery = true, value = "select stage as label, count(*) as count from project group by stage")
    List<ChartData> findProjectStatus();
}
