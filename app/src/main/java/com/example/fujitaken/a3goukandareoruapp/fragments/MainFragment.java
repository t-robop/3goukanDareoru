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

public class MainFragment extends Fragment {

    ArrayList<String>arrayList = new ArrayList<>();
    String test = "";

    ListView listView;
    ArrayAdapter<String> arrayAdapter;

    //インスタンスを生成するメソッド
    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        arrayList.add(test);
    }

    @Override   //Viewを作るメソッド
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);  //inflateでfragmentのxmlを指定してviewを作る
    }

    @Override   //Viewが作られたあとに呼ばれるメソッド (ここに主な処理を書く)
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = view.findViewById(R.id.list);

        arrayAdapter=new ArrayAdapter<>(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);
    }
}
