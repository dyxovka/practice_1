package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import com.example.myapplication.databinding.ActivityMainBinding;
import com.google.android.material.progressindicator.BaseProgressIndicator;

public class MainActivity extends AppCompatActivity  {
    private static final String TAG = "MyApp";
    public void onMyButtonClick(View view)
    {
        // выводим сообщение
        Toast.makeText(this, "Предсказуемо", Toast.LENGTH_LONG).show();
        Log.i(TAG, "нажали декларативно");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding  activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();

        activityMainBinding.buttonGotovo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Ну, нажали", Toast.LENGTH_SHORT);
                toast.show();
                Log.i(TAG, "нажали программно");
            }
        }

        );
        setContentView(view);




    }



}