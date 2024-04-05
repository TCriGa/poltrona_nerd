package com.hamburgueria.poltrona_nerd.service

import com.hamburgueria.poltrona_nerd.model.HamburguerModel
import com.hamburgueria.poltrona_nerd.repository.HamburguerRepository
import org.springframework.stereotype.Service

@Service
class HamburguerService(
    val hamburguerRepository: HamburguerRepository
) {

    fun createHamburguer(hamburguer : HamburguerModel){
        hamburguerRepository.save(hamburguer)
    }
    
}