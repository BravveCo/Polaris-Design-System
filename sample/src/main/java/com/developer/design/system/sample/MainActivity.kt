package com.developer.design.system.sample

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    
    lateinit var radioDark:RadioButton
    lateinit var radioLight:RadioButton
    lateinit var radioSystem:RadioButton
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioDark = findViewById(R.id.radio_dark)
        radioLight = findViewById(R.id.radio_ligth)
        radioSystem = findViewById(R.id.radio_system)
        
        
        radioDark.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                val isNightTheme = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK

            }
        }

        radioSystem.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)

            }

        }

        radioLight.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
    }
}