package com.emmanuelsapplication.app.modules.framefive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.emmanuelsapplication.app.R
import com.emmanuelsapplication.app.appcomponents.base.BaseActivity
import com.emmanuelsapplication.app.databinding.ActivityFrameFiveBinding
import com.emmanuelsapplication.app.modules.framefive.`data`.viewmodel.FrameFiveVM
import com.emmanuelsapplication.app.modules.framenine.ui.FrameNineActivity
import com.emmanuelsapplication.app.modules.frameseven.ui.FrameSevenActivity
import com.emmanuelsapplication.app.modules.framesix.ui.FrameSixActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FrameFiveActivity : BaseActivity<ActivityFrameFiveBinding>(R.layout.activity_frame_five) {
  private val viewModel: FrameFiveVM by viewModels<FrameFiveVM>()

  private val REQUEST_CODE_FRAME_NINE_ACTIVITY: Int = 814


  private val REQUEST_CODE_FRAME_SIX_ACTIVITY: Int = 737


  private val REQUEST_CODE_FRAME_SEVEN_ACTIVITY: Int = 387


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageUser.setOnClickListener {
      val destIntent = FrameNineActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_FRAME_NINE_ACTIVITY)
    }
    binding.imageRectangleEleven.setOnClickListener {
      val destIntent = FrameSixActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_FRAME_SIX_ACTIVITY)
    }
    binding.imageEllipseTwentyOne.setOnClickListener {
      val destIntent = FrameSevenActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_FRAME_SEVEN_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "FRAME_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
