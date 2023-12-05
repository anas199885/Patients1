package com.example.patients1.datasource

import com.example.patients1.model.PatientsWrappedRemoteModel
import retrofit2.http.GET

interface PatientsDataSource {

    @GET("patients")
    fun getPatients(): PatientsWrappedRemoteModel

}