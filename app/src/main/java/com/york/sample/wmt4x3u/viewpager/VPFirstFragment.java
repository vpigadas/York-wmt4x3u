package com.york.sample.wmt4x3u.viewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.york.sample.wmt4x3u.databinding.FragmentVPFirstBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VPFirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VPFirstFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private FragmentVPFirstBinding binding;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VPFirstFragment() {
        // Required empty public constructor
    }

    public static VPFirstFragment newInstance(String param1, String param2) {
        VPFirstFragment fragment = new VPFirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentVPFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.firstTxt.setText(mParam1);
        binding.secondTxt.setText(mParam2);
    }
}