package com.hdt.qrscanner.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hdt.qrscanner.R
import com.hdt.qrscanner.databinding.FragmentHistoryBinding
import com.hdt.qrscanner.util.extension.navigate
import com.hdt.qrscanner.util.extension.onBackPressed

class HistoryFragment : BaseFragment<FragmentHistoryBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHistoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun initView() {
        super.initView()
        onBackPressed {}
        binding.ivSetting.setOnClickListener {
            navigate(R.id.settingFragment)
        }
    }
}