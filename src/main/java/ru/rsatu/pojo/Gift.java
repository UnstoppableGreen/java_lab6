package ru.rsatu.pojo;

import javax.persistence.*;

@Entity
@Table(name="gift")
public class Gift {
    @Id
    @SequenceGenerator(name = "giftSeq", sequenceName = "gift_id_seq", allocationSize = 10, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "giftSeq")
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
