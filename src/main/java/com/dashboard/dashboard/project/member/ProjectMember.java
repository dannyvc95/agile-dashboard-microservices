package com.dashboard.dashboard.project.member;

import javax.persistence.*;

@Entity
@Table
public class ProjectMember {

    @Id
    @Column
    @SequenceGenerator(
            name = "projectMemberSequence",
            sequenceName = "projectMemberSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "projectMemberSequence"
    )
    private Long id;

    @Column
    private String email;

    @Column
    private String project;

    public ProjectMember(String email, String project) {
        this.email = email;
        this.project = project;
    }

    public ProjectMember(Long id, String email, String project) {
        this.id = id;
        this.email = email;
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getProject() {
        return project;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
