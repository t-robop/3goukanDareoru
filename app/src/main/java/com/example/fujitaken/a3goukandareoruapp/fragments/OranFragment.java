package com.example.fujitaken.a3goukandareoruapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fujitaken.a3goukandareoruapp.R;

import java.util.ArrayList;

public class OranFragment extends Fragment {

    ArrayList<String>arrayList = new ArrayList<>();
    String test = "";

    ListView listView;
    ArrayAdapter<String> arrayAdapter;

    public static OranFragment newInstance() {
        return new OranFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        arrayList.add(test);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_oran, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = view.findViewById(R.id.listoran);

        arrayAdapter=new ArrayAdapter<>(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);
    }
}
