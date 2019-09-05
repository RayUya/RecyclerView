package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // For Debugging
    private static final String TAG = "MainActivity";

    // Variables
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
        
    }

    private void initImageBitmaps() {

        Log.d(TAG, "initImageBitmaps: preparing bitmaps");

        mImageUrls.add("https://travel.jumia.com/blog/ng/wp-content/uploads/2016/01/the-new-uyo.jpg");
        mNames.add("Abia");

        mImageUrls.add("https://hotels.ng/guides/wp-content/uploads/2017/05/Calabar-for-Michelle.jpg");
        mNames.add("Adamawa");

        mImageUrls.add("https://guardian.ng/wp-content/uploads/2017/12/enugustatewebsite_mexygabriel-1-1062x598.jpg");
        https://travel.jumia.com/blog/ng/wp-content/uploads/2016/01/the-new-uyo.jpg
        mNames.add("Akwa Ibom");

        mImageUrls.add("https://travel.jumia.com/blog/ng/wp-content/uploads/2017/03/port-harcourt.jpg");
        https://upload.wikimedia.org/wikipedia/commons/1/19/Awka247.jpg
        mNames.add("Anambra");

        mImageUrls.add("https://answersafrica.com/wp-content/uploads/2017/08/Abj.jpg");
        mNames.add("Bauchi");

        mImageUrls.add("");
        mNames.add("Bayelsa");

        mImageUrls.add("https://hotels.ng/guides/wp-content/uploads/2017/07/owerri-center.jpg");
        mNames.add("Benue");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/1/19/Awka247.jpg");
        mNames.add("Borno");

        mImageUrls.add("https://www.africa.com/wp-content/uploads/2010/04/Benin.jpg");
        https://hotels.ng/guides/wp-content/uploads/2017/05/Calabar-for-Michelle.jpg
        mNames.add("Cross River");

        mImageUrls.add("http://asaba.com/wp-content/uploads/2018/01/asaba-2.jpg");
        mNames.add("Delta");

        mImageUrls.add("https://www.naijaloaded.com.ng/wp-content/uploads/2017/09/5924227_fbimg1504696306406_jpegc26ec6f90ad371ba60a2f5506bf77e2c.jpeg");
        mNames.add("Ebonyi");

        mImageUrls.add("https://www.africa.com/wp-content/uploads/2010/04/Benin.jpg");
        mNames.add("Edo");

        mImageUrls.add("https://www.cometonigeria.com/wp-content/uploads/FAJUYI-MEMORIAL-PARKADO-EKITI.jpg");
        mNames.add("Ekiti");

        mImageUrls.add("https://guardian.ng/wp-content/uploads/2017/12/enugustatewebsite_mexygabriel-1-1062x598.jpg");
        mNames.add("Enugu");

        mImageUrls.add("https://answersafrica.com/wp-content/uploads/2017/08/Abj.jpg");
        mNames.add("FCT");

        mImageUrls.add("https://hotels.ng/places/media/poi/616/gom6.jpg-616-573c4056d3ffd.jpg?w=300");
        mNames.add("Gombe");

        mImageUrls.add(" https://hotels.ng/guides/wp-content/uploads/2017/07/owerri-center.jpg");
        mNames.add("Imo");

        mImageUrls.add("http://www.jigawastate.gov.ng/images/round.png");
        mNames.add("Jigawa");

        mImageUrls.add("https://guardian.ng/wp-content/uploads/2017/11/kaduna.jpg");
        mNames.add("Kaduna");

        mImageUrls.add("https://www.kanostate.gov.ng/sites/default/files/3.jpeg");
        mNames.add("Kano");

        mImageUrls.add("https://guardian.ng/wp-content/uploads/2019/02/katsina-640x360.jpg");
        mNames.add("Kastina");

        mImageUrls.add("https://hotels.ng/places/media/poi/1443/federal-university-birnin-kebbi-OnBA5BQeYBLyG8lvlZNZf5yTXtYQP84pNqGY71db.jpeg?w=300");
        mNames.add("Kebbi");

        mImageUrls.add("https://i1.wp.com/media.premiumtimesng.com/wp-content/files/2012/09/Arial-view-of-flooded-lokoja-city3.jpg?fit=860%2C645&ssl=1");
        mNames.add("Kogi");

        mImageUrls.add("https://travel.jumia.com/blog/ng/wp-content/uploads/2016/04/ilorin_central_mosque-660x400.jpg");
        mNames.add("Kwara");

        mImageUrls.add("https://dailypost.ng/wp-content/uploads/2016/08/Lagos-hotels.jpg");
        mNames.add("Lagos");

        mImageUrls.add("https://www.independent.ng/wp-content/uploads/2018/01/Lafia.png");
        mNames.add("Nasarawa");

        mImageUrls.add("https://hometown.ng/wp-content/uploads/2016/12/6654458217_0fbca40fbb_b-580x387.jpg");
        mNames.add("Niger");

        mImageUrls.add("https://i0.wp.com/cdn.vanguardngr.com/wp-content/uploads/2017/07/Ogun-state.png?fit=412%2C278&ssl=1");
        mNames.add("Ogun");

        mImageUrls.add("https://brandspurng.com/wp-content/uploads/2019/05/Ondo-records-fastest-IGR-growth-as-Nigerian-states-generate-N1.1tn-in-2018-brandspurng1.jpg");
        mNames.add("Ondo");

        mImageUrls.add("http://www.osundefender.com/wp-content/uploads/2018/03/IMG-20180319-WA0049-1024x646.jpg");
        mNames.add("Osun");

        mImageUrls.add("https://onlinenigeria.com/pageCreation/images/oyo.JPG");
        mNames.add("Oyo");

        mImageUrls.add("https://i.pinimg.com/originals/cd/aa/89/cdaa89f81b42f3855ac109a0eacbf55c.jpg");
        mNames.add("Plateau");

        mImageUrls.add("https://travel.jumia.com/blog/ng/wp-content/uploads/2017/03/port-harcourt.jpg");
        mNames.add("Rivers");

        mImageUrls.add("https://onlinenigeria.com/pageCreation/images/sokoto.JPG");
        mNames.add("Sokoto");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/a/a1/Mambila_Plateau_of_Taraba_State.jpg");
        mNames.add("Taraba");

        mImageUrls.add("https://hotels.ng/places/media/poi/852/download%20%283%29-852-5775e58149038.jpg?w=300");
        mNames.add("Yobe");

        mImageUrls.add("https://theeagleonline.com.ng/wp-content/uploads/2017/03/Zamfara-State-e1534744612642.jpg");
        mNames.add("Zamfara");


        initRecyclerView();

    }

    // Create a method for setting up the RecyclerView
    private void initRecyclerView () {

        Log.d(TAG, "initRecyclerView: ");
        // Create the RecyclerView Widget
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        // Create the RecyclerView Adapter Class Object
        // Pass in the context
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        // Set the adapter to the RecyclerView
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
