package com.wangyi.ui05.splash;

import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ParallaxPagerAdapter extends FragmentPagerAdapter {
    private List<ParallaxFragment> fragments;

    public ParallaxPagerAdapter(FragmentManager fm,List<ParallaxFragment> fragments) {
        super(fm);
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
