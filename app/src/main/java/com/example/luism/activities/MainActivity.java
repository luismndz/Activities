package com.example.luism.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button faceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        faceButton = (Button)findViewById(R.id.button_facebook);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYouTube();
            }
        });

        faceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFaceBook();
            }
        });
    }


    public void openYouTube(){
        Intent intent = new Intent(this, YouTube.class);
        startActivity(intent);
    }
    public void openFaceBook(){
        Intent intent = new Intent(this, FaceBook.class);
        startActivity(intent);
    }
}
