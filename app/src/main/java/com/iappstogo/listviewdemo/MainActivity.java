package com.iappstogo.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView appListView = findViewById(R.id.appListView);

        final ArrayList<String> myFamily = new ArrayList<String>();
        myFamily.add("Dave");
        myFamily.add("John");
        myFamily.add("Derek");
        myFamily.add("Brian");



        ArrayAdapter<String> friendListAdpater = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myFamily);

        appListView.setAdapter(friendListAdpater);

        appListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Log.i("Person Selected: ", myFamily.get(i));
            }
        });



    }
}
