package com.york.sample.wmt4x3u.database;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.room.Room;

import com.google.gson.Gson;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DatabaseViewModel extends ViewModel {

    private DatabaseInstance instance;
    private Executor executor = new ThreadPoolExecutor(1, 5, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());

    private MutableLiveData<String> _data = new MutableLiveData<>();
    public LiveData<String> data = _data;


    public void intialise(Context context) {
        instance = Room.databaseBuilder(context, DatabaseInstance.class, "MyDatabase")
                //.allowMainThreadQueries()
                .build();

//        read();
    }

    public void read() {
        List<UserTable> dataList = instance.getUserdao().retrieve();

        String string = new Gson().toJson(dataList);

        _data.postValue(string);
        //_data.setValue(string);

    }

    public LiveData<List<UserTable>> readAsync() {
        return instance.getUserdao().retrieveAsyc();
    }

    public void createData() {
        UserTable user = new UserTable();
        user.setAge(100);
        user.setName("Vassilis");

        instance.getUserdao().save(user);
        //read();
    }

    public void createDataAsync() {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                UserTable user = new UserTable();
                user.setAge(100);
                user.setName("Vassilis");

                instance.getUserdao().save(user);
            }
        });


    }
}
