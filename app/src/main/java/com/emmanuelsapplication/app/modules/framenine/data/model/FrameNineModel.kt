package com.emmanuelsapplication.app.modules.framenine.`data`.model

import com.emmanuelsapplication.app.R
import com.emmanuelsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FrameNineModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailPreferenc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_email_preferenc2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChoosetopicst: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_topics_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStrathmoreComm: String? =
      MyApp.getInstance().resources.getString(R.string.msg_strathmore_comm3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStudentCouncil: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_student_council)

)
