package ru.mirea.sukhovav.sharer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClick(View view){
        Intent data = new Intent();
        EditText text = findViewById(R.id.edText);

        String book = text.getText().toString();
        data.putExtra(MainActivity.USER_MESSAGE, book);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}