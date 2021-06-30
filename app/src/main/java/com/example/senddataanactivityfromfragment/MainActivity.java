package com.example.senddataanactivityfromfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.pm.FeatureGroupInfo;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MyListener{

    TextView textView;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager =getSupportFragmentManager();

        textView = findViewById(R.id.textView);

        FragmentT fragmentT = new FragmentT();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.frameLayout,fragmentT,"TT");
        transaction.commit();
    }

    @Override
    public void sum(int number1, int number2) {

        int sum = number1 + number2;
        textView.setText("Answer " +sum);

    }
}