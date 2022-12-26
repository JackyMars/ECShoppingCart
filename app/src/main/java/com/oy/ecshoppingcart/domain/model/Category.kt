package com.oy.ecshoppingcart.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(

    var id:String,
    var name:String,
    var thumb:String

): Parcelable