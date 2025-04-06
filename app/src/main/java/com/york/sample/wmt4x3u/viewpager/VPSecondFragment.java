package com.york.sample.wmt4x3u.viewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.york.sample.wmt4x3u.databinding.FragmentVPSecondBinding;

public class VPSecondFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";

    private FragmentVPSecondBinding binding;

    private String mParam1;

    public VPSecondFragment() {
        // Required empty public constructor
    }

    public static VPSecondFragment newInstance(String param1) {
        VPSecondFragment fragment = new VPSecondFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentVPSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.fragmentText.setText(mParam1);
    }
}