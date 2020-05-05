package com.myapplicationdev.android.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay ;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tgBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay=findViewById(R.id.buttonDisplay);
        etInput=findViewById(R.id.editTextInput);
        tgBtn = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tgBtn.isChecked()){
                    String stringResponse = etInput.getText().toString();
                    tvDisplay.setText(stringResponse);
                }else{
                    tvDisplay.refreshDrawableState();
                    etInput.setEnabled(false);
                    btnDisplay.setEnabled(false);
                    tvDisplay.setEnabled(false);
            }
        }
    });
}}
