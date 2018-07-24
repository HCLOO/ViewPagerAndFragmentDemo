package com.example.huangcl.viewpagerandfragmentdemo;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    CircleIndicator indicator;
    MyViewPagerAdapter adapter;
    List fragmentList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=(ViewPager)findViewById(R.id.view_pager);
        indicator=(CircleIndicator)findViewById(R.id.circle_indicator);
        initFragmentList();
        adapter=new MyViewPagerAdapter(getSupportFragmentManager(),fragmentList);
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);
    }

    private void initFragmentList() {
        for(int i=0;i<5;++i)
            fragmentList.add(new MyFragment("fragment"+(i+1)));
    }
}