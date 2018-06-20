package com.example.fujitaken.a3goukandareoruapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import java.util.function.BinaryOperator;
import java.util.jar.Attributes;

@SuppressLint("Registered")
public class InActivity extends AppCompatActivity {

    BottomNavigationView dnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.in_activity);

        dnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item1:

                        return true;
                    case R.id.item2:

                        return true;
                    case R.id.item3:

                        return true;
                }
                return false;
            }
        });

    }


    public class BisonBehavior extends CoordinatorLayout.Behavior<BottomNavigationView> {

        public BisonBehavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        @Override
        public boolean layoutDependsOn(CoordinatorLayout parrent, BottomNavigationView child, View dependency) {
            return dependency instanceof FrameLayout;

        }
    }
}