package com.york.sample.wmt4x3u.database;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.google.gson.Gson;
import com.york.sample.wmt4x3u.databinding.ActivityDatabaseBinding;

import java.util.List;

public class DatabaseActivity extends AppCompatActivity {

    private ActivityDatabaseBinding binding;
    private DatabaseViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDatabaseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(DatabaseViewModel.class);
        viewModel.intialise(this);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

//        DatabaseInstance instance = Room.databaseBuilder(this, DatabaseInstance.class, "MyDatabase")
//                .build();
//
//        List<UserTable> tableList = instance.getUserdao().retrieve();
//        if(tableList.isEmpty()){
//
//        }

        viewModel.data.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.databaseTxt.setText(s);
            }
        });

        viewModel.readAsync().observe(this, new Observer<List<UserTable>>() {

            @Override
            public void onChanged(List<UserTable> userTables) {
                String string = new Gson().toJson(userTables);
                binding.databaseTxt.setText(string);
            }
        });

        binding.databaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                viewModel.createData();
                viewModel.createDataAsync();
            }
        });

    }
}