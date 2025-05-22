package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;

public class Belonging {

    @EmbeddedId
    private BelongingPK id = mnew BelongingPK();

    private Integer position;

}
