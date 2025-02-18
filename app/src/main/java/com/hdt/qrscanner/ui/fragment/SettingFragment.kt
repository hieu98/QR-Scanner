package com.hdt.qrscanner.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hdt.qrscanner.databinding.FragnmentSettingBinding
import com.hdt.qrscanner.util.extension.popBackStack

class SettingFragment : BaseFragment<FragnmentSettingBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragnmentSettingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun initView() {
        super.initView()

        binding.ivBack.setOnClickListener { popBackStack() }
    }
}