package com.example.preferenciassettings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.prefs.Preferences;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    SharedPreferences prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);

    }

    public  void abri_preferencias (View view){
        Intent intento = new Intent(this, SettingsActivity.class);
        startActivity(intento);
    }
    public  void recuperar_email (View view){
        //el nombre de la actividad
        prefs = getSharedPreferences("com.example.preferenciassettings_preferences", Context.MODE_PRIVATE);

        String email=prefs.getString("email", "default@gmail.com");

        tv1.setText(email);


    }
}