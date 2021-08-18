package com.dashboard.dashboard.card.type;

import javax.persistence.*;

@Entity
@Table
public class CardType {

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
    private String type;

    public CardType(String type) {
        this.type = type;
    }

    public CardType() {
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CardType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
