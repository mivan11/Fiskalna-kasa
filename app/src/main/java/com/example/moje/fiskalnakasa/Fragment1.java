package com.example.moje.fiskalnakasa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static android.R.id.list;


public class Fragment1 extends Fragment {

    private ListView list;
    private ArrayAdapter<Integer> adapter;
    private ArrayList<Integer> arrayList;






    // newInstance constructor for creating fragment with arguments
    public static Fragment1 newInstance(int page, String title) {
        Fragment1 fragmentFirst = new Fragment1();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);

        final EditText stranica1 = (EditText) view.findViewById(R.id.Edittext);
        final EditText stranica2 = (EditText) view.findViewById(R.id.Edittext1);
        final EditText stranica3 = (EditText) view.findViewById(R.id.Edittext2);
        final int editText1 = stranica1.getInputType();
        final int editText2 = stranica2.getInputType();
        final int editText3 = stranica3.getInputType();

        final int povrsina = editText1 * editText2 * editText3;

        list = (ListView) view.findViewById(R.id.listView1);
        arrayList = new ArrayList<Integer>();

        // Adapter: You need three parameters 'the context, id of the layout (it will be where the data is shown),
        // and the array that contains the data
        adapter = new ArrayAdapter<Integer>(getContext(), android.R.layout.simple_spinner_item, arrayList);

        // Here, you set the data in your ListView
        list.setAdapter(adapter);
        Button dodaj = (Button) view.findViewById(R.id.button);
        dodaj.setOnClickListener(new View.OnClickListener()

                                 {
                                     @Override
                                     public void onClick (View v){

//                                         int tem = editText1;


                                         if (povrsina == 1){

                                             Toast.makeText(getContext(), "Točno", Toast.LENGTH_SHORT).show();
                                         }
                                         //                                       al.add(0, tem);
                                         //step ii: notify to adapter
                                         //                                     aa.notifyDataSetChanged();
                                         //step iii: clr edit text

                                         arrayList.add(editText1);
                                         // next thing you have to do is check if your adapter has changed
                                         adapter.notifyDataSetChanged();
                                         Intent ntent = new Intent();
                                         ntent.setClass(getContext(), Fragment2.class);
                                         ntent.putExtra("povrsina", povrsina);

                                         //Toast.makeText(getContext(), data, Toast.LENGTH_SHORT).show();
                                         //ntent.putExtra("povrsina", )
                                     }
                                 }

        );





        return view;
    }



}

