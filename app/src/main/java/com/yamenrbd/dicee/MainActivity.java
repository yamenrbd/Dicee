package com.yamenrbd.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);
        ImageView leftDice = (ImageView) findViewById(R.id.image_diceLeft);
        ImageView rightDice = (ImageView) findViewById(R.id.image_diceright);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("Dicee","the randome number is "+ number);
            }
        });

    }
}
