package com.gradledev.yadudevendor.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gradledev.yadudevendor.R;

public class UploadDocuments extends AppCompatActivity {
    Button goToNinth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_documents);
        goToNinth=(Button)findViewById(R.id.goToNinth);
        goToNinth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UploadDocuments.this,Membership.class);
                startActivity(i);

            }
        });
    }
}
