package com.mobile.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Handphone(
    val imgHandphone: Int,
    val nameHandphone: String,
    val descHandphone:  String
) : Parcelable
