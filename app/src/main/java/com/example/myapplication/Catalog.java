package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityCatalogBinding;

public class Catalog extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        ActivityCatalogBinding activityCatalogBinding = ActivityCatalogBinding.inflate(getLayoutInflater());
        View view = activityCatalogBinding.getRoot();
        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("name").toString();
        String phone = arguments.getString("phone");
        System.out.println(name);
        TextView textView1 = findViewById(R.id.textView5);
        activityCatalogBinding.textView5.setText(name);
        textView1.setText(name);


        Intent intent1 = new Intent(this, MainActivity.class);
        activityCatalogBinding.buttonGotovo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent1.putExtra("name", name);
                intent1.putExtra("done", "Вы просмотрели каталог");
                intent1.putExtra("phone", phone);
                startActivity(intent1);
            }
        });
        setContentView(view);

    }
}