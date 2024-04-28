package com.emmanuelsapplication.app.modules.framesix.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.emmanuelsapplication.app.R
import com.emmanuelsapplication.app.appcomponents.base.BaseActivity
import com.emmanuelsapplication.app.databinding.ActivityFrameSixBinding
import com.emmanuelsapplication.app.modules.framefive.ui.FrameFiveActivity
import com.emmanuelsapplication.app.modules.framesix.`data`.viewmodel.FrameSixVM
import kotlin.String
import kotlin.Unit

class FrameSixActivity : BaseActivity<ActivityFrameSixBinding>(R.layout.activity_frame_six) {
  private val viewModel: FrameSixVM by viewModels<FrameSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageVector.setOnClickListener {
      val destIntent = FrameFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_SIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameSixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
