package com.example.fujitaken.a3goukandareoruapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fujitaken.a3goukandareoruapp.R;

public class OruFragment extends Fragment {

    //インスタンスを生成するメソッド
    public static OruFragment newInstance() {
        return new OruFragment();
    }

    @Override   //Viewを作るメソッド
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_oru, container, false);  //inflateでfragmentのxmlを指定してviewを作る
    }

    @Override   //Viewが作られたあとに呼ばれるメソッド (ここに主な処理を書く)
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //TODO ListView

    }
}
