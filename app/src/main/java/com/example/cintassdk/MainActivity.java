package com.example.cintassdk;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.customutilites.DB.Model;
import com.example.customutilites.DB.RoomClient;
import com.example.customutilites.Utils;

import org.json.JSONObject;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}