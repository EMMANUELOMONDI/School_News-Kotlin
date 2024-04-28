package com.emmanuelsapplication.app.modules.framefour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.emmanuelsapplication.app.modules.framefour.`data`.model.FrameFourModel
import org.koin.core.KoinComponent

class FrameFourVM : ViewModel(), KoinComponent {
  val frameFourModel: MutableLiveData<FrameFourModel> = MutableLiveData(FrameFourModel())

  var navArguments: Bundle? = null
}
