package com.example.viewpager.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager.R
import kotlinx.android.synthetic.main.fragment1.*

class Fragment1: Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
      return (inflater.inflate(R.layout.fragment1, container,false))

    }
}