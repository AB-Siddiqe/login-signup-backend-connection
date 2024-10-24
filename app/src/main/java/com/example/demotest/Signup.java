package com.example.demotest;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Signup extends AppCompatActivity {
    EditText UserName, Email, Password, Re_Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        String n=getIntent().getStringExtra("UserName");
        String e=getIntent().getStringExtra("Email");
        String p=getIntent().getStringExtra("Password");
        String p2=getIntent().getStringExtra("Re_Password");

        UserName=findViewById(R.id.editText);
        Email=findViewById(R.id.editTextText2);
        Password=findViewById(R.id.editText3);
        Re_Password=findViewById(R.id.editText4);

        UserName.setText(n);
        Email.setText(e);
        Password.setText(p);
        Re_Password.setText(p2);

    }
}