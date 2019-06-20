package com.example.android.quizmobiledevelopment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mButton1, mButton2, mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.button_tutorial1);
        mButton2 = findViewById(R.id.button_tutorial2);
        mButton3 = findViewById(R.id.button_tutorial3);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String video_key = "zQekzaAgIlQ";
                Intent intent = new Intent(MainActivity.this, VideoActivity.class);
                intent.putExtra("KEY", video_key);
                startActivity(intent);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String video_key = "qk5F6Bxqhr4";
                Intent intent = new Intent(MainActivity.this, VideoActivity.class);
                intent.putExtra("KEY", video_key);
                startActivity(intent);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String video_key = "9OWmnYPX1uc";
                Intent intent = new Intent(MainActivity.this, VideoActivity.class);
                intent.putExtra("KEY", video_key);
                startActivity(intent);
            }
        });
    }
}
