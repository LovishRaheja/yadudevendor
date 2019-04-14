package com.gradledev.yadudevendor.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.gradledev.yadudevendor.Adapter.AutoRickshawCompaniesAdapter;
import com.gradledev.yadudevendor.Adapter.BikeCompanyAdapter;
import com.gradledev.yadudevendor.Adapter.BusCompanyAdapter;
import com.gradledev.yadudevendor.Adapter.CarCompanyAdapter;
import com.gradledev.yadudevendor.Adapter.HeavyVehicleAdapter;
import com.gradledev.yadudevendor.Adapter.TruckCompanyAdapter;
import com.gradledev.yadudevendor.Adapter.VehicleTypeAdapter;
import com.gradledev.yadudevendor.R;
import com.gradledev.yadudevendor.model.VehicleServices;

import java.util.ArrayList;

public class VehiclesServiced extends AppCompatActivity {
    ListView vehicleTypeListView,bikeCompaniesListView,carCompaniesListView,autoCompaniesListView,truckCompaniesListView,busCompaniesListView,heavyCompaniesListView;
    // creating arraylist of MyItem type to set to adapter
    ArrayList<VehicleServices> vehicleTypeList=new ArrayList<>();
    ArrayList<VehicleServices> bikeList=new ArrayList<>();
    ArrayList<VehicleServices> carList=new ArrayList<>();
    ArrayList<VehicleServices> autoList=new ArrayList<>();
    ArrayList<VehicleServices> truckList=new ArrayList<>();
    ArrayList<VehicleServices> busList=new ArrayList<>();
    ArrayList<VehicleServices> heavyList=new ArrayList<>();

    Button goToSixth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicles_serviced);
        vehicleTypeListView=(ListView)findViewById(R.id.vehicleTypeListView);
        bikeCompaniesListView=(ListView)findViewById(R.id.bikeCompaniesListView);
        carCompaniesListView=(ListView)findViewById(R.id.carCompaniesListView);
        autoCompaniesListView=(ListView)findViewById(R.id.autoCompaniesListView);
        truckCompaniesListView=(ListView)findViewById(R.id.truckCompaniesListView);
        busCompaniesListView=(ListView)findViewById(R.id.busCompaniesListView);
        heavyCompaniesListView=(ListView)findViewById(R.id.heavyCompaniesListView);

        goToSixth=(Button)findViewById(R.id.goToSixth);
        goToSixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(VehiclesServiced.this,ServicesProvided.class);
                startActivity(i);
            }
        });
        //Adding data i.e images and title to be set to adapter to populate listview
        //here i am passing  string to be set as title and boolean as a parameter to MyItem Constructor as our
        //ArrayList is type of MyItem
        vehicleTypeList.add(new VehicleServices("All",false));
        vehicleTypeList.add(new VehicleServices("Auto Rickshaw",false));
        vehicleTypeList.add(new VehicleServices("Bus",false));
        vehicleTypeList.add(new VehicleServices("Cars",false));
        vehicleTypeList.add(new VehicleServices("Heavy Duty Vehicles",false));
        vehicleTypeList.add(new VehicleServices("Motorcycles / Bikes",false));
        vehicleTypeList.add(new VehicleServices("Trucks",false));


        bikeList.add(new VehicleServices("All",false));
        bikeList.add(new VehicleServices("Aprilia",false));
        bikeList.add(new VehicleServices("BMW",false));
        bikeList.add(new VehicleServices("Bajaj",false));
        bikeList.add(new VehicleServices("DSK Benelli",false));
        bikeList.add(new VehicleServices("Ducati",false));
        bikeList.add(new VehicleServices("Eider",false));
        bikeList.add(new VehicleServices("Harley Davidson",false));
        bikeList.add(new VehicleServices("Hero Honda",false));
        bikeList.add(new VehicleServices("Hero MotoCorp",false));
        bikeList.add(new VehicleServices("Hollister",false));
        bikeList.add(new VehicleServices("Honda",false));
        bikeList.add(new VehicleServices("Husqvarna",false));
        bikeList.add(new VehicleServices("Hyosung",false));
        bikeList.add(new VehicleServices("Indian Motorcycle",false));
        bikeList.add(new VehicleServices("KTM",false));
        bikeList.add(new VehicleServices("Kawasaki",false));
        bikeList.add(new VehicleServices("Keeway",false));
        bikeList.add(new VehicleServices("Kinetic",false));
        bikeList.add(new VehicleServices("LML",false));
        bikeList.add(new VehicleServices("Lohia",false));
        bikeList.add(new VehicleServices("MV Agusta",false));
        bikeList.add(new VehicleServices("Mahindra",false));
        bikeList.add(new VehicleServices("Moto Guzzi",false));
        bikeList.add(new VehicleServices("Palatino",false));
        bikeList.add(new VehicleServices("Peugeot",false));
        bikeList.add(new VehicleServices("Regal Raptor",false));
        bikeList.add(new VehicleServices("Royal Enfield",false));
        bikeList.add(new VehicleServices("Suzuki",false));
        bikeList.add(new VehicleServices("TVS",false));
        bikeList.add(new VehicleServices("Terra",false));
        bikeList.add(new VehicleServices("Triumph",false));
        bikeList.add(new VehicleServices("UM Motorcycles",false));
        bikeList.add(new VehicleServices("UML India",false));
        bikeList.add(new VehicleServices("Vespa",false));
        bikeList.add(new VehicleServices("Victory",false));
        bikeList.add(new VehicleServices("Vyrus",false));
        bikeList.add(new VehicleServices("Yamaha",false));




        carList.add(new VehicleServices("All",false));
        carList.add(new VehicleServices("Ashok Leyland",false));
        carList.add(new VehicleServices("Aston Martin",false));
        carList.add(new VehicleServices("Audi",false));
        carList.add(new VehicleServices("Bentley",false));
        carList.add(new VehicleServices("BMW",false));
        carList.add(new VehicleServices("Caterham",false));
        carList.add(new VehicleServices("Chevrolet",false));
        carList.add(new VehicleServices("Datsun",false));
        carList.add(new VehicleServices("DC",false));
        carList.add(new VehicleServices("Ferrari",false));
        carList.add(new VehicleServices("Fiat",false));
        carList.add(new VehicleServices("Force",false));
        carList.add(new VehicleServices("Ford",false));
        carList.add(new VehicleServices("Hindustan Motors",false));
        carList.add(new VehicleServices("Honda",false));
        carList.add(new VehicleServices("Hyundai",false));
        carList.add(new VehicleServices("ICML",false));
        carList.add(new VehicleServices("Isuzu",false));
        carList.add(new VehicleServices("Jaguar",false));
        carList.add(new VehicleServices("Lamborghini",false));
        carList.add(new VehicleServices("Land Rover",false));
        carList.add(new VehicleServices("Mahindra",false));
        carList.add(new VehicleServices("Mahindra Renault",false));
        carList.add(new VehicleServices("Mahindra Ssangyong",false));
        carList.add(new VehicleServices("Maruti",false));
        carList.add(new VehicleServices("Maserati",false));
        carList.add(new VehicleServices("Mercedes Benz",false));
        carList.add(new VehicleServices("Suzuki",false));
        carList.add(new VehicleServices("Mini",false));
        carList.add(new VehicleServices("Mitsubishi",false));
        carList.add(new VehicleServices("Nissan",false));
        carList.add(new VehicleServices("Opel",false));
        carList.add(new VehicleServices("Porsche",false));
        carList.add(new VehicleServices("Premier",false));
        carList.add(new VehicleServices("Renault",false));
        carList.add(new VehicleServices("Rolls Royce",false));
        carList.add(new VehicleServices("San Motors",false));
        carList.add(new VehicleServices("Skoda",false));
        carList.add(new VehicleServices("Tata",false));
        carList.add(new VehicleServices("Toyota",false));
        carList.add(new VehicleServices("Volkswagen",false));
        carList.add(new VehicleServices("Volvo",false));


        autoList.add(new VehicleServices("All",false));
        autoList.add(new VehicleServices("Ape",false));
        autoList.add(new VehicleServices("Atul",false));
        autoList.add(new VehicleServices("Bajaj",false));
        autoList.add(new VehicleServices("Champion",false));
        autoList.add(new VehicleServices("JSA",false));
        autoList.add(new VehicleServices("Kinetic Green",false));
        autoList.add(new VehicleServices("Mahindra",false));
        autoList.add(new VehicleServices("Piaggio",false));
        autoList.add(new VehicleServices("Shakti",false));
        autoList.add(new VehicleServices("TVS",false));
        autoList.add(new VehicleServices("Vikram",false));


        truckList.add(new VehicleServices("All",false));
        truckList.add(new VehicleServices("AMW",false));
        truckList.add(new VehicleServices("Ashok Leyland",false));
        truckList.add(new VehicleServices("Atul",false));
        truckList.add(new VehicleServices("Bajaj",false));
        truckList.add(new VehicleServices("BharatBenz",false));
        truckList.add(new VehicleServices("Eicher",false));
        truckList.add(new VehicleServices("Eicher Polaris",false));
        truckList.add(new VehicleServices("Force",false));
        truckList.add(new VehicleServices("Hino",false));
        truckList.add(new VehicleServices("Isuzu",false));
        truckList.add(new VehicleServices("Kamaz",false));
        truckList.add(new VehicleServices("Lohia",false));
        truckList.add(new VehicleServices("Mahindra",false));
        truckList.add(new VehicleServices("Man",false));
        truckList.add(new VehicleServices("Maruti Suzuki",false));
        truckList.add(new VehicleServices("Piaggio",false));
        truckList.add(new VehicleServices("SML Isuzu",false));
        truckList.add(new VehicleServices("Scania",false));
        truckList.add(new VehicleServices("Tata",false));
        truckList.add(new VehicleServices("Volvo",false));



        busList.add(new VehicleServices("All",false));
        busList.add(new VehicleServices("Ashok Leyland",false));
        busList.add(new VehicleServices("BharatBenz",false));
        busList.add(new VehicleServices("Eicher",false));
        busList.add(new VehicleServices("Force",false));
        busList.add(new VehicleServices("JBM",false));
        busList.add(new VehicleServices("Mahindra",false));
        busList.add(new VehicleServices("MAN",false));
        busList.add(new VehicleServices("Scania",false));
        busList.add(new VehicleServices("SML Isuzu",false));
        busList.add(new VehicleServices("Tata",false));
        busList.add(new VehicleServices("Volvo",false));


        heavyList.add(new VehicleServices("All",false));
        heavyList.add(new VehicleServices("Bulldozer",false));
        heavyList.add(new VehicleServices("Road Roller",false));
        heavyList.add(new VehicleServices("Hydra",false));
        heavyList.add(new VehicleServices("Crane",false));
        heavyList.add(new VehicleServices("Backhoe",false));
        heavyList.add(new VehicleServices("Excavator",false));
        heavyList.add(new VehicleServices("Soil Compactor",false));
        heavyList.add(new VehicleServices("Super Loader",false));
        heavyList.add(new VehicleServices("Heavy Hauler",false));




        VehicleTypeAdapter vehicleTypeAdapter=new VehicleTypeAdapter(vehicleTypeList,VehiclesServiced.this);
        vehicleTypeListView.setAdapter(vehicleTypeAdapter);

        BikeCompanyAdapter bikeCompanyAdapter=new BikeCompanyAdapter(bikeList,VehiclesServiced.this);
        bikeCompaniesListView.setAdapter(bikeCompanyAdapter);

        CarCompanyAdapter carCompanyAdapter=new CarCompanyAdapter(carList,VehiclesServiced.this);
        carCompaniesListView.setAdapter(carCompanyAdapter);

        AutoRickshawCompaniesAdapter autoRickshawCompaniesAdapter=new AutoRickshawCompaniesAdapter(autoList,VehiclesServiced.this);
        autoCompaniesListView.setAdapter(autoRickshawCompaniesAdapter);

        TruckCompanyAdapter truckCompaniesAdapter=new TruckCompanyAdapter(truckList,VehiclesServiced.this);
        truckCompaniesListView.setAdapter(truckCompaniesAdapter);

        BusCompanyAdapter busCompanyAdapter=new BusCompanyAdapter(busList,VehiclesServiced.this);
        busCompaniesListView.setAdapter(busCompanyAdapter);

        HeavyVehicleAdapter heavyVehicleAdapter=new HeavyVehicleAdapter(heavyList,VehiclesServiced.this);
        heavyCompaniesListView.setAdapter(heavyVehicleAdapter);

    }
}
