package com.hamburgueria.poltrona_nerd.extension

import com.hamburgueria.poltrona_nerd.model.HamburguerModel
import com.hamburgueria.poltrona_nerd.request.PostHamburguerRequest
import com.hamburgueria.poltrona_nerd.request.PutHamburguerRequest

fun PostHamburguerRequest.toHamburguerModel(): HamburguerModel =
    HamburguerModel(name = this.name, typeBrad = this.typeBrad, typeMeet = this.typeMeet, complement = this.complement)

fun PutHamburguerRequest.toHamburguerModel(id: Int): HamburguerModel =
    HamburguerModel(id = id,  name = this.name, typeMeet = this.typeMeet, typeBrad = this.typeBrad, complement = this.complement)