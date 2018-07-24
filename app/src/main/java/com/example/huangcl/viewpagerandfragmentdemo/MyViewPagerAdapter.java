package com.example.huangcl.viewpagerandfragmentdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import java.util.List;

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentList;

    public MyViewPagerAdapter(FragmentManager fm,List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList=fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        if(fragmentList!=null && !fragmentList.isEmpty())
            return fragmentList.get(position);
        else
            return null;
    }

    @Override
    public int getCount() {
        if(fragmentList!=null && !fragmentList.isEmpty())
            return fragmentList.size();
        else
            return 0;
    }
}
