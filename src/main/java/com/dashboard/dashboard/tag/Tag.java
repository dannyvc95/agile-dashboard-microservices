package com.dashboard.dashboard.tag;

import javax.persistence.*;

@Entity
@Table
public class Tag {

    @Id
    @Column
    @SequenceGenerator(
            name = "userSequence",
            sequenceName = "userSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "userSequence"
    )
    private Long id;

    @Column(unique = true)
    private String name;

    @Column
    private String description;

    public Tag(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Tag(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Tag() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
