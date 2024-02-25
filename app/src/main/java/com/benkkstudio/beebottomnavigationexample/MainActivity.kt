package com.benkkstudio.beebottomnavigationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.benkkstudio.beebotomnavigation.BeeBottomNavigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    private fun setupBottomNav() {
//        binding.navigation.add(BeeBottomNavigation.Model(0, R.drawable.ic_nav_home))
//        binding.navigation.add(BeeBottomNavigation.Model(1, R.drawable.ic_nav_categories))
//        binding.navigation.add(BeeBottomNavigation.Model(2, R.drawable.ic_nav_favourite))
//        binding.navigation.show(0)
//    }
}