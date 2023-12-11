package com.example.patients1.repository

import com.example.patients1.datasource.PatientsDataSource
import com.example.patients1.model.PatientsRemoteModel
import javax.inject.Inject

class PatientsRepository @Inject constructor(private val patientsDataSource: PatientsDataSource) {

    suspend fun getPatients(): List<PatientsRemoteModel>{
        return patientsDataSource.getPatients().data
    }
}