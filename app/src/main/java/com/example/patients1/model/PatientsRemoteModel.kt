package com.example.patients1.model

import com.google.gson.annotations.SerializedName

data class PatientsRemoteModel(

    @SerializedName("condition")
    val condition: String,

    @SerializedName("_id")
    val id: String,

    @SerializedName("name")
    val namePatient: String,

    @SerializedName("address")
    val addressPatient: String,

    @SerializedName("mobile")
    val mobilePatient: String,

    @SerializedName("email")
    val emailPatient: String,

    @SerializedName("birthday")
    val birthdayPatient: String,

    @SerializedName("gender")
    val genderPatient: String,

    @SerializedName("photo")
    val photo: String,

    val tests: List<TestModel>,
)
