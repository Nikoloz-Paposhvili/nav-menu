package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.adapters.ViewPageFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout:TabLayout
    private lateinit var viewPager: ViewPager2
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLatout)
        viewPager = findViewById(R.id.viewPager2)

        viewPager.adapter = ViewPageFragmentAdapter(this)
        TabLayoutMediator(tabLayout, viewPager) { tab: TabLayout.Tab, i: Int ->
//            tab.text = "Tab ${i + 1}"

            when(i){
                0 -> tab.setIcon(R.drawable.ic_baseline_menu_24)
                1 -> tab.setIcon(R.drawable.ic_baseline_sports_mma_24)
                2 -> tab.setIcon(R.drawable.ic_baseline_search_24)
            }
        }.attach()
    }

}