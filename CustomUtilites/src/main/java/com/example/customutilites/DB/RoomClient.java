package com.example.customutilites.DB;

import android.content.Context;
import java.util.List;

public class RoomClient {

    public static void insert(final Context context, final Model model) {
        RoomDB roomDB = RoomDB.getInstance(context.getApplicationContext());
        roomDB.personDao().insertPerson(model);
    }

    public static void delete(final Context context, int userID) {
        RoomDB roomDB = RoomDB.getInstance(context.getApplicationContext());
        roomDB.personDao().deletePerson(userID);
    }

    public static List<Model> get(final Context context) {
        RoomDB roomDB = RoomDB.getInstance(context.getApplicationContext());
        return roomDB.personDao().getPersonList();
    }
}
