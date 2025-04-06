package com.york.sample.wmt4x3u;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.york.sample.wmt4x3u.bottomBar.BottomBarActivity;
import com.york.sample.wmt4x3u.database.DatabaseActivity;
import com.york.sample.wmt4x3u.databinding.ActivityMainBinding;
import com.york.sample.wmt4x3u.fragment.CustomFragmentActivity;
import com.york.sample.wmt4x3u.list.RecyclerActivity;
import com.york.sample.wmt4x3u.network.NetworkActivity;
import com.york.sample.wmt4x3u.viewmodel.ViewModelActivity;
import com.york.sample.wmt4x3u.viewpager.ViewPagerActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivityForResult(intent, 2000);
            }
        });

        binding.mainBtnNetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NetworkActivity.class);
                intent.putExtra("title", "Network!!!");
                startActivity(intent);
            }
        });

        binding.mainBtnRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
                startActivity(intent);
            }
        });

        binding.mainBtnFragments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomFragmentActivity.class);
                startActivity(intent);
            }
        });

        binding.mainBtnDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DatabaseActivity.class);
                startActivity(intent);
            }
        });

        binding.mainBtnViewpager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewPagerActivity.class);
                startActivity(intent);
            }
        });

        binding.mainBtnBottomNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BottomBarActivity.class);
                startActivity(intent);
            }
        });

        binding.mainBtnViewmodel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewModelActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data != null) {
            String name = data.getStringExtra("name");
            int age = data.getIntExtra("age", 0);

            Log.d("Main", "on Activity Result -> name:" + name + ", age:" + age);
        }

    }

//    @Override
//    public void onBackPressed() {
//        //super.onBackPressed();
//    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}