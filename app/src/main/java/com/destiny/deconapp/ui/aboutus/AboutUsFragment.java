package com.destiny.deconapp.ui.aboutus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import com.destiny.deconapp.Adapter.TabPagerAdapter;
import com.destiny.deconapp.R;
import com.destiny.deconapp.ui.aboutus.Pager.MemberFragment;
import com.destiny.deconapp.ui.aboutus.Pager.PortofolioFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class AboutUsFragment extends Fragment {
    private TabLayout Table;
    private AppBarLayout appBar;
    private ViewPager viewPager;
    private FragmentActivity context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_aboutus, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Table = (TabLayout)view.findViewById(R.id.tableLayout);
        viewPager = (ViewPager)view.findViewById(R.id.viewpager);
        TabPagerAdapter adapter = new TabPagerAdapter(getChildFragmentManager());
        adapter.AddFragment(new PortofolioFragment(),"Portofolio");
        adapter.AddFragment(new MemberFragment(),"Member");

        viewPager.setAdapter(adapter);
        Table.setupWithViewPager(viewPager);
    }
}