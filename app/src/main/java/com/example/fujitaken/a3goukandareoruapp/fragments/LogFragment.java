package com.example.fujitaken.a3goukandareoruapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fujitaken.a3goukandareoruapp.ListAdapter;
import com.example.fujitaken.a3goukandareoruapp.R;

import java.util.ArrayList;

public class LogFragment extends Fragment {

    ArrayList<Member>arrayList = new ArrayList<>();

    ListView listView;
    ListAdapter listAdapter;

    public static LogFragment newInstance(){
        return new LogFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Member member = new Member();
        member.setName("furuichi");
        member.setTime(10);
        arrayList.add(member);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_log, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = view.findViewById(R.id.list);

        listAdapter = new ListAdapter(getContext());
        listAdapter.setMemberList(arrayList);

        listView.setAdapter(listAdapter);

    }

    public class Member {
        long id;
        private String name;
        private int time;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name=name;
        }

        public int getTime(){
            return time;
        }

        public void setTime(int time){
            this.time=time;
        }

    }
}
