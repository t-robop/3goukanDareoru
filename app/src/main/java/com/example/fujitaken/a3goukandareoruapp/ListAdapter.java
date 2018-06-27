package com.example.fujitaken.a3goukandareoruapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.fujitaken.a3goukandareoruapp.fragments.LogFragment;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater = null;
    private ArrayList<LogFragment.Member> memberList;

    public ListAdapter(Context context){
        this.context = context;
        this.layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setMemberList(ArrayList<LogFragment.Member> memberList) {
        this.memberList = memberList;
    }

    @Override
    public int getCount() {
        return memberList.size();
    }

    @Override
    public Object getItem(int position) {
        return memberList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return memberList.get(position).getId();
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.list_row, parent, false);
        ((TextView)convertView.findViewById(R.id.name)).setText(memberList.get(position).getName());
        ((TextView)convertView.findViewById(R.id.time)).setText(String.valueOf(memberList.get(position).getTime()));

        return convertView;
    }
}
