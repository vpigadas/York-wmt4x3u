package com.york.sample.wmt4x3u.list;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class CustomDiffUtils extends DiffUtil.ItemCallback<String> {
    @Override
    public boolean areItemsTheSame(@NonNull String oldItem, @NonNull String newItem) {
        return oldItem == newItem;
    }

    @Override
    public boolean areContentsTheSame(@NonNull String oldItem, @NonNull String newItem) {
        return oldItem.equals(newItem);
    }
}
