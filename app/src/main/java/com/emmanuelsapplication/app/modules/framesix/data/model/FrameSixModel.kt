package com.emmanuelsapplication.app.modules.framesix.`data`.model

import com.emmanuelsapplication.app.R
import com.emmanuelsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FrameSixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtScreen: String? = MyApp.getInstance().resources.getString(R.string.lbl_screen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoWeaponsonC: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_weapons_on_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dear_stratizens)

)
