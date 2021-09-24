package com.example.moje.fiskalnakasa;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Fragment2 extends Fragment {

    //private String title;
    //private int page;

    // newInstance constructor for creating fragment with arguments
    public static Fragment2 newInstance(int page, String title) {
        Fragment2 fragmentSecond = new Fragment2();
        //Bundle args = new Bundle();
        //args.putInt("someInt", page);
        //args.putString("someTitle", title);
        //fragmentSecond.setArguments(args);
        return fragmentSecond;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //page = getArguments().getInt("someInt", 0);
        //title = getArguments().getString("someTitle");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        //TextView tvLabel = (TextView) view.findViewById(R.id.tvLabel);
        //tvLabel.setText(page + " -- " + title);


        String poruka;
        int position;
        final ListView lista;
        ArrayList<String> list = new ArrayList();
        ArrayAdapter<String> nizadapter;
        lista = (ListView) view.findViewById(R.id.listView1);
        nizadapter = new ArrayAdapter(view.getContext(), android.R.layout.simple_list_item_1, list);
        lista.setAdapter(nizadapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                String data = intent.getExtras().toString();
                Toast.makeText(getContext(), data, Toast.LENGTH_SHORT).show();
            }
        });




        return view;
    }
}