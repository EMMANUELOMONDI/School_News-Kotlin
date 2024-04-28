package com.emmanuelsapplication.app.modules.frameseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.emmanuelsapplication.app.R
import com.emmanuelsapplication.app.appcomponents.base.BaseActivity
import com.emmanuelsapplication.app.databinding.ActivityFrameSevenBinding
import com.emmanuelsapplication.app.modules.frameeight.ui.FrameEightActivity
import com.emmanuelsapplication.app.modules.framenine.ui.FrameNineActivity
import com.emmanuelsapplication.app.modules.frameseven.`data`.viewmodel.FrameSevenVM
import com.emmanuelsapplication.app.modules.framethree.ui.FrameThreeActivity
import kotlin.String
import kotlin.Unit

class FrameSevenActivity : BaseActivity<ActivityFrameSevenBinding>(R.layout.activity_frame_seven) {
  private val viewModel: FrameSevenVM by viewModels<FrameSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtEmailpreferenc.setOnClickListener {
      val destIntent = FrameNineActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLogout.setOnClickListener {
      val destIntent = FrameThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtEditprofile.setOnClickListener {
      val destIntent = FrameEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FRAME_SEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FrameSevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
