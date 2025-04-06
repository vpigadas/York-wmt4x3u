package com.york.sample.wmt4x3u.database;


import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    public void insert(UserTable userTable) throws Exception;

    @Update
    public void update(UserTable userTable) throws Exception;

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void save(UserTable userTable);

    @Delete
    public void delete(UserTable userTable);

    @Query("SELECT * FROM UserTable")
    public List<UserTable> retrieve();

    @Query("SELECT * FROM UserTable")
    public LiveData<List<UserTable>> retrieveAsyc();

    @Query("SELECT * FROM UserTable LIMIT 1")
    @Nullable
    public UserTable retrieveFirst();

    @Query("SELECT * FROM UserTable WHERE name like :parameter")
    public List<UserTable> retrieve(String parameter);

}
