package com.example.patients1.features.Patients

import android.os.StatFs
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.patients1.model.PatientsRemoteModel
import com.example.patients1.repository.PatientsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PatientsViewModel @Inject constructor(private val repository: PatientsRepository) :
    ViewModel() {

    private val _patientsLiveData: MutableStateFlow<List<PatientsRemoteModel>> = MutableStateFlow(
        emptyList()
    )
    val patientsLiveData: StateFlow<List<PatientsRemoteModel>> = _patientsLiveData


    init {
        getPatients()
    }

    fun getPatients() {
        viewModelScope.launch {
            _patientsLiveData.emit(repository.getPatients())
        }
    }
}