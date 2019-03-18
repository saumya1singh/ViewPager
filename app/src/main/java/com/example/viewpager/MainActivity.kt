package com.example.viewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.viewpager.Fragments.Fragment1
import com.example.viewpager.Fragments.Fragment2
import com.example.viewpager.Fragments.Fragment3
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentList= arrayListOf<Fragment>()

      fragmentList.add(Fragment1())
        fragmentList.add(Fragment2())
        fragmentList.add(Fragment3())

        val pageradapter=Pageradapter(fragmentList,supportFragmentManager)
        viewpager.adapter=pageradapter

        tablayout.setupWithViewPager(viewpager)
    }
}
