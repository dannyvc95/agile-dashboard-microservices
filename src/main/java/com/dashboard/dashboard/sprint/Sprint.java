package com.dashboard.dashboard.sprint;

import javax.persistence.*;
import java.util.Date;

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

    @Column(unique = true)
    private String name;

    @Column
    private String project;

    @Column
    private Date startDate;

    public Sprint(String name, String project, Date start_date) {
        this.name = name;
        this.project = project;
        this.startDate = start_date;
    }

    public Sprint(Long id, String name, String project, Date start_date) {
        this.id = id;
        this.name = name;
        this.project = project;
        this.startDate = start_date;
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

    public Date getStartDate() {
        return startDate;
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

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}