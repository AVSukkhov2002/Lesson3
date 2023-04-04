package ru.mirea.sukhovav.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        TextView textView = new TextView(this);
        textView.setTextSize(26);
        textView.setPadding(16, 16, 16, 16);

        Bundle arguments = getIntent().getExtras();
        String data = arguments.getString("dateString");
        String num = arguments.getString("number");

        textView.setText("квадрат значения моего номера по списку в группе состовляет " + num + "\n а текущее время " + data);

        setContentView(textView);

    }
}