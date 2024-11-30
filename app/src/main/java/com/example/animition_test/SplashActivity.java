package com.example.animition_test;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animition_test.DetailActivity;
import com.example.animition_test.R;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DURATION = 3000; // Duration for the splash screen

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Button btnSkip = findViewById(R.id.btnSkip);

        // Handle the Skip button click
        btnSkip.setOnClickListener(v -> navigateToMainActivity());

        // Use a Handler with the main Looper to wait for the specified duration
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            if (!isFinishing()) { // Check if the activity is not finishing
                navigateToMainActivity();
            }
        }, SPLASH_DURATION);
    }

    private void navigateToMainActivity() {
        Intent intent = new Intent(SplashActivity.this, ListViewFragment.class); // Navigate to MainActivity
        startActivity(intent);
        finish(); // Close the SplashActivity
    }
}
