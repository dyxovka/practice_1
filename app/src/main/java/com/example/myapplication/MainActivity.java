package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_LONG );
        toast.show();
        Log.e(TAG, "ошибка, onCreate");
        Log.d(TAG, "debug onCreate");
        Log.i(TAG, "information onCreate");
        Log.w(TAG, "warning onCreate");
        Log.v(TAG, "verbose onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_LONG );
        toast.show();
        Log.e(TAG, "ошибка, onStart");
        Log.d(TAG, "debug onStart");
        Log.i(TAG, "information onStart");
        Log.w(TAG, "warning onStart");
        Log.v(TAG, "verbose onStart");

    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_LONG );
        toast.show();
        Log.e(TAG, "ошибка, onStop");
        Log.d(TAG, "debug onStop");
        Log.i(TAG, "information onStop");
        Log.w(TAG, "warning onStop");
        Log.v(TAG, "verbose onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_LONG );
        toast.show();
        Log.e(TAG, "ошибка, onDestroy");
        Log.d(TAG, "debug onDestroy");
        Log.i(TAG, "information onDestroy");
        Log.w(TAG, "warning onDestroy");
        Log.v(TAG, "verbose onDestroy");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_LONG );
        toast.show();
        Log.e(TAG, "ошибка, onPause");
        Log.d(TAG, "debug onPause");
        Log.i(TAG, "information onPause");
        Log.w(TAG, "warning onPause");
        Log.v(TAG, "verbose onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_LONG );
        toast.show();
        Log.e(TAG, "ошибка, onResume");
        Log.d(TAG, "debug onResume");
        Log.i(TAG, "information onResume");
        Log.w(TAG, "warning onResume");
        Log.v(TAG, "verbose onResume");
    }
}