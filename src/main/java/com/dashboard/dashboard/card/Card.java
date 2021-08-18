package com.dashboard.dashboard.card;

import javax.persistence.*;

@Entity
@Table
public class Card {

    @Id
    @Column
    @SequenceGenerator(
            name = "cardStatusSequence",
            sequenceName = "cardStatusSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cardStatusSequence"
    )
    private Long id;

    @Column (unique = true)
    private String typeId;

    @Column (unique = true)
    private String description;

    @Column (unique = true)
    private String owner; /* Shouldn't this be userId?*/

    @Column
    private String sprint;

    @Column (unique = true)
    private String creation_date;

    @Column (unique = true)
    private String estimated_time;

    @Column (unique = true)
    private String spent_time;

    @Column (unique = true)
    private Integer points;

    @Column
    private Long timelineId;

    @Column
    private Long statusId;

    @Column
    private Long projectId;

    @Column (unique = true)
    private Long priorityID;

    public Card(Long id, String typeId, String description, String owner, String sprint, String creation_date, String estimated_time, String spent_time, Integer points, Long timelineId, Long statusId, Long projectId, Long priorityID) {
        this.id = id;
        this.typeId = typeId;
        this.description = description;
        this.owner = owner;
        this.sprint = sprint;
        this.creation_date = creation_date;
        this.estimated_time = estimated_time;
        this.spent_time = spent_time;
        this.points = points;
        this.timelineId = timelineId;
        this.statusId = statusId;
        this.projectId = projectId;
        this.priorityID = priorityID;
    }

    public Card(String typeId, String description, String owner, String sprint, String creation_date, String estimated_time, String spent_time, Integer points, Long timelineId, Long statusId, Long projectId, Long priorityID) {
        this.typeId = typeId;
        this.description = description;
        this.owner = owner;
        this.sprint = sprint;
        this.creation_date = creation_date;
        this.estimated_time = estimated_time;
        this.spent_time = spent_time;
        this.points = points;
        this.timelineId = timelineId;
        this.statusId = statusId;
        this.projectId = projectId;
        this.priorityID = priorityID;
    }

    public Card() {
    }

    public Long getId() {
        return id;
    }

    public String getTypeId() {
        return typeId;
    }

    public String getDescription() {
        return description;
    }

    public String getOwner() {
        return owner;
    }

    public String getSprint() {
        return sprint;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public String getEstimated_time() {
        return estimated_time;
    }

    public String getSpent_time() {
        return spent_time;
    }

    public Integer getPoints() {
        return points;
    }

    public Long getTimelineId() {
        return timelineId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public Long getPriorityID() {
        return priorityID;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String typeId) {
        this.typeId = typeId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setSprint(String sprint) {
        this.sprint = sprint;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public void setEstimated_time(String estimated_time) {
        this.estimated_time = estimated_time;
    }

    public void setSpent_time(String spent_time) {
        this.spent_time = spent_time;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public void setTimelineId(Long timelineId) {
        this.timelineId = timelineId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public void setPriorityID(Long priorityID) {
        this.priorityID = priorityID;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", type='" + typeId + '\'' +
                ", description='" + description + '\'' +
                ", owner='" + owner + '\'' +
                ", sprint='" + sprint + '\'' +
                ", creation_date='" + creation_date + '\'' +
                ", estimated_time='" + estimated_time + '\'' +
                ", spent_time='" + spent_time + '\'' +
                ", points=" + points +
                ", timelineId=" + timelineId +
                ", statusId=" + statusId +
                ", projectId=" + projectId +
                ", priorityID=" + priorityID +
                '}';
    }
}
