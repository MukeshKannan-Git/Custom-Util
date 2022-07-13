package com.example.cintassdk;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.customutilites.Model;
import com.example.customutilites.Utils;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.insertRoom(getApplicationContext(), new Model(1, "Hello", "World"));
        List<Model> modelList = Utils.getRoom(getApplicationContext());
    }
}