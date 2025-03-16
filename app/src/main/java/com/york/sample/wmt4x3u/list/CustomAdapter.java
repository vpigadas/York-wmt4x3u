package com.york.sample.wmt4x3u.list;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.york.sample.wmt4x3u.databinding.HolderItemBinding;
import com.york.sample.wmt4x3u.databinding.HolderSecondItemBinding;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private List<String> arrayData;

    public CustomAdapter(List<String> arrayData) {
        this.arrayData = arrayData;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_item, parent, false);
            HolderItemBinding view = HolderItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

            return new CustomViewHolder(view);
        } else {
            //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_item, parent, false);
            HolderSecondItemBinding view = HolderSecondItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

            return new SecondCustomViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        String data = arrayData.get(position);
        holder.bind(data);
    }

    @Override
    public int getItemCount() {
        return arrayData.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 0) {
            return super.getItemViewType(position);
        } else {
            return 1;
        }
    }
}
