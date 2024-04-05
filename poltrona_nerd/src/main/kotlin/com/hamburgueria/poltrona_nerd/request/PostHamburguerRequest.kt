package com.hamburgueria.poltrona_nerd.request

data class PostHamburguerRequest(
    var name: String,
    var typeBrad : String,
    var typeMeet: String,
    var complement: String
)
