package com.york.sample.wmt4x3u.viewpager;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.york.sample.wmt4x3u.databinding.ActivityViewPagerBinding;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {

    private ActivityViewPagerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewPagerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        binding.viewPager.setAdapter(new CustomViewPagerAdapter(getSupportFragmentManager(), generateFragmentList()));
    }

    private List<Fragment> generateFragmentList() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(VPFirstFragment.newInstance("FIRST", "SECOND"));
        fragments.add(VPSecondFragment.newInstance("FIRST"));
        fragments.add(VPFirstFragment.newInstance("THIRD", "FOURTH"));
        fragments.add(VPSecondFragment.newInstance("SECOND"));

        fragments.add(VPFirstFragment.newInstance("FIRST", "SECOND"));
        fragments.add(VPSecondFragment.newInstance("FIRST"));
        fragments.add(VPFirstFragment.newInstance("THIRD", "FOURTH"));
        fragments.add(VPSecondFragment.newInstance("SECOND"));

        fragments.add(VPFirstFragment.newInstance("FIRST", "SECOND"));
        fragments.add(VPSecondFragment.newInstance("FIRST"));
        fragments.add(VPFirstFragment.newInstance("THIRD", "FOURTH"));
        fragments.add(VPSecondFragment.newInstance("SECOND"));
        return fragments;
    }
}