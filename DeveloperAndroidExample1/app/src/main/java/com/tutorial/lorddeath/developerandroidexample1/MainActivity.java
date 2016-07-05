package com.tutorial.lorddeath.developerandroidexample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Pushing Daisies");
        arrayList.add("Better Off Ted");
        arrayList.add("Twin Peaks");
        arrayList.add("Freaks and Geeks");
        arrayList.add("Orphan Black");
        arrayList.add("Walking Dead");
        arrayList.add("Breaking Bad");
        arrayList.add("The 400");
        arrayList.add("Alphas");
        arrayList.add("Life on Mars");

        ListAdapter theAdapter = new MyAdapter(this, arrayList);
        ListView theListView = (ListView) findViewById(R.id.theListView);
        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String tvShowPicked = "You selected " +
                        String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(MainActivity.this, tvShowPicked, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
