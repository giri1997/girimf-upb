package com.example.daftarmahasiswa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");

        initImageBitmaps();
    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://scontent.fcgk4-2.fna.fbcdn.net/v/t31.0-8/p960x960/11182793_744562208995243_4360755562723567989_o.jpg?_nc_cat=109&_nc_sid=85a577&_nc_eui2=AeHKpm5hG3mGzb6_W3Vk0EXYh1OWcHXRuzmHU5ZwddG7OdYd29SbcB69utilhgMdpIIyD6Zaqsflxbl91-dGgzD0&_nc_ohc=7FyvAS9GPGMAX-3Pxhg&_nc_ht=scontent.fcgk4-2.fna&_nc_tp=6&oh=e9ad7c7ea24e6f8d2c688aad66aa84b1&oe=5EBE0425");
        mNames.add("Girimulya Firdaus (311710622)");

        mImageUrls.add("https://pngimage.net/wp-content/uploads/2018/06/icon-mahasiswa-png-7.png");
        mNames.add("Abdul");

        mImageUrls.add("https://pngimage.net/wp-content/uploads/2018/06/icon-mahasiswa-png-7.png");
        mNames.add("Benny");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
