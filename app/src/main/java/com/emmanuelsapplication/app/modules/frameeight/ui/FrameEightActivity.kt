package com.emmanuelsapplication.app.modules.frameeight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.emmanuelsapplication.app.R
import com.emmanuelsapplication.app.appcomponents.base.BaseActivity
import com.emmanuelsapplication.app.databinding.ActivityFrameEightBinding
import com.emmanuelsapplication.app.modules.frameeight.`data`.viewmodel.FrameEightVM
import com.emmanuelsapplication.app.modules.frameseven.ui.FrameSevenActivity
import kotlin.String
import kotlin.Unit

class FrameEightActivity : BaseActivity<ActivityFrameEightBinding>(R.layout.activity_frame_eight) {
  private val viewModel: FrameEightVM by viewModels<FrameEightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameEightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSave.setOnClickListener {
      val destIntent = FrameSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_EIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameEightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
