package com.example.customutilites;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.util.List;

public class Utils extends Thread {

    public static void insertRoom(final Context context, final Model model) {
        RoomDB roomDB = RoomDB.getInstance(context.getApplicationContext());
        roomDB.personDao().insertPerson(model);
    }

    public static void deleteRoom(final Context context, int userID) {
        RoomDB roomDB = RoomDB.getInstance(context.getApplicationContext());
        roomDB.personDao().deletePerson(userID);
    }

    public static List<Model> getRoom(final Context context) {
        RoomDB roomDB = RoomDB.getInstance(context.getApplicationContext());
        return roomDB.personDao().getPersonList();
    }
    
}
