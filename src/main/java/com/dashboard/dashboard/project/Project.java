package com.dashboard.dashboard.project;

import javax.persistence.*;

@Entity
@Table
public class Project {
    @Id
    @Column
    @SequenceGenerator(
            name = "projectSequence",
            sequenceName = "projectSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "projectSequence"
    )
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String currentSprint;

    public Project(Long id, String name, String description, String currentSprint) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.currentSprint = currentSprint;
    }

    public Project(String name, String description, String currentSprint) {
        this.name = name;
        this.description = description;
        this.currentSprint = currentSprint;
    }

    public Project(){
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCurrentSprint() {
        return currentSprint;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCurrentSprint(String currentSprint) {
        this.currentSprint = currentSprint;
    }

    @Override
    public java.lang.String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", currentSprint='" + currentSprint + '\'' +
                '}';
    }
}
