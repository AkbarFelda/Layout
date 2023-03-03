package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {
    Button btn_Akbar;
    Button btn_Kia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btn_Akbar = (Button) findViewById(R.id.btn_Akbar);
        btn_Kia = (Button) findViewById(R.id.btn_Kia);

        btn_Akbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Profile.this, Akbar_Profile.class);
                startActivity(pindah);
            }
        });

        btn_Kia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Profile.this, Profile_Kia.class);
                startActivity(pindah);
            }
        });
    }
}