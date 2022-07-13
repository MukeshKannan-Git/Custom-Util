package com.example.customutilites;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class Utils {

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

    public static JSONObject getSystemDetails() {
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("SERIAL: ", Build.SERIAL);
            jsonObject.put("MODEL: ", Build.MODEL);
            jsonObject.put("ID: ", Build.ID);
            jsonObject.put("Manufacture: ", Build.MANUFACTURER);
            jsonObject.put("BRAND: ", Build.BRAND);
            jsonObject.put("TYPE: ", Build.TYPE);
            jsonObject.put("USER: ", Build.USER);
            jsonObject.put("BASE: ", Build.VERSION_CODES.BASE);
            jsonObject.put("INCREMENTAL ", Build.VERSION.INCREMENTAL);
            jsonObject.put("SDK  ", Build.VERSION.SDK);
            jsonObject.put("BOARD: ", Build.BOARD);
            jsonObject.put("BRAND ", Build.BRAND);
            jsonObject.put("HOST ", Build.HOST);
            jsonObject.put("FINGERPRINT: ", Build.FINGERPRINT);
            jsonObject.put("VERSION CODE: ", Build.VERSION.RELEASE);
            return jsonObject;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new JSONObject();
    }
}
