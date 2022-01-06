package com.example.caffe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView hello;
    CheckBox sugar;
    CheckBox milk;
    CheckBox lemon;
    RadioButton tea;
    RadioButton cafe;
    String oder;
    String typeDrink="Tea";
    Spinner spinnerTea;
    Spinner spinnerCoffee;
    String result;
    StringBuffer additions=new StringBuffer();
    String st;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        hello=findViewById(R.id.textViewName);
        st=getIntent().getStringExtra("name");
        hello.setText("Hello  "+st);
        sugar= findViewById(R.id.checkBoxSugar);
        milk=findViewById(R.id.checkBoxMilk);
        lemon=findViewById(R.id.checkBoxLime);
        spinnerTea=findViewById(R.id.spinnertea);
        spinnerCoffee=findViewById(R.id.spinnercofe);

    }

    public void oder(View view) {

        if(typeDrink=="Tea"){
            String [] teaarr=getResources().getStringArray(R.array.tea);
            result=teaarr[spinnerTea.getSelectedItemPosition()];
            Toast.makeText(this,result,Toast.LENGTH_LONG).show();
        } else{String [] coffearr=getResources().getStringArray(R.array.cofe);
            result=coffearr[spinnerCoffee.getSelectedItemPosition()];
            Toast.makeText(this,result,Toast.LENGTH_LONG).show();

        }
        if(sugar.isChecked()){
            additions.append("Sugar ");

        }
        if(milk.isChecked()){
            additions.append("Milk ");
        }
        if(lemon.isChecked()){
            additions.append("Lemon ");
        }
        oder=String.format("Клиент  %s заказал %s  с %s ",st, result,additions.toString());
        Toast.makeText(this,oder,Toast.LENGTH_LONG).show();


    }

    public void typeofdrink(View view) {
        if(view.getId()==R.id.radioButtonTea){
            typeDrink="Tea";
            spinnerTea.setVisibility(View.VISIBLE);
            spinnerCoffee.setVisibility(View.GONE);


        }else {typeDrink="Coffee";
        spinnerCoffee.setVisibility(View.VISIBLE);
        spinnerTea.setVisibility(View.GONE);}
    }
}