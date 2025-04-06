package com.york.sample.wmt4x3u.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.york.sample.wmt4x3u.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    public FirstFragment() {
        // Required empty public constructor
    }

    public static FirstFragment newInstance(String paramer1) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString("name", "Vassilis");
        args.putInt("age", 100);
        args.putString("parameter", paramer1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        if (getArguments() != null) {
//            String name = getArguments().getString("name");
//            int age = getArguments().getInt("age");
//            String parameter = getArguments().getString("parameter");
//        }

        if (getArguments() == null) {
            return;
        }

        String name = getArguments().getString("name");
        int age = getArguments().getInt("age");
        String parameter = getArguments().getString("parameter");

        binding.firstTxt.setText(name);
        binding.secondTxt.setText(parameter);
    }
}