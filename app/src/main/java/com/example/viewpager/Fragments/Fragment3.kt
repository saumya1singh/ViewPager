package com.example.viewpager.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.viewpager.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragment3: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return (inflater.inflate(com.example.viewpager.R.layout.fragment3, container, false))
    }
    }