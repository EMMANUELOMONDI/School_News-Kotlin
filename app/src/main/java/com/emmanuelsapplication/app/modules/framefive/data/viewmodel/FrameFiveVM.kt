package com.emmanuelsapplication.app.modules.framefive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.emmanuelsapplication.app.modules.framefive.`data`.model.FrameFiveModel
import org.koin.core.KoinComponent

class FrameFiveVM : ViewModel(), KoinComponent {
  val frameFiveModel: MutableLiveData<FrameFiveModel> = MutableLiveData(FrameFiveModel())

  var navArguments: Bundle? = null
}
