package com.example.animition_test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Initialize views
        ImageButton button = findViewById(R.id.btn2);
        ImageView imageView = findViewById(R.id.detail_image);
        TextView textView = findViewById(R.id.detail_quote);

        // Get data from Intent
        String quote = getIntent().getStringExtra("quote");
        int image = getIntent().getIntExtra("image", 0);

        // Set data to views
        imageView.setImageResource(image);
        textView.setText(quote);

        // Handle button click (e.g., navigating back to MainActivity)
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to MainActivity or previous activity
                Intent intent = new Intent(DetailActivity.this, SplashActivity.class);
                startActivity(intent);
                finish(); // Close the DetailActivity
            }
        });
    }
}
