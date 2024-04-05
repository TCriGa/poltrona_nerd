package com.hamburgueria.poltrona_nerd.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class HamburguerModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Int? = null,

    @Column
    val name: String,
    @Column
    val typeBrad : String,
    @Column
    val typeMeet: String,
    @Column
    val complement : String,
)
