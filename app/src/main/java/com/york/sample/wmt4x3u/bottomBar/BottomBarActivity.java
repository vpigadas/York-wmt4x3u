package com.york.sample.wmt4x3u.bottomBar;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationBarView;
import com.york.sample.wmt4x3u.R;
import com.york.sample.wmt4x3u.databinding.ActivityBottomBarBinding;
import com.york.sample.wmt4x3u.viewpager.VPFirstFragment;
import com.york.sample.wmt4x3u.viewpager.VPSecondFragment;

public class BottomBarActivity extends AppCompatActivity {

    private ActivityBottomBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBottomBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        binding.bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.item_1) {
                    gotoMenu1();
                    return true;
                } else if (item.getItemId() == R.id.item_2) {
                    gotoMenu2();
                    return true;
                } else if (item.getItemId() == R.id.item_3) {
                    gotoMenu1();
                    return true;
                } else {
                    return false;
                }
            }
        });
        binding.bottomNavigation.setSelectedItemId(R.id.item_1);
    }

    private void gotoMenu2() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(binding.fragmentContainer.getId(), VPSecondFragment.newInstance("FRIST"));
        transaction.commit();
    }

    private void gotoMenu1() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(binding.fragmentContainer.getId(), VPFirstFragment.newInstance("FRIST", "SECOND"));
        transaction.commit();
    }
}