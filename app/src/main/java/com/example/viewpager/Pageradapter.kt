package com.example.viewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class Pageradapter(val fragments: ArrayList<Fragment> ,val fragmentManager: FragmentManager ):FragmentPagerAdapter(fragmentManager) {
    override fun getItem(p0: Int): Fragment
    {
        return  fragments.get(p0)
    }

    override fun getCount(): Int
    {
        return  fragments.size

    }

    override fun getPageTitle(position: Int): CharSequence? {
       when(position){
           0->  return " Home"
           1-> return  "Call"
           2-> return  "About"
           else-> return ""
       }

    }
}