package com.wemob.bizkart.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wemob.bizkart.R
import com.wemob.bizkart.fragments.homefragment

class HomePage : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage_layout)
// 1
        val homefrag=homefragment()
        if (savedInstanceState == null) {
            // 2
            supportFragmentManager
                // 3
                .beginTransaction()
                // 4
                .add(R.id.rootlayout, homefrag, "homefragment")
                // 5
                .commit()
        }
    }
}