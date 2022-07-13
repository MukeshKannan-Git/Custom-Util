package com.example.customutilites;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import com.google.gson.JsonObject;

import org.json.JSONObject;

public class Utils {

    public static void showAlert(Context context, String title, String message) {
        if (context != null) {
            new AlertDialog.Builder(context)
                    .setTitle(title)
                    .setMessage(message)
                    .setPositiveButton(android.R.string.yes, null).show();
        }
    }

    public static void showToast(Context context, String message) {
        if (context != null && message != null)
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static JsonObject getSystemDetails() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("SERIAL          \t : ", Build.SERIAL);
        jsonObject.addProperty("MODEL           \t : ", Build.MODEL);
        jsonObject.addProperty("ID              \t : ", Build.ID);
        jsonObject.addProperty("Manufacture     \t : ", Build.MANUFACTURER);
        jsonObject.addProperty("BRAND           \t : ", Build.BRAND);
        jsonObject.addProperty("TYPE            \t : ", Build.TYPE);
        jsonObject.addProperty("USER            \t : ", Build.USER);
        jsonObject.addProperty("BASE            \t : ", Build.VERSION_CODES.BASE);
        jsonObject.addProperty("INCREMENTAL     \t : ", Build.VERSION.INCREMENTAL);
        jsonObject.addProperty("SDK             \t : ", Build.VERSION.SDK);
        jsonObject.addProperty("BOARD           \t : ", Build.BOARD);
        jsonObject.addProperty("BRAND           \t : ", Build.BRAND);
        jsonObject.addProperty("HOST            \t : ", Build.HOST);
        jsonObject.addProperty("FINGERPRINT     \t : ", Build.FINGERPRINT);
        jsonObject.addProperty("ANDROID VERSION \t : ", Build.VERSION.RELEASE);
        return jsonObject;
    }
}
