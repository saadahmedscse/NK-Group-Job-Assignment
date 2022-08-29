package com.saadahmedsoft.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.saadahmedsoft.base.helper.observe
import com.saadahmedsoft.base.helper.onClicked
import com.saadahmedsoft.base.helper.snackBar
import com.saadahmedsoft.base.helper.toast
import com.saadahmedsoft.base.utils.Constants.Durations.SNACK_LONG
import com.saadahmedsoft.base.utils.Constants.Durations.SNACK_SHORT
import com.saadahmedsoft.base.utils.Constants.Durations.TOAST_LONG
import com.saadahmedsoft.base.utils.Constants.Durations.TOAST_SHORT
import com.saadahmedsoft.base.viewmodel.ToolbarViewModel
import com.saadahmedsoft.nkgroup_jobassignment.databinding.AppToolbarBinding
import com.saadahmedsoft.shortintent.Animator

abstract class BaseActivity<BINDING: ViewBinding>(
    private val bindingInflater: (inflater: LayoutInflater) -> BINDING
) : AppCompatActivity() {

    private lateinit var _binding: BINDING
    private val toolbarViewModel by viewModels<ToolbarViewModel>()

    val binding: BINDING
        get() = _binding

    abstract val toolbarBinding: AppToolbarBinding?

    abstract fun onActivityCreate(savedInstanceState: Bundle?)

    abstract fun observeData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflater.invoke(layoutInflater)
        setContentView(_binding.root)
        observeData()
        initToolbar()
        onActivityCreate(savedInstanceState)
    }

    private fun initToolbar() {
        if (toolbarBinding != null) {
            observe(toolbarViewModel.title) {
                toolbarBinding?.toolbarTitle?.text = it
            }
            observe(toolbarViewModel.isBackButtonVisible) {
                toolbarBinding?.toolbarBtn?.visibility = if (it) View.VISIBLE else View.GONE
            }
            toolbarBinding?.toolbarBtn?.onClicked {
                super.onBackPressed()
                Animator.animateSlideDown(this)
            }
        }
    }

    fun shortSnackBar(message: String) {
        showSnackBar(message, SNACK_SHORT)
    }

    fun longSnackBar(message: String) {
        showSnackBar(message, SNACK_LONG)
    }

    fun shortToast(message: String) {
        showToast(message, TOAST_SHORT)
    }

    fun longToast(message: String) {
        showToast(message, TOAST_LONG)
    }

    private fun showSnackBar(message: String, duration: Int) {
        snackBar(this, _binding.root, message, duration)
    }

    private fun showToast(message: String, duration: Int) {
        toast(this, message, duration)
    }
}