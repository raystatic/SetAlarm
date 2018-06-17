package com.example.rahul.setalarm.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rahul.setalarm.R;
import com.example.rahul.setalarm.adapters.SectionPagerAdapter;
import com.example.rahul.setalarm.fragments.TabFragment1;
import com.example.rahul.setalarm.fragments.TabFragment2;
import com.example.rahul.setalarm.fragments.TabFragment3;
import com.example.rahul.setalarm.sharedPreferences.PrefManager;

public class MainActivity extends AppCompatActivity {

    PrefManager prefManager;
    TextView tvemail, tvpasss;
    ImageView profile, logout;
    SectionPagerAdapter sectionPagerAdapter;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool);
        toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        setSupportActionBar(toolbar);

        viewPager=(ViewPager)findViewById(R.id.container);
        setUpViewPager(viewPager);


        TabLayout tabLayout=(TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


    }

    public void setUpViewPager(ViewPager viewPager)
    {
        sectionPagerAdapter=new SectionPagerAdapter(getSupportFragmentManager());
        sectionPagerAdapter.addFragment(new TabFragment1(),"Home");
        sectionPagerAdapter.addFragment(new TabFragment2(),"Music");
        sectionPagerAdapter.addFragment(new TabFragment3(),"History");
       // sectionPagerAdapter.addFragment(new TabFragment4(),"Frag4");
        viewPager.setAdapter(sectionPagerAdapter);

    }

}
