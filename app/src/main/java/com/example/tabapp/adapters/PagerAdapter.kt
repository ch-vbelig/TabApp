package com.example.tabapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tabapp.views.DiceFragment
import com.example.tabapp.views.ScoreFragment
import moxy.MvpFragment

class PagerAdapter(fm: FragmentManager, num: Int): MvpFragmentPagerAdapter(fm) {
    val  numOfTabs: Int = num

    override fun getItem(position: Int): Fragment {

        val fragment: MvpFragment = when(position){
            0 -> DiceFragment()
            else -> ScoreFragment()
        }

        return fragment
    }

    override fun getCount(): Int {
        return numOfTabs

    }
}