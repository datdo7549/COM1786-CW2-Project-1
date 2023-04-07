package com.example.com1786_cw2project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.com1786_cw2project1.feature.home.HomeFragment
import com.tunjid.androidx.navigation.stackNavigationController

class MainActivity : AppCompatActivity() {

    val stackNavigator by stackNavigationController(R.id.navRootHost)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        stackNavigator.push(HomeFragment.newInstance())
    }
}