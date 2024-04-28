package com.emmanuelsapplication.app.modules.frameone.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.emmanuelsapplication.app.R
import com.emmanuelsapplication.app.appcomponents.base.BaseActivity
import com.emmanuelsapplication.app.databinding.ActivityFrameOneBinding
import com.emmanuelsapplication.app.modules.frameone.`data`.viewmodel.FrameOneVM
import com.emmanuelsapplication.app.modules.frametwo.ui.FrameTwoActivity
import kotlin.String
import kotlin.Unit

class FrameOneActivity : BaseActivity<ActivityFrameOneBinding>(R.layout.activity_frame_one) {
  private val viewModel: FrameOneVM by viewModels<FrameOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameOneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = FrameTwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "FRAME_ONE_ACTIVITY"

    }
  }
