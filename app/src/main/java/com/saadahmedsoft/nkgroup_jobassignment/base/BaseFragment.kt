package com.saadahmedsoft.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.viewbinding.ViewBinding
import com.saadahmedsoft.base.helper.snackBar
import com.saadahmedsoft.base.helper.toast
import com.saadahmedsoft.base.utils.Constants.Durations.SNACK_LONG
import com.saadahmedsoft.base.utils.Constants.Durations.SNACK_SHORT
import com.saadahmedsoft.base.utils.Constants.Durations.TOAST_LONG
import com.saadahmedsoft.base.utils.Constants.Durations.TOAST_SHORT
import com.saadahmedsoft.base.viewmodel.ToolbarViewModel
import com.saadahmedsoft.nkgroup_jobassignment.viewmodel.ApiViewModel
import com.saadahmedsoft.nkgroup_jobassignment.viewmodel.ProductViewModel

abstract class BaseFragment<BINDING: ViewBinding>(
    private val bindingInflater: (inflater: LayoutInflater) -> BINDING
) : Fragment() {

    private lateinit var _binding: BINDING
    private val toolbarViewModel by activityViewModels<ToolbarViewModel>()
    val apiViewModel by viewModels<ApiViewModel>()
    val productViewModel by viewModels<ProductViewModel>()

    val binding: BINDING
        get() = _binding

    abstract val title: String
    abstract val isBackButtonVisible: Boolean

    abstract fun onFragmentCreate(savedInstanceState: Bundle?)
    abstract fun observeData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflater.invoke(layoutInflater)
        observeData()
        onFragmentCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        toolbarViewModel.setTitle(title)
        toolbarViewModel.setBackButtonState(isBackButtonVisible)
        return _binding.root
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
        snackBar(requireContext(), _binding.root, message, duration)
    }

    private fun showToast(message: String, duration: Int) {
        toast(requireContext(), message, duration)
    }

    fun onBackPressed() {
        requireActivity().onBackPressed()
    }
}