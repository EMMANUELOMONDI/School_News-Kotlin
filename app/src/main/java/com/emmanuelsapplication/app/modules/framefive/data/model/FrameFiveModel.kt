package com.emmanuelsapplication.app.modules.framefive.`data`.model

import com.emmanuelsapplication.app.R
import com.emmanuelsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FrameFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEventFlow: String? = MyApp.getInstance().resources.getString(R.string.lbl_eventflow)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeyJohnDoe: String? = MyApp.getInstance().resources.getString(R.string.lbl_hey_john_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeText: String? = MyApp.getInstance().resources.getString(R.string.msg_you_have_3_upco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMoreEvents: String? = MyApp.getInstance().resources.getString(R.string.lbl_more_events)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScheduleTrash: String? =
      MyApp.getInstance().resources.getString(R.string.msg_strathmore_comm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScheduleTrashOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dec_21_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScheduleTrashTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ict_office)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScheduleTrashThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dec_21_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBikeMore: String? = MyApp.getInstance().resources.getString(R.string.lbl_bike_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlantaTree: String? = MyApp.getInstance().resources.getString(R.string.lbl_plant_a_tree)

)
