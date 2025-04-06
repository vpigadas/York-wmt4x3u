package com.york.sample.wmt4x3u.viewmodel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NumberViewModel extends ViewModel {

    private MutableLiveData<Integer> _number = new MutableLiveData<Integer>(0);
    public LiveData<Integer> number = _number;

    public void increase() {
        _number.postValue(_number.getValue() + 1);
        Log.d("NumberViewModel", "Number increased to " + number.getValue());
    }

    public int read() {
        Log.d("NumberViewModel", "Current number is " + number);
        return number.getValue();
    }
}
