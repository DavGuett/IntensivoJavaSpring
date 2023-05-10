package com.intensivojava.Intensivojava.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_belonging")
public class Belonging {
    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;

    public Belonging(){

    }

    public Belonging(BelongingPK id, Integer position) {
        this.id = id;
        this.position = position;
    }
}
