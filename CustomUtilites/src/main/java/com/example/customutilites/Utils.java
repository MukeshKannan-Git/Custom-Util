package com.example.customutilites;

import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.AlertDialog;
import org.json.JSONObject;

public class Utils {

    public static void showAlert(Context context, String title, String message){
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(android.R.string.yes, null).show();
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
