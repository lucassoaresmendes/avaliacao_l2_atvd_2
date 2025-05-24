package com.l2.avaliacao_l2_atvd_2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "class")
public class ClassModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
