package com.latief.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.latief.newsapp.adapter.SectionPagerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        val vpNews: ViewPager2 = findViewById(R.id.vp_news)
        val mSectionPagerAdapter = SectionPagerAdapter(this)
        vpNews.adapter = mSectionPagerAdapter

        val tabs: TabLayout = findViewById(R.id.tabs)

        val tabList = arrayOf("All News", "Top", "Popular")
        TabLayoutMediator(tabs, vpNews) { tab, position ->
            tab.text = tabList[position]
        }.attach()
    }
}