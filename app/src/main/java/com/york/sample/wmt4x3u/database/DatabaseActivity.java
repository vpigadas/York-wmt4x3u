package com.york.sample.wmt4x3u.database;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.york.sample.wmt4x3u.R;

import java.util.List;

public class DatabaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        DatabaseInstance instance = Room.databaseBuilder(this, DatabaseInstance.class, "MyDatabase")
                .allowMainThreadQueries()
                .build();

        List<UserTable> tableList = instance.getUserdao().retrieve();
        if(tableList.isEmpty()){

        }
    }
}