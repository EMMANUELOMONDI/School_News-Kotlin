package com.emmanuelsapplication.app.modules.frameone.`data`.model

import com.emmanuelsapplication.app.R
import com.emmanuelsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FrameOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEventFlow: String? = MyApp.getInstance().resources.getString(R.string.lbl_eventflow)

)
