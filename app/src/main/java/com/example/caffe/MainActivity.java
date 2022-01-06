package com.example.caffe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editTextTextPersonName);

    }

    public void sent(View view) {
        String myName=name.getText().toString();
        Intent intent=new Intent(this,MainActivity2.class);
        if(!myName.isEmpty()){
        intent.putExtra("name",myName);
        startActivity(intent);}
        else {
            Toast.makeText(this,"This fild cannt be empty",Toast.LENGTH_LONG).show();
        }

    }
}