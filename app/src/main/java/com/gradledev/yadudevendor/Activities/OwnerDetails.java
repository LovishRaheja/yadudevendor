package com.gradledev.yadudevendor.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gradledev.yadudevendor.R;

public class OwnerDetails extends AppCompatActivity {
    Button goToFourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_details);
        goToFourth=(Button)findViewById(R.id.goToFourth);
        goToFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(OwnerDetails.this,ManagerDetails.class);
                startActivity(i);

            }
        });
    }
}
