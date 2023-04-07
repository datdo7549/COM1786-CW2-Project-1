package com.example.com1786_cw2project1.feature.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.URLUtil
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.example.com1786_cw2project1.R
import com.example.com1786_cw2project1.databinding.FragmentHomeBinding
import com.example.com1786_cw2project1.feature.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel


class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {
    override val viewModel: HomeViewModel by viewModel()

    override fun onCreateViewBinding(inflater: LayoutInflater): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initViewModel()
    }

    private fun initView() = with(viewBinding) {
        btnAddUrl.setOnClickListener {
            val url = edtImageUrl.text.toString()
            if (URLUtil.isValidUrl(url)) {
                viewBinding.edtImageUrl.text?.clear()
                viewBinding.edtImageUrl.clearFocus()
                viewModel.addUrl(url)
            } else {
                Toast.makeText(requireContext(), "Invalid url!", Toast.LENGTH_SHORT).show()
            }
        }

        btnPrevious.setOnClickListener {
            viewModel.onPreviousClicked()
        }

        btnNext.setOnClickListener {
            viewModel.onNextClicked()
        }
    }

    private fun initViewModel() = with(viewModel) {
        getCurrentUrl(0)
        currentUrl.observe(viewLifecycleOwner) {
            Glide
                .with(requireActivity())
                .load(it.url)
                .centerCrop()
                .into(viewBinding.imvShowImage)
        }
    }

    companion object {
        fun newInstance() = HomeFragment()
    }
}