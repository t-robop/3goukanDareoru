package com.example.fujitaken.a3goukandareoruapp;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.fujitaken.a3goukandareoruapp.fragments.LogFragment;
import com.example.fujitaken.a3goukandareoruapp.fragments.OruFragment;
import com.example.fujitaken.a3goukandareoruapp.fragments.OranFragment;
import com.example.fujitaken.a3goukandareoruapp.fragments.OruFragment;
import com.example.fujitaken.a3goukandareoruapp.fragments.OranFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //何も画面が生成されていないとき
        if (savedInstanceState == null){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();   //fragmentを作り始めるよ

            //MainFragment.javaのnewInstanceメソッドを呼んで画面を生成(厳密にはreplaceなので置き換え)
            fragmentTransaction.replace(R.id.container, OruFragment.newInstance());    //containerはactivity_root.xmlに記述してある

            fragmentTransaction.commit();   //fragment追加処理を終了
        }

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);   //xmlのbottomNavigationViewとの連携

        //Listener(入力があったら呼ばれるもの)の設定
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {   //引数itemにbottom_navigation_menuで選択されたものが入る
                switch (item.getItemId()){  //switch文で処理分岐 それぞれreplaceでfragmentを置き換え
                    case R.id.menu_log:
                        LogFragment logFragment = LogFragment.newInstance();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, logFragment).commit();
                        break;

                    case R.id.menu_main:
                        OruFragment mainFragment = OruFragment.newInstance();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
                        break;

                    case R.id.menu_state:
                        OranFragment stateFragment = OranFragment.newInstance();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, stateFragment).commit();
                        break;
                }

                return false;
            }
        });

    }
}
