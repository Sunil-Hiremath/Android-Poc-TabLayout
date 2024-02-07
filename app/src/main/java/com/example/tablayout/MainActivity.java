package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab=findViewById(R.id.tab);
        viewPager=findViewById(R.id.viewPager);

        FragmentManager fm=getSupportFragmentManager();

        viewPagerMessengerAdapter adapter=new viewPagerMessengerAdapter(fm);
        viewPager.setAdapter(adapter);


       /* now tabs have to be setup or syncronized with the viewpager, so that when tabs are slided
        fragments also gets slided*/

        tab.setupWithViewPager(viewPager);



        //added a new line





    }
}