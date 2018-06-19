package com.example.fujitaken.a3goukandareoruapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fujitaken.a3goukandareoruapp.R;

public class MainFragment extends Fragment {

    //インスタンスを生成するメソッド
    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override   //Viewを作るメソッド
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);  //inflateでfragmentのxmlを指定してviewを作る
    }

    @Override   //Viewが作られたあとに呼ばれるメソッド (ここに主な処理を書く)
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}
