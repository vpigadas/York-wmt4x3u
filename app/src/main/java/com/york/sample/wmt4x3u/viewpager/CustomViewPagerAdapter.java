package com.york.sample.wmt4x3u.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class CustomViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> dataList;

    public CustomViewPagerAdapter(@NonNull FragmentManager fm, List<Fragment> dataList) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public int getCount() {
        return dataList.size();
    }
}
