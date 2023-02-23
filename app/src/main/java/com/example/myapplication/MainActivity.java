package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
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
        // создание объекта Intent для запуска второй активности
        Intent intent = new Intent(this, Catalog.class);
        activityMainBinding.editTextTextPersonName.addTextChangedListener(new PhoneNumberFormattingTextWatcher());



        activityMainBinding.buttonGotovo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Ну, нажали", Toast.LENGTH_SHORT);
                toast.show();
                String name = activityMainBinding.editTextTextPersonName.getText().toString();
                String phone = activityMainBinding.editTextPhone.getText().toString();
                Log.i(TAG, "нажали программно");
                // передача объекта с ключом "name" и значением "именя"
                intent.putExtra("name", name);
                intent.putExtra("phone", phone);
// запуск SecondActivity
                startActivity(intent);
            }
        }

        );
        setContentView(view);




    }

    @Override
    protected void onStart() {
        super.onStart();
        Bundle arguments = getIntent().getExtras();
        try {
            String name_from = arguments.get("name").toString();
            TextView editText = findViewById(R.id.editTextTextPersonName);
            editText.setText(name_from);
            String phone_from = arguments.get("phone").toString();
            TextView editText_phone = findViewById(R.id.editTextPhone);
            editText_phone.setText(phone_from);
            String done = arguments.get("done").toString();
            TextView editText_done = findViewById(R.id.textView_done);
            editText_done.setText(done);
        } catch (NullPointerException e){
            System.out.println();
        }

    }
}