package com.example.nikolay.testsapplication.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.nikolay.testsapplication.fragment.AbstractTabFragment;
import com.example.nikolay.testsapplication.fragment.BirhtdaysFragment;
import com.example.nikolay.testsapplication.fragment.HistoryFragment;
import com.example.nikolay.testsapplication.fragment.IdeasFragment;
import com.example.nikolay.testsapplication.fragment.TodoFragment;

import java.util.HashMap;
import java.util.Map;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter{

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabsPagerFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirhtdaysFragment.getInstance(context));
    }
}
