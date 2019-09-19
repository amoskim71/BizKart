package com.wemob.bizkart.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.wemob.bizkart.R

class homefragment : Fragment()
{


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sharedPref : SharedPreferences?= activity?.getPreferences(Context.MODE_PRIVATE);
        sharedPref?.edit()?.putBoolean("bla", false)?.apply()

    }
}