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
        mNames.add("Uyo");

        mImageUrls.add("https://hotels.ng/guides/wp-content/uploads/2017/05/Calabar-for-Michelle.jpg");
        mNames.add("Calabar");

        mImageUrls.add("https://guardian.ng/wp-content/uploads/2017/12/enugustatewebsite_mexygabriel-1-1062x598.jpg");
        mNames.add("Enugu");

        mImageUrls.add("https://travel.jumia.com/blog/ng/wp-content/uploads/2017/03/port-harcourt.jpg");
        mNames.add("Port Harcourt");

        mImageUrls.add("https://answersafrica.com/wp-content/uploads/2017/08/Abj.jpg");
        mNames.add("Abuja");

        mImageUrls.add("https://media.gettyimages.com/photos/high-angle-view-of-buildings-in-city-picture-id997757812?s=612x612");
        mNames.add("Lagos");

        mImageUrls.add("https://hotels.ng/guides/wp-content/uploads/2017/07/owerri-center.jpg");
        mNames.add("Owerri");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/1/19/Awka247.jpg");
        mNames.add("Awka");

        mImageUrls.add("https://www.africa.com/wp-content/uploads/2010/04/Benin.jpg");
        mNames.add("Benin");

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
