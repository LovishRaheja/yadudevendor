package com.gradledev.yadudevendor.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gradledev.yadudevendor.R;

public class ManagerDetails extends AppCompatActivity {
    Button goToFifth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_details);
        goToFifth=(Button)findViewById(R.id.goToFifth);
        goToFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(ManagerDetails.this,VehiclesServiced.class);
                startActivity(i);

            }
        });
    }
}
