package com.hamburgueria.poltrona_nerd.repository

import com.hamburgueria.poltrona_nerd.model.HamburguerModel
import org.springframework.data.jpa.repository.JpaRepository


interface HamburguerRepository : JpaRepository<HamburguerModel, Int> {
}