package com.example.newcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout;
    Button button;
    int[] arr = {100,123,111,154,130,95,42,16,18,212};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Random random = new Random();
               int r = arr[random.nextInt(10)];
                int g = arr[random.nextInt(10)];
                int b = arr[random.nextInt(10)];
               int color = Color.argb(255,r,g,b);
               layout.setBackgroundColor(color);

            }
        });
    }
}
