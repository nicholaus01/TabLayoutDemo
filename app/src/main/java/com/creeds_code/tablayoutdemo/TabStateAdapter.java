package com.creeds_code.tablayoutdemo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabStateAdapter extends FragmentStateAdapter {

    int tabCount;

    public TabStateAdapter(@NonNull FragmentActivity fragmentActivity, int numberOfTabs) {
        super(fragmentActivity);
        this.tabCount = numberOfTabs;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       switch(position){
           case 0:
               return new Tab1Fragment();
           case 1:
               return new Tab2Fragment();
           case 2:
               return new Tab3Fragment();
           case 3:
               return new Tab4Fragment();
           default:
               return null;
       }
    }

    @Override
    public int getItemCount() {
        return tabCount;
    }
}
