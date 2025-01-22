package com.hdt.qrscanner.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.hdt.qrscanner.R
import com.hdt.qrscanner.databinding.FragmentSplashBinding
import com.hdt.qrscanner.util.extension.navigate
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : BaseFragment<FragmentSplashBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSplashBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        super.initView()

        lifecycleScope.launch {
            delay(2000)
            navigate(R.id.homeFragment)
        }

    }
}