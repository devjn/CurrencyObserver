package com.github.devjn.currencyobserver

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_currency -> {
                navigate(CurrencyFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_cryptocurrency -> {
                navigate(CryptoCurrencyFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    fun navigate(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragment, "MAIN")
                .commit()
    }

}
