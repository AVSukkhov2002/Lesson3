package ru.mirea.sukhovav.sharer;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ActivityResultLauncher<Intent> activityResultLauncher;
    static final String KEY = "book";
    static final String USER_MESSAGE="MESSAGE";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);



        ActivityResultCallback<ActivityResult> callback = new ActivityResultCallback<ActivityResult>() {

            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    Intent data = result.getData();

                    String userBook = data.getStringExtra(USER_MESSAGE);

                    textView.setText("название вашей любимой книги - " + userBook);
                }
            }
        };

        activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), callback);
    }

    public void onClick(View view){
        Intent intent = new Intent(this, secondActivity.class);
        activityResultLauncher.launch(intent);
    }
}