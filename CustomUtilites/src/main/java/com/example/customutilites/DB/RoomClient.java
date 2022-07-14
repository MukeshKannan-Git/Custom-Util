package com.example.customutilites.DB;

import android.content.Context;

import java.util.List;

public class RoomClient {

    public static void insert(Context context, Model model) {
        if (context != null && model != null) {
            RoomDB roomDB = RoomDB.getInstance(context.getApplicationContext());
            roomDB.personDao().insertPerson(model);
        }
    }

    public static void delete(Context context, int userID) {
        if (context != null) {
            RoomDB roomDB = RoomDB.getInstance(context.getApplicationContext());
            roomDB.personDao().deletePerson(userID);
        }
    }

    public static List<Model> get(Context context) {
        if (context != null) {
            RoomDB roomDB = RoomDB.getInstance(context.getApplicationContext());
            return roomDB.personDao().getPersonList();
        }
        return null;
    }
}
