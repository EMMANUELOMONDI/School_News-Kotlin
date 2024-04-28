package com.emmanuelsapplication.app.modules.framenine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.emmanuelsapplication.app.R
import com.emmanuelsapplication.app.appcomponents.base.BaseActivity
import com.emmanuelsapplication.app.databinding.ActivityFrameNineBinding
import com.emmanuelsapplication.app.modules.framenine.`data`.viewmodel.FrameNineVM
import com.emmanuelsapplication.app.modules.frameseven.ui.FrameSevenActivity
import kotlin.String
import kotlin.Unit

class FrameNineActivity : BaseActivity<ActivityFrameNineBinding>(R.layout.activity_frame_nine) {
  private val viewModel: FrameNineVM by viewModels<FrameNineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameNineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSave.setOnClickListener {
      val destIntent = FrameSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnFrame.setOnClickListener {
      val destIntent = FrameSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_NINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameNineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
