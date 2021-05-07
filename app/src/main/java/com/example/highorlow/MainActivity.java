package com.example.highorlow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n;

    public void click(View view){
     Log.i("info",Integer.toString(n));
    EditText editText = (EditText) findViewById(R.id.editTextNumber);
    int guess = Integer.parseInt(editText.getText().toString());
    String message;
        if (guess > n){
        message = "Lower";
    }
        else if (guess<n){
        message = "Higher";
    }
        else {
        message="You got it";
        Random rand = new Random();
        n = rand.nextInt(20)+1;
    }
        Toast.makeText(this,message, Toast.LENGTH_LONG).show();}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        n = rand.nextInt(20)+1;
    }
}