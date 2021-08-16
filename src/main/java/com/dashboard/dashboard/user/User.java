package com.dashboard.dashboard.user;

import javax.persistence.*;

@Entity
@Table
public class User {

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

    @Column
    private String email;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private String password;

    @Column
    private Long tagId;

    public User(Long id, String email, String name, String lastName, String password, Long tagId) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.tagId = tagId;
    }

    public User(String email, String name, String lastName, String password, Long tagId) {
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.tagId = tagId;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", tagId=" + tagId +
                '}';
    }
}
