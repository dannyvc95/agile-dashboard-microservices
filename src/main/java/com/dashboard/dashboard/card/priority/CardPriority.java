package com.dashboard.dashboard.card.priority;

import javax.persistence.*;

@Entity
@Table
public class CardPriority {

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
    private String priority;

    public CardPriority(String priority) {
        this.priority = priority;
    }

    public CardPriority() {
    }

    public Long getId() {
        return id;
    }

    public String getPriority() {
        return priority;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "CardPriority{" +
                "id=" + id +
                ", priority='" + priority + '\'' +
                '}';
    }
}
