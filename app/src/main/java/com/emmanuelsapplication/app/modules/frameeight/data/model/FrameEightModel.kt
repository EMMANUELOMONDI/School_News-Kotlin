package com.emmanuelsapplication.app.modules.frameeight.`data`.model

import com.emmanuelsapplication.app.R
import com.emmanuelsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FrameEightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEditProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profile2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucanedityo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_edit_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputValue: String? = null
)
