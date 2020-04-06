package com.example.second_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView text;
    Button button;
    TextView text2;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.color_text);
        button = findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("faourite color is gold");
            }
        });


        text2 = findViewById(R.id.impact_text);
        button2 = findViewById(R.id.btn2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText("Technology ahs changed the way we learn. Today, one can earn a micro degree on Udacity, or simply learn a skill on YouTube. It is clear that in the near future, classrooms will be supplementary. ");

            }
        });
    }
}
