package com.mindorks.framework.android_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
//import com.mindorks.framework.android_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var binding:ActivityMainBinding=ActivityMainBinding.inflate(layoutInflater)
//        binding.button.setOnClickListener {
//            var navCntroller=this.findNavController(R.id.nav_host_fragment)
//            navCntroller.navigate(R.id.action_balnk1_to_blank2)
//        }
    }
}