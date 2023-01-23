package com.martinsrvinicius.myfood.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.martinsrvinicius.myfood.R
import com.martinsrvinicius.myfood.activity.RestaurantFragment
import com.martinsrvinicius.myfood.fragment.MarketplaceFragment

class TabViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    val tabs = arrayOf(R.string.restaurants, R.string.marketplaces, R.string.beverages)
    val fragments = arrayOf(RestaurantFragment(), MarketplaceFragment(), MarketplaceFragment())

    override fun getItemCount() = fragments.size

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
//video #4 13:33

}