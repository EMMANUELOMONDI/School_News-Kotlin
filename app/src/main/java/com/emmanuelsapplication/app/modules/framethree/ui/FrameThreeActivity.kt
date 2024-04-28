package com.emmanuelsapplication.app.modules.framethree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.emmanuelsapplication.app.R
import com.emmanuelsapplication.app.appcomponents.base.BaseActivity
import com.emmanuelsapplication.app.appcomponents.googleauth.GoogleHelper
import com.emmanuelsapplication.app.databinding.ActivityFrameThreeBinding
import com.emmanuelsapplication.app.modules.framefour.ui.FrameFourActivity
import com.emmanuelsapplication.app.modules.framethree.`data`.model.SpinnerInputModel
import com.emmanuelsapplication.app.modules.framethree.`data`.viewmodel.FrameThreeVM
import kotlin.String
import kotlin.Unit

class FrameThreeActivity : BaseActivity<ActivityFrameThreeBinding>(R.layout.activity_frame_three) {
  private val viewModel: FrameThreeVM by viewModels<FrameThreeVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerInputList.value = mutableListOf(
    SpinnerInputModel("Item1"),
    SpinnerInputModel("Item2"),
    SpinnerInputModel("Item3"),
    SpinnerInputModel("Item4"),
    SpinnerInputModel("Item5")
    )
    val spinnerInputAdapter =
    SpinnerInputAdapter(this,R.layout.spinner_item,viewModel.spinnerInputList.value?:
    mutableListOf())
    binding.spinnerInput.adapter = spinnerInputAdapter
    binding.frameThreeVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowloginwithgoog.setOnClickListener {
        googleLogin.login()
      }
      binding.btnNext.setOnClickListener {
        val destIntent = FrameFourActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "FRAME_THREE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, FrameThreeActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
