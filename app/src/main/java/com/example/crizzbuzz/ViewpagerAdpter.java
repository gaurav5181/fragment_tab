package com.example.crizzbuzz;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewpagerAdpter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();

    public ViewpagerAdpter(@NonNull FragmentManager fm)
    {

        super(fm);
    }




    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        return fragments.get(position);
    }

    @Override
    public int getCount()
    {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return name.get(position);
    }

    public void addfragments(Fragment fragment, String string)
    {

        fragments.add(fragment);
        name.add(string);


    }
}
  ;