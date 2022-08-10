package com.example.jpah2demo;

import javax.persistence.*;

@Entity
@Table(name="Endereco")
public class Endereco {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
