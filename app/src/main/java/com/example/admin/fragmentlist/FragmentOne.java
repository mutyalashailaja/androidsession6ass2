package com.example.admin.fragmentlist;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Admin on 25-09-2016.
 */
public class FragmentOne extends Fragment implements AdapterView.OnItemClickListener {
    ListView mListview;
    ArrayList<String> mArraylist;
    ArrayAdapter<String> mArrayAdapter;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_one,container,false);

        return view;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mListview = (ListView)getActivity().findViewById(R.id.listView);
        mListview.setOnItemClickListener(this);
        mArraylist = new ArrayList<>();

        mArraylist.add("Layout1");
        mArraylist.add("Layout2");
        mArraylist.add("Layout3");
        mArraylist.add("Layout4");
        mArrayAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,android.R.id.text1,mArraylist);
        mListview.setAdapter(mArrayAdapter);


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String str=mListview.getItemAtPosition(position).toString();
        Toast.makeText(getActivity(),"You clicked" +str,Toast.LENGTH_SHORT).show();
    }
}


