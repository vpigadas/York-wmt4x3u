package com.york.sample.wmt4x3u.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.york.sample.wmt4x3u.R;
import com.york.sample.wmt4x3u.databinding.ActivityCustomFragmentBinding;

public class CustomFragmentActivity extends AppCompatActivity {

    private ActivityCustomFragmentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomFragmentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        FirstFragment firstFragment1 = FirstFragment.newInstance("Top Screen");
        FirstFragment firstFragment2 = FirstFragment.newInstance("Bottom Screen");

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, firstFragment1);
        transaction.replace(R.id.fragment_container_second, firstFragment2);
        transaction.commit();

    }
}