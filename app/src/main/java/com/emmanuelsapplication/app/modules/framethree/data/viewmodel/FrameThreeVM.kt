package com.emmanuelsapplication.app.modules.framethree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.emmanuelsapplication.app.modules.framethree.`data`.model.FrameThreeModel
import com.emmanuelsapplication.app.modules.framethree.`data`.model.SpinnerInputModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FrameThreeVM : ViewModel(), KoinComponent {
  val frameThreeModel: MutableLiveData<FrameThreeModel> = MutableLiveData(FrameThreeModel())


  var navArguments: Bundle? = null


  val spinnerInputList: MutableLiveData<MutableList<SpinnerInputModel>> = MutableLiveData()


  lateinit var googleAuthResponse: GoogleSignInAccount
}
