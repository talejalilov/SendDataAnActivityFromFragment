package com.example.senddataanactivityfromfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentT extends Fragment {

    EditText number1, number2;
    Button addActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_b,container,false);

        number1 = view.findViewById(R.id.number1);
        number2  =view.findViewById(R.id.number2);

        addActivity = view.findViewById(R.id.addActivityBtn);

        addActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });

        return view;
    }

    public void sendData(){
        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());

        MyListener listener = (MyListener) getActivity();
        listener.sum(num1,num2);

    }
}
