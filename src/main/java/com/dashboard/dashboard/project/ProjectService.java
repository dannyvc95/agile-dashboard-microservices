package com.dashboard.dashboard.project;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public  ProjectService(ProjectRepository projectRepository){this.projectRepository = projectRepository;}

    public List<Project> getProjects(){return projectRepository.findAll();}

    public Project addProject(Project project){return projectRepository.save(project);}

    public void deleteProject(Long id){projectRepository.deleteById(id);}

    public Project updateProject(Project project){
        Optional<Project> current = projectRepository.findById(project.getId());
        return projectRepository.save(project);
    }
}
