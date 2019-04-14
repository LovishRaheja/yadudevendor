package com.gradledev.yadudevendor.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.gradledev.yadudevendor.Adapter.MembershipAdapter;
import com.gradledev.yadudevendor.Adapter.VehicleTypeAdapter;
import com.gradledev.yadudevendor.MainActivity;
import com.gradledev.yadudevendor.R;
import com.gradledev.yadudevendor.model.VehicleServices;

import java.util.ArrayList;

public class Membership extends AppCompatActivity {
    ListView membershipListView;
    ArrayList<VehicleServices> membershipList=new ArrayList<>();
    Button goToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership);

        goToMain=(Button)findViewById(R.id.goToMain);
        goToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Membership.this,MainActivity.class);
                startActivity(i);

            }
        });

        membershipListView=(ListView)findViewById(R.id.membershipListView);

        membershipList.add(new VehicleServices("Bus Service Provider",false));
        membershipList.add(new VehicleServices("Earth Movers/ Heavy Duty Vehicle Service Provider",false));
        membershipList.add(new VehicleServices("Four Wheelers (Cars) Service Provider",false));
        membershipList.add(new VehicleServices("Others",false));
        membershipList.add(new VehicleServices("PUC",false));
        membershipList.add(new VehicleServices("Three Wheelers (Auto Rickshaw) Service Provider",false));
        membershipList.add(new VehicleServices("Toe Service Provider",false));
        membershipList.add(new VehicleServices("Tractor Service Provider",false));
        membershipList.add(new VehicleServices("TruckService Provider",false));
        membershipList.add(new VehicleServices("Two Wheelers Service Provider",false));

        MembershipAdapter membershipAdapter=new MembershipAdapter(membershipList,Membership.this);
        membershipListView.setAdapter(membershipAdapter);
    }
}
