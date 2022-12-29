package com.oy.ecshoppingcart.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Meal(

    var id:String,
    var name:String,
    var category:String,
    var area:String,
    var instructions:String,
    var thumb:String,
    var ingredient1:String,
    var ingredient2:String,
    var ingredient3:String,
    var ingredient4:String,
    var ingredient5:String,
    var ingredient6:String,
    var ingredient7:String

): Parcelable