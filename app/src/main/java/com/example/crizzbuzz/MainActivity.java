package com.example.crizzbuzz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager view;
    ViewpagerAdpter viewpagerAdpter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab=findViewById(R.id.tabe);
        view=findViewById(R.id.viewpager);

        viewpagerAdpter= new ViewpagerAdpter(getSupportFragmentManager());
        viewpagerAdpter.addfragments(new Info_fragment(),"Info");
        viewpagerAdpter.addfragments(new Live_fragment(),"Live");
        viewpagerAdpter.addfragments(new Scorecard_fragment(),"Scorecard");
        viewpagerAdpter.addfragments(new Squads_fragment(),"Squads");
        viewpagerAdpter.addfragments(new Overs_fragment(),"overs");
        viewpagerAdpter.addfragments(new Highlits_fragment(),"highlits");
        view.setAdapter(viewpagerAdpter);
        tab.setupWithViewPager(view);

    }
}