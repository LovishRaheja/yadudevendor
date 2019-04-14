package com.gradledev.yadudevendor.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gradledev.yadudevendor.R;

public class BankDetails extends AppCompatActivity {
    Button goToEight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_details);
        goToEight=(Button)findViewById(R.id.goToEight);
        goToEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(BankDetails.this,UploadDocuments.class);
                startActivity(i);

            }
        });
    }
}
