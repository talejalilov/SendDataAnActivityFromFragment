package com.example.senddataanactivityfromfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MyListener{

    FragmentManager manager;
    FragmentTransaction transaction;
    FragmentC fragmentC ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager =getSupportFragmentManager();
        transaction = manager.beginTransaction();


        FragmentB fragmentB = new FragmentB();
        fragmentC = new FragmentC();
        transaction.add(R.id.frameLayoutC,fragmentC );
        transaction.add(R.id.frameLayoutB,fragmentB );
        transaction.commit();
    }

    @Override
    public void sum(int number1, int number2) {

        fragmentC.subTit(number1,number2);



    }
}