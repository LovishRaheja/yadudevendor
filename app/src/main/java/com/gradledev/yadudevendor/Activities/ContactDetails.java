package com.gradledev.yadudevendor.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.gradledev.yadudevendor.R;

public class ContactDetails extends AppCompatActivity {

    Button goToThird;
    String googleVerified;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);
        googleVerified=getIntent().getStringExtra("verified");
        Toast.makeText(this, googleVerified, Toast.LENGTH_SHORT).show();
        goToThird=(Button)findViewById(R.id.goToThird);
        goToThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ContactDetails.this,OwnerDetails.class);
                startActivity(i);
            }
        });
    }
}
