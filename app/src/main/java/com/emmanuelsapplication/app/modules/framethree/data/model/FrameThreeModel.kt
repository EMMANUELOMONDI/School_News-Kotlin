package com.emmanuelsapplication.app.modules.framethree.`data`.model

import com.emmanuelsapplication.app.R
import com.emmanuelsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FrameThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithyo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginwithGoog: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_with_goog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSixValue: String? = null
)
