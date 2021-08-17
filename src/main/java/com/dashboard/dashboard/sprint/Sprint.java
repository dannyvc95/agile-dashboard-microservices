package com.dashboard.dashboard.sprint;

import javax.persistence.*;
import javax.xml.crypto.Data;

@Entity
@Table
public class Sprint {

    @Id
    @Column
    @SequenceGenerator(
            name = "sprintSequence",
            sequenceName = "sprintSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sprintSequence"
    )
    private Long id;

    @Column
    private String name;

    @Column
    private String project;

    @Column
    private Data start_date;

    public Sprint(String name, String project, Data start_date) {
        this.name = name;
        this.project = project;
        this.start_date = start_date;
    }

    public Sprint(Long id, String name, String project, Data start_date) {
        this.id = id;
        this.name = name;
        this.project = project;
        this.start_date = start_date;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProject() {
        return project;
    }

    public Data getStart_date() {
        return start_date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void setStart_date(Data start_date) {
        this.start_date = start_date;
    }
}