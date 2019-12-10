package com.destiny.deconapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.destiny.deconapp.Adapter.AdapterHorizonMember;
import com.destiny.deconapp.Adapter.AdapterHorizonPortofolio;
import com.destiny.deconapp.Adapter.AdapterMember;
import com.destiny.deconapp.Adapter.AdapterPortofolio;
import com.destiny.deconapp.Model.MemberData;
import com.destiny.deconapp.Model.Model;
import com.destiny.deconapp.Model.PortofolioData;
import com.destiny.deconapp.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private ArrayList<Model> pList = new ArrayList<>();
    private ArrayList<Model> pList2 = new ArrayList<>();
    RecyclerView recyclerMember,recyclerApps;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mManager;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerMember = view.findViewById(R.id.recyclerBestMember);
        recyclerApps = view.findViewById(R.id.recyclerBestApps);
        member();
        apps();
    }
    private void member(){
        mManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerMember.setLayoutManager(mManager);
        pList2.addAll(MemberData.getListData());
        AdapterHorizonMember cardViewAdapter = new AdapterHorizonMember(getContext());
        cardViewAdapter.setListMember(pList2);
        recyclerMember.setAdapter(cardViewAdapter);
    }
    private void apps(){
        mManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerApps.setLayoutManager(mManager);
        pList.addAll(PortofolioData.getListData());
        AdapterHorizonPortofolio cardViewAdapter = new AdapterHorizonPortofolio(getContext());
        cardViewAdapter.setListPortofolio(pList);
        recyclerApps.setAdapter(cardViewAdapter);
    }
}