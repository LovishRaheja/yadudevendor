package com.gradledev.yadudevendor.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.gradledev.yadudevendor.Adapter.BikeServiceAdapter;
import com.gradledev.yadudevendor.Adapter.CarServiceAdapter;
import com.gradledev.yadudevendor.Adapter.GeneralServiceAdapter;
import com.gradledev.yadudevendor.Adapter.RSAServcieAdapter;
import com.gradledev.yadudevendor.Adapter.VehicleTypeAdapter;
import com.gradledev.yadudevendor.R;
import com.gradledev.yadudevendor.model.VehicleServices;

import java.util.ArrayList;

public class ServicesProvided extends AppCompatActivity {
    ListView vehicleTypeListView,generalServicesListView,bikeServicesListView,carServicesListView,rsaListView;
    ArrayList<VehicleServices> vehicleTypeList=new ArrayList<>();
    ArrayList<VehicleServices> generalServiceList=new ArrayList<>();
    ArrayList<VehicleServices> bikeServiceList=new ArrayList<>();
    ArrayList<VehicleServices> carServiceList=new ArrayList<>();
    ArrayList<VehicleServices> rsaList=new ArrayList<>();

    Button goToSeventh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_provided);

        goToSeventh=(Button)findViewById(R.id.goToSeventh);
        goToSeventh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(ServicesProvided.this,BankDetails.class);
                startActivity(i);

            }
        });


        vehicleTypeListView=(ListView)findViewById(R.id.vehicleTypeListView);
        generalServicesListView=(ListView)findViewById(R.id.generalServicesListView);
        bikeServicesListView=(ListView)findViewById(R.id.bikeServicesListView);
        carServicesListView=(ListView)findViewById(R.id.carServicesListView);
        rsaListView=(ListView)findViewById(R.id.rsaListView);

        vehicleTypeList.add(new VehicleServices("All",false));
        vehicleTypeList.add(new VehicleServices("Auto Rickshaw",false));
        vehicleTypeList.add(new VehicleServices("Bus",false));
        vehicleTypeList.add(new VehicleServices("Cars",false));
        vehicleTypeList.add(new VehicleServices("Heavy Duty Vehicles",false));
        vehicleTypeList.add(new VehicleServices("Motorcycles / Bikes",false));
        vehicleTypeList.add(new VehicleServices("Trucks",false));

        generalServiceList.add(new VehicleServices("All",false));
        generalServiceList.add(new VehicleServices("Air condition service",false));
        generalServiceList.add(new VehicleServices("Alignments",false));
        generalServiceList.add(new VehicleServices("Brake repair specialists",false));
        generalServiceList.add(new VehicleServices("Complete computer diagnostics",false));
        generalServiceList.add(new VehicleServices("Complete safety analysis",false));
        generalServiceList.add(new VehicleServices("Coolant system",false));
        generalServiceList.add(new VehicleServices("Denting and painting",false));
        generalServiceList.add(new VehicleServices("Drivability problems",false));
        generalServiceList.add(new VehicleServices("Electrical systems",false));
        generalServiceList.add(new VehicleServices("Electrical systems",false));
        generalServiceList.add(new VehicleServices("Emission repair facility",false));
        generalServiceList.add(new VehicleServices("Engine work",false));
        generalServiceList.add(new VehicleServices("Filtration",false));
        generalServiceList.add(new VehicleServices("Fuel system services",false));
        generalServiceList.add(new VehicleServices("Genuine spare part",false));
        generalServiceList.add(new VehicleServices("Maintenance",false));
        generalServiceList.add(new VehicleServices("Mufflers and exhaust system",false));
        generalServiceList.add(new VehicleServices("Steering and suspensions",false));
        generalServiceList.add(new VehicleServices("Tow Truck",false));
        generalServiceList.add(new VehicleServices("Tune-UPS",false));
        generalServiceList.add(new VehicleServices("Tyres",false));
        generalServiceList.add(new VehicleServices("Vehicle insurance",false));
        generalServiceList.add(new VehicleServices("Washing",false));



        bikeServiceList.add(new VehicleServices("All",false));
        bikeServiceList.add(new VehicleServices("Accident Vehicles",false));
        bikeServiceList.add(new VehicleServices("Air filter cleaning",false));
        bikeServiceList.add(new VehicleServices("Battery check",false));
        bikeServiceList.add(new VehicleServices("Brake pad/ liner replacement",false));
        bikeServiceList.add(new VehicleServices("Carburetor cleaning",false));
        bikeServiceList.add(new VehicleServices("Chain/sprocket replacements",false));
        bikeServiceList.add(new VehicleServices("Clutch check and adujustment",false));
        bikeServiceList.add(new VehicleServices("Clutch repairs",false));
        bikeServiceList.add(new VehicleServices("Disk brake oil top up",false));
        bikeServiceList.add(new VehicleServices("Electric wiring repairs",false));
        bikeServiceList.add(new VehicleServices("Engine Rebuilding",false));
        bikeServiceList.add(new VehicleServices("Engine oil change",false));
        bikeServiceList.add(new VehicleServices("Fork repairs",false));
        bikeServiceList.add(new VehicleServices("Full Body Denting",false));
        bikeServiceList.add(new VehicleServices("Full Body Painting",false));
        bikeServiceList.add(new VehicleServices("Full bike servicing",false));
        bikeServiceList.add(new VehicleServices("Lights and indicator check",false));
        bikeServiceList.add(new VehicleServices("Modification",false));
        bikeServiceList.add(new VehicleServices("Oil/grease the chain and other parts",false));
        bikeServiceList.add(new VehicleServices("Petrol tank cleanIng",false));
        bikeServiceList.add(new VehicleServices("Rear brake check/setting",false));
        bikeServiceList.add(new VehicleServices("Regular Service",false));
        bikeServiceList.add(new VehicleServices("Spark plug cleaning",false));
        bikeServiceList.add(new VehicleServices("Tyre check",false));
        bikeServiceList.add(new VehicleServices("Valve setting",false));
        bikeServiceList.add(new VehicleServices("Washing and Cleaning",false));


        carServiceList.add(new VehicleServices("All",false));
        carServiceList.add(new VehicleServices("Accident vehicles",false));
        carServiceList.add(new VehicleServices("Battery check",false));
        carServiceList.add(new VehicleServices("Brakes check",false));
        carServiceList.add(new VehicleServices("Break pads",false));
        carServiceList.add(new VehicleServices("CNG Kit Servicing",false));
        carServiceList.add(new VehicleServices("Car diagnostics",false));
        carServiceList.add(new VehicleServices("Clutch",false));
        carServiceList.add(new VehicleServices("ECM Check",false));
        carServiceList.add(new VehicleServices("Electric systems check",false));
        carServiceList.add(new VehicleServices("Engine Rebuilding",false));
        carServiceList.add(new VehicleServices("Engine Tunning",false));
        carServiceList.add(new VehicleServices("Engine oil change",false));
        carServiceList.add(new VehicleServices("Filters check and replacing",false));
        carServiceList.add(new VehicleServices("Fuel System",false));
        carServiceList.add(new VehicleServices("Full body denting",false));
        carServiceList.add(new VehicleServices("Full body painting",false));
        carServiceList.add(new VehicleServices("Full car servicing",false));
        carServiceList.add(new VehicleServices("Minor body repair",false));
        carServiceList.add(new VehicleServices("Modification",false));
        carServiceList.add(new VehicleServices("Suspension",false));
        carServiceList.add(new VehicleServices("Tyres check",false));
        carServiceList.add(new VehicleServices("Vacuum cleaning",false));
        carServiceList.add(new VehicleServices("Washing & Cleaning",false));
        carServiceList.add(new VehicleServices("Wheel Balancing",false));

        rsaList.add(new VehicleServices("Wheel",false));
        rsaList.add(new VehicleServices("24x7 Roadside Assistance",false));
        rsaList.add(new VehicleServices("Accidental Towing",false));
        rsaList.add(new VehicleServices("Battery Jumpstart",false));
        rsaList.add(new VehicleServices("Breakdown Assistance",false));
        rsaList.add(new VehicleServices("Flat Tyre",false));
        rsaList.add(new VehicleServices("Fuel Problems",false));
        rsaList.add(new VehicleServices("Lost or locked keys",false));
        rsaList.add(new VehicleServices("Medical Coordination",false));
        rsaList.add(new VehicleServices("Minor On-site repairs",false));
        rsaList.add(new VehicleServices("Taxi Service",false));
        rsaList.add(new VehicleServices("Towing Service",false));


        VehicleTypeAdapter vehicleTypeAdapter=new VehicleTypeAdapter(vehicleTypeList,ServicesProvided.this);
        vehicleTypeListView.setAdapter(vehicleTypeAdapter);

        GeneralServiceAdapter generalServiceAdapter=new GeneralServiceAdapter(generalServiceList,ServicesProvided.this);
        generalServicesListView.setAdapter(generalServiceAdapter);

        BikeServiceAdapter bikeServiceAdapter=new BikeServiceAdapter(bikeServiceList,ServicesProvided.this);
        bikeServicesListView.setAdapter(bikeServiceAdapter);

        CarServiceAdapter carServiceAdapter=new CarServiceAdapter(carServiceList,ServicesProvided.this);
        carServicesListView.setAdapter(carServiceAdapter);

        RSAServcieAdapter rsaServcieAdapter=new RSAServcieAdapter(rsaList,ServicesProvided.this);
        rsaListView.setAdapter(rsaServcieAdapter);
    }
}
