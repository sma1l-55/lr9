package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView textView = findViewById(R.id.changeTxt);
        textView.setTextColor(getResources().getColor(R.color.newColorSuperMegaCool));
        textView.setBackgroundColor(getResources().getColor(R.color.newColorSuperMega));

        TextView textView1 = findViewById(R.id.main2);
        textView1.setTextColor(ContextCompat.getColor(this, R.color.newColorSuperMega));
        textView1.setBackgroundColor(ContextCompat.getColor(this, R.color.newColorSuperMegaCool));
    }
}