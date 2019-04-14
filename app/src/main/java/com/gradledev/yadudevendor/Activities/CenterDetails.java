package com.gradledev.yadudevendor.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.gradledev.yadudevendor.R;

public class CenterDetails extends AppCompatActivity {

    String center,registration,gst,employees;
    Button goToSecond;
    EditText centerName,registrationNo,gstNo,noOfEmployees;
    RadioButton googleYes,googleNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center_details);
        centerName=(EditText)findViewById(R.id.centerName);
        registrationNo=(EditText)findViewById(R.id.registrationNo);
        gstNo=(EditText)findViewById(R.id.gstNo);
        noOfEmployees=(EditText)findViewById(R.id.noOfEmployees);
        googleYes=(RadioButton)findViewById(R.id.googleYes);
        googleNo=(RadioButton)findViewById(R.id.googleNo);

        center=centerName.getText().toString();
        registration=registrationNo.getText().toString();
        gst=gstNo.getText().toString();
        employees=noOfEmployees.getText().toString();

        goToSecond=(Button)findViewById(R.id.goToSecond);
        goToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String verified = "nil";

                if (googleYes.isChecked()) {
                    verified = "google verified";
                } else if (googleNo.isChecked()) {
                    verified = "google not verified";
                }

                Intent i=new Intent(CenterDetails.this,ContactDetails.class);
                i.putExtra("centerName",center);
                i.putExtra("registrationNo",registration);
                i.putExtra("gstNo",gst);
                i.putExtra("noOfEmployees",employees);
                i.putExtra("verified",verified);

                startActivity(i);


            }
        });
    }


    public void googleYes(View view) {
        googleYes.setChecked(true);
        googleNo.setChecked(false);
    }

    public void googleNo(View view) {
        googleYes.setChecked(false);
        googleNo.setChecked(true);
    }

}
