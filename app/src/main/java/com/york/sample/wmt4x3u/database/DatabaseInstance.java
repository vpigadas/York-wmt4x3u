package com.york.sample.wmt4x3u.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {UserTable.class}, version = 1)
public abstract class DatabaseInstance extends RoomDatabase {
    abstract UserDao getUserdao();
}
