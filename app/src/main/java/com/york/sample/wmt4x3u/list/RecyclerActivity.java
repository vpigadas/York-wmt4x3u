package com.york.sample.wmt4x3u.list;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.york.sample.wmt4x3u.databinding.ActivityRecyclerBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    private ActivityRecyclerBinding binding;
    private CustomListAdapter adapter;

    private int round = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecyclerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        adapter = new CustomListAdapter();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        //binding.recyclerView.setAdapter(new CustomAdapter(generateDummyData()));
        binding.recyclerView.setAdapter(adapter);

        binding.reculerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                round = round + 1;
                adapter.submitList(generateDummyData(round));
            }
        });
    }

    private List<String> generateDummyData() {
        List<String> array = new ArrayList<>();
        for (int i = 0; i < 999999; i++) {
            array.add(String.valueOf(i));
        }

        return array;
    }

    private List<String> generateDummyData(int round) {
        List<String> array = new ArrayList<>();
        for (int i = 0; i < (round * 10); i++) {
            array.add(String.valueOf(i));
        }

        return array;
    }
}