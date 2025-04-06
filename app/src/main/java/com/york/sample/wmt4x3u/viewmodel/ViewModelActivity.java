package com.york.sample.wmt4x3u.viewmodel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.york.sample.wmt4x3u.databinding.ActivityViewModelBinding;

public class ViewModelActivity extends AppCompatActivity {

    private ActivityViewModelBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewModelBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(binding.fragmentContainerOne.getId(), OneFragment.newInstance());
        transaction.replace(binding.fragmentContainerSecond.getId(), TwoFragment.newInstance());
        transaction.commit();
    }
}