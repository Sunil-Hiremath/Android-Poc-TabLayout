package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


// FragmentPagerAdapter used for horizontal sliding and loading the fragments
public class viewPagerMessengerAdapter extends FragmentPagerAdapter {

    public viewPagerMessengerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0)
            return new chatFragment();
        else if (position==1)
            return new statusFragment();
        else
            return new callsFragment();



    }

    @Override
    public int getCount() {
        return 3;// kitne fragments hain ,indirectly no. of tabs
    }


    @Override//tab title
    public CharSequence getPageTitle(int position) {
        if(position==0)
            return "Chats";
        else if (position==1)
            return "Status";
        else
            return "Calls";

    }
}
