package com.example.customutilites;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.util.List;

public class Utils extends Thread{

    private static List<Model> modelList;

    public static void showToast(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }

    public static void showlONGToast(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }

    public static void insertRoom(final Context context, final Model model){
        RoomDB roomDB = RoomDB.getInstance(context.getApplicationContext());
        roomDB.personDao().insertPerson(model);
    }

    public static List<Model> getRoom(final Context context){
        RoomDB roomDB = RoomDB.getInstance(context.getApplicationContext());
        modelList =  roomDB.personDao().getPersonList();
        return modelList;
    }
}
