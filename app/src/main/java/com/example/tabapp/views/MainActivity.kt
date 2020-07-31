package com.example.tabapp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.tabapp.R
import com.example.tabapp.adapters.PagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout: TabLayout = findViewById<TabLayout>(R.id.tabBar)
//        val diceItem: TabItem = findViewById<TabItem>(R.id.dice)
        //val scoreItem: TabItem = findViewById<TabItem>(R.id.score)
        val viewPager: ViewPager = findViewById<ViewPager>(R.id.view_pager)

        val pagerAdapter: PagerAdapter =
            PagerAdapter(
                supportFragmentManager,
                tabLayout.tabCount
            )
        viewPager.adapter = pagerAdapter

        tabLayout.setupWithViewPager(viewPager)
        //tabLayout.addOnTabSelectedListener(onTable)
    }
}