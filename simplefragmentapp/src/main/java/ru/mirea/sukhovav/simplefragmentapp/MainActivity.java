package ru.mirea.sukhovav.simplefragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Fragment fragment1, fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1 = new FirstFragment();
        fragment2 = new SecondFragment();
    }

    public void onClick(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        switch (view.getId()){
            case R.id.btnFirstFragment:

                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment1).commit();

                break;
            case R.id.btnSecondFragment:

                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment2).commit();

                break;
            default:
                break;
        }
    }
}