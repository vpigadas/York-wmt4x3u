package com.york.sample.wmt4x3u.list;

import androidx.annotation.NonNull;

import com.york.sample.wmt4x3u.databinding.HolderItemBinding;
import com.york.sample.wmt4x3u.databinding.HolderSecondItemBinding;

public class SecondCustomViewHolder extends BaseViewHolder {

    private HolderSecondItemBinding binding;

    public SecondCustomViewHolder(@NonNull HolderSecondItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    @Override
    public void bind(String data) {
        binding.holderText.setText(data);
//        TextView textView = itemView.findViewById(R.id.holder_text);
//        textView.setText(data);
    }
}
