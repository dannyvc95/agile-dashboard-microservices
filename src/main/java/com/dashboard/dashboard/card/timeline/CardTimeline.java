package com.dashboard.dashboard.card.timeline;

import javax.persistence.*;

@Entity
@Table
public class CardTimeline {

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

    @Column
    private String timestamp;

    @Column
    private String description;

    @Column
    private String userId;

    public CardTimeline(Long id, String timestamp, String description, String userId) {
        this.id = id;
        this.timestamp = timestamp;
        this.description = description;
        this.userId = userId;
    }

    public CardTimeline(String timestamp, String description, String userId) {
        this.timestamp = timestamp;
        this.description = description;
        this.userId = userId;
    }

    public CardTimeline() {
    }

    public Long getId() {
        return id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getDescription() {
        return description;
    }

    public String getUserId() {
        return userId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "CardPriority{" +
                "id=" + id +
                ", timestamp='" + timestamp + '\'' +
                ", description='" + description + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
