package com.hamburgueria.poltrona_nerd.service

import com.hamburgueria.poltrona_nerd.model.HamburguerModel
import com.hamburgueria.poltrona_nerd.repository.HamburguerRepository
import org.springframework.stereotype.Service

@Service
class HamburguerService(
    val hamburguerRepository: HamburguerRepository
) {

    fun createHamburguer(hamburguer: HamburguerModel) {
        hamburguerRepository.save(hamburguer)
    }

    fun getAllHamburguer(name: String?): List<HamburguerModel> {
        name?.let {
            return hamburguerRepository.findByNameContains(it)
        }
       return hamburguerRepository.findAll()
    }

    fun getHamburguerById(id: Int): HamburguerModel = hamburguerRepository.findById(id).orElseThrow()

    fun updateHamburguer(hamburguer: HamburguerModel) {
        if (!hamburguer.id?.let { hamburguerRepository.existsById(it) }!!) {
            throw Exception()
        }
        hamburguerRepository.save(hamburguer)
    }

    fun deleteHamburguer(id: Int){
        if (!hamburguerRepository.existsById(id)){
            throw Exception()
        }
        hamburguerRepository.deleteById(id)
    }

}