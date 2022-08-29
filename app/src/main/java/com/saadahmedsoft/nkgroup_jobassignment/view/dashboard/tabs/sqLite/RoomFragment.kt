package com.saadahmedsoft.nkgroup_jobassignment.view.dashboard.tabs.sqLite

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.saadahmedsoft.base.BaseFragment
import com.saadahmedsoft.base.helper.linearLayoutManager
import com.saadahmedsoft.base.helper.onClicked
import com.saadahmedsoft.base.utils.Constants.Booleans.FALSE
import com.saadahmedsoft.nkgroup_jobassignment.R
import com.saadahmedsoft.nkgroup_jobassignment.databinding.FragmentRoomBinding
import com.saadahmedsoft.nkgroup_jobassignment.services.model.room.Product
import com.saadahmedsoft.nkgroup_jobassignment.view.dashboard.DashboardActivity
import com.saadahmedsoft.nkgroup_jobassignment.view.dashboard.tabs.sqLite.adapter.ProductAdapter

class RoomFragment : BaseFragment<FragmentRoomBinding>(FragmentRoomBinding::inflate) {

    override val title: String
        get() = "SQ Lite"
    override val isBackButtonVisible: Boolean
        get() = FALSE

    private lateinit var dialog: Dialog

    private val adapter by lazy {
        ProductAdapter()
    }

    private var sum = 0.0

    override fun onFragmentCreate(savedInstanceState: Bundle?) {
        dialog = Dialog(requireContext())

        binding.recyclerView.layoutManager = linearLayoutManager(requireContext())

        productViewModel.getProducts().observe(this) {
            sum = 0.0
            binding.recyclerView.adapter = adapter
            adapter.addItems(it)

            for (item in it) {
                sum += item.price
            }

            binding.total.text = sum.toString()
        }

        binding.btnAdd.onClicked {
            openPopup()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (activity as DashboardActivity).setNavButton()
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun observeData() {}

    private fun openPopup() {
        dialog.setContentView(R.layout.popup_input)

        val name = dialog.findViewById<EditText>(R.id.et_product_name)
        val price = dialog.findViewById<EditText>(R.id.et_product_price)
        val save = dialog.findViewById<TextView>(R.id.btn_add_product)

        save.onClicked {
            productViewModel.insertProduct(
                Product(
                    null,
                    name.text.toString(),
                    price.text.toString().toDouble(),
                    System.currentTimeMillis().toString()
                )
            )
            shortSnackBar("Product added successfully")
            dialog.dismiss()
        }

        dialog.setCancelable(true)
        dialog.setCanceledOnTouchOutside(true)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }
}