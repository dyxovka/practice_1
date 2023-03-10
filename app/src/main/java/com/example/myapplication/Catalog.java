package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityCatalogBinding;

public class Catalog extends AppCompatActivity {
    public static final int INFOACTIVITY_CODE =100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        ActivityCatalogBinding activityCatalogBinding = ActivityCatalogBinding.inflate(getLayoutInflater());
        View view = activityCatalogBinding.getRoot();
        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("name").toString();
        TextView textView1 = findViewById(R.id.textView5);
        activityCatalogBinding.textView5.setText(name);
        textView1.setText(name);
        activityCatalogBinding.buttonGotovo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("ccc",textView1.getText().toString());
                setResult(INFOACTIVITY_CODE,intent);
                finish();
            }
        });
        setContentView(view);

    }
}