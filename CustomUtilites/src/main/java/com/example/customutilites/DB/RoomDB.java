package com.example.customutilites.DB;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@androidx.room.Database(entities = Model.class, exportSchema = false, version = 1)
public abstract class RoomDB extends RoomDatabase {

    private static final String DB_NAME = "person_db";
    private static RoomDB instance;

    public abstract PersonDao personDao();

    public static synchronized RoomDB getInstance(Context context) {

        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), RoomDB.class,
                    DB_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
