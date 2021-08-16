package com.dashboard.dashboard.card.status;

import javax.persistence.*;

@Entity
@Table
public class CardStatus {

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

    @Column(unique = true)
    private String status;

    public CardStatus(String status) {
        this.status = status;
    }

    public CardStatus() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CardStatus{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
