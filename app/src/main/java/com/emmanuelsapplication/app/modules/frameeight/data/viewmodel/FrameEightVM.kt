package com.emmanuelsapplication.app.modules.frameeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.emmanuelsapplication.app.modules.frameeight.`data`.model.FrameEightModel
import org.koin.core.KoinComponent

class FrameEightVM : ViewModel(), KoinComponent {
  val frameEightModel: MutableLiveData<FrameEightModel> = MutableLiveData(FrameEightModel())

  var navArguments: Bundle? = null
}
