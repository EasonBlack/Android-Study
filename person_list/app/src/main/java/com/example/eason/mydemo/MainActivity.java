package com.example.eason.mydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersonAdapter personAdapter = new PersonAdapter(this, R.layout.person_item, Person.getAllPersons());
        ListView listView = (ListView) findViewById(R.id.person_listView);
        listView.setAdapter(personAdapter);

//        ArrayAdapter<String> psersonAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Person.getAllPersons());
//        ListView listView = (ListView) findViewById(R.id.person_listView);
//        listView.setAdapter(psersonAdapter);
    }
}
