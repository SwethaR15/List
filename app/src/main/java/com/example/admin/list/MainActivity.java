package com.example.admin.list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    String[] arr = {"str", "str1", "str2", "str3"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, arr);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3) {
                Intent intent = null;

             switch(position){
                 case 0:
                     intent=new Intent(MainActivity.this,Main2Activity.class) ;
                    break;
                 case 1:
                     intent=new Intent(MainActivity.this,Main3Activity.class);
                     break;
                 case 2:
                     intent=new Intent(MainActivity.this,Main4Activity.class);
                     break;
                     }
                     startActivity(intent);

            }
        });

    }}