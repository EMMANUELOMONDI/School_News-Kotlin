package com.emmanuelsapplication.app.modules.framesix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.emmanuelsapplication.app.modules.framesix.`data`.model.FrameSixModel
import org.koin.core.KoinComponent

class FrameSixVM : ViewModel(), KoinComponent {
  val frameSixModel: MutableLiveData<FrameSixModel> = MutableLiveData(FrameSixModel())

  var navArguments: Bundle? = null
}
