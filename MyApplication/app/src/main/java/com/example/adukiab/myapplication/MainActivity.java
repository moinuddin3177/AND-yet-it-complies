package com.example.adukiab.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper dbh;
    EditText editName,editLoginId,editEmail,editPwd;
    Button register_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbh=new DatabaseHelper(this);
        editName=(EditText)findViewById()
    }
}
