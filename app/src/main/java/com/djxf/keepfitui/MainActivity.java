package com.djxf.keepfitui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    Button buttonRegister;
    EditText buttonWeigth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editText = findViewById(R.id.et_height);
        buttonWeigth = findViewById(R.id.et_weight);
        buttonRegister = findViewById(R.id.btn_register);

        buttonRegister.setOnClickListener(v -> {
            if (!editText.getText().toString().equals("")) {
                int height = Integer.parseInt(editText.getText().toString());
                if (height <= 0 || height >= 300) {
                    Toast.makeText(this, "身高" + editText.getText().toString() + "有误，请重新输入！", Toast.LENGTH_LONG).show();
                }
            }
            if (!buttonWeigth.getText().toString().equals("")) {
                int height = Integer.parseInt(buttonWeigth.getText().toString());
                if (height <= 0 || height >= 300) {
                    Toast.makeText(this, "体重" + buttonWeigth.getText().toString() + "有误，请重新输入！", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}