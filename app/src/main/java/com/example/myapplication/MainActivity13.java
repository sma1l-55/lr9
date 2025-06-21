package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main13);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView textView = findViewById(R.id.changeTxt);
        String text = textView.getText().toString();
        textView.setText("Hello");
        for(int i = 0; i < 5; i++)
        {
            textView.append(text);
        }
        String str1 = new String("Hello Android");
        String str2 = "Hello Android";
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        if(a == b) {
            Log.i("a==b", "true");
        }
        else
        {
            Log.e("a==b", "false");
        }
        if(a == c) {
            Log.i("a==c", "true");
        }
        else
        {
            Log.e("a==c", "false");
        }
        if(a.equals(b))
        {
            Log.i("a.equals(b)", "true");
        }
        else
        {
            Log.e("a.equals(b)", "false");
        }
        if(a.equals(c))
        {
            Log.i("a.equals(c)", "true");
        }
        else
        {
            Log.e("a.equals(c)", "false");
        }
        String result;
        result = "test" + 1 + "|" + 2 + "test";
        Log.e("Конкатенация-1", result);
        String firstName = "Zakhar";
        String secondName = "Shapovalov";
        result = firstName + secondName;
        Log.e("Конкатенация-2", result);
        result = firstName + " | " + secondName;
        Log.e("Конкатенация-3", result);
        String form2 = getString(R.string.app_name);
        Log.e("Form", form2);
        String result2 = String.format("Value: %d", 42);
        Log.e("Form", result2);
        String str = "Hello Android";
        int length = str.length(); // 13

// Получение символа по индексу
        char ch = str.charAt(1); // 'e'

// Получение подстрок
        String sub1 = str.substring(6); // "Android"
        String sub2 = str.substring(0, 5); // "Hello"

// Поиск в строке
        int index = str.indexOf("And"); // 6
        boolean contains = str.contains("Hello"); // true

// Замена подстроки
        String replaced = str.replace("Hello", "Hi"); // "Hi Android"

// Разделение строки
        String[] parts = str.split(" "); // ["Hello", "Android"]

// Изменение регистра
        String upper = str.toUpperCase(); // "HELLO ANDROID"
        String lower = str.toLowerCase(); // "hello android"

// Удаление пробелов
        String withSpaces = " text ";
        String trimmed = withSpaces.trim(); // "text"

    }
}