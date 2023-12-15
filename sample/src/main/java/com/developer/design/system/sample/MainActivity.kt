package com.developer.design.system.sample

import android.app.Activity
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.developer.design.system.sample.databinding.ActivityMainBinding
import com.digitalhorizons.common.binding.viewBinding

class MainActivity : Activity() {

    private val binding: ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        binding.radioDark.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                val isNightTheme =
                    resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK

            }
        }

        binding.radioSystem.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)

            }

        }

        binding.radioLigth.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
    }
}