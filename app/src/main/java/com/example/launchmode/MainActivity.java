package com.example.launchmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    Button sendToBactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate() : ");

        sendToBactButton = findViewById(R.id.buttonGoToActivityBID);

        sendToBactButton.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() : ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() : ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() : ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() : ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() : ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() : ");
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,ActivityB.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}