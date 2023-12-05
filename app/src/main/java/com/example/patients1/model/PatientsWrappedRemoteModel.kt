package com.example.patients1.model

import com.google.gson.annotations.SerializedName

data class PatientsWrappedRemoteModel(

    @SerializedName("status")
    val status: Int,

    @SerializedName("message")
    val message: Int,

    @SerializedName("data")
    val data: List<PatientsRemoteModel>,
)
