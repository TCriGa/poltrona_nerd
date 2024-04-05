package com.hamburgueria.poltrona_nerd.controller

import com.hamburgueria.poltrona_nerd.extension.toHamburguerModel
import com.hamburgueria.poltrona_nerd.model.HamburguerModel
import com.hamburgueria.poltrona_nerd.request.PostHamburguerRequest
import com.hamburgueria.poltrona_nerd.request.PutHamburguerRequest
import com.hamburgueria.poltrona_nerd.service.HamburguerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("hamburguer")
class HamburguerController(
    val hamburguerService: HamburguerService
) {

    @GetMapping
    fun gerHamburguer(@RequestParam name: String?): List<HamburguerModel> = hamburguerService.getAllHamburguer(name)

    @GetMapping("/{id}")
    fun getHamburguerById(@PathVariable id: Int) = hamburguerService.getHamburguerById(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createHamburguer(@RequestBody hamburguerModel: PostHamburguerRequest) =
        hamburguerService.createHamburguer(hamburguerModel.toHamburguerModel())

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: Int, @RequestBody hamburguer: PutHamburguerRequest) =
        hamburguerService.updateHamburguer(hamburguer.toHamburguerModel(id))

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Int) = hamburguerService.deleteHamburguer(id)
}