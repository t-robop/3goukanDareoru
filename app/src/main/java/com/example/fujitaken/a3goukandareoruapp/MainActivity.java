package com.example.fujitaken.a3goukandareoruapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    public int aa = 0;
    BottomNavigationView dnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dnv=findViewById(R.id.navigation);

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