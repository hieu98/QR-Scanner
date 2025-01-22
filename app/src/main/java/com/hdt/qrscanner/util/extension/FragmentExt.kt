package com.hdt.qrscanner.util.extension

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.navOptions
import com.hdt.qrscanner.R

fun Fragment.navigate(
    destination: Int,
    extraData: Bundle? = null
) {
    activity?.let {
        try {
            Navigation.findNavController(it, R.id.nav_host_fragment)
                .navigate(destination, extraData, navOptions {
                    anim {
                        enter = R.anim.anim_slide_in_right
                        exit = R.anim.anim_slide_out_left
                        popEnter = R.anim.anim_slide_in_left
                        popExit = R.anim.anim_slide_out_right
                    }
                })
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}

fun Fragment.onBackPressed(runnable: Runnable) {
    activity?.onBackPressedDispatcher?.addCallback(
        viewLifecycleOwner,
        object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                runnable.run()
            }
        })
}

fun Fragment.popBackStack(destination: Int? = null) {
    try {
        val navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
        if (destination != null) navController.popBackStack(destination, false)
        else navController.popBackStack()
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
}