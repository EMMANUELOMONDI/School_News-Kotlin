package com.emmanuelsapplication.app.modules.frametwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.emmanuelsapplication.app.R
import com.emmanuelsapplication.app.appcomponents.base.BaseActivity
import com.emmanuelsapplication.app.databinding.ActivityFrameTwoBinding
import com.emmanuelsapplication.app.modules.framethree.ui.FrameThreeActivity
import com.emmanuelsapplication.app.modules.frametwo.`data`.viewmodel.FrameTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FrameTwoActivity : BaseActivity<ActivityFrameTwoBinding>(R.layout.activity_frame_two) {
  private val viewModel: FrameTwoVM by viewModels<FrameTwoVM>()

  private val REQUEST_CODE_FRAME_THREE_ACTIVITY: Int = 346


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGetStarted.setOnClickListener {
      val destIntent = FrameThreeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_FRAME_THREE_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "FRAME_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
