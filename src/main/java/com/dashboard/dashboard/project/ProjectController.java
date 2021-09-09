package com.dashboard.dashboard.project;

import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(path = "/project")
public class ProjectController {

    private ProjectService projectService;

    public ProjectController(ProjectService projectService){this.projectService = projectService;}

    @GetMapping
    public List<Project> getProjects() {return projectService.getProjects();}

    @PutMapping(path = "/add")
    public Project addProject(@NotNull @RequestBody Project project){return projectService.addProject(project);}

    @DeleteMapping(path = "/delete/{id}")
    public void deleteProject(@NotNull @PathVariable("id") Long id){projectService.deleteProject(id);}

    @PostMapping(path = "/update")
    public Project updateProject(@NotNull @RequestBody Project project){return projectService.updateProject(project);}
}
