package com.destiny.deconapp.ui.aboutus.Pager;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.destiny.deconapp.Adapter.AdapterMember;
import com.destiny.deconapp.Adapter.AdapterPortofolio;
import com.destiny.deconapp.Model.MemberData;
import com.destiny.deconapp.Model.Model;
import com.destiny.deconapp.Model.PortofolioData;
import com.destiny.deconapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PortofolioFragment extends Fragment {
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();

    public PortofolioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portofolio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView =view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        pList.addAll(PortofolioData.getListData());
        AdapterPortofolio cardViewAdapter = new AdapterPortofolio(getContext());
        cardViewAdapter.setListPortofolio(pList);
        recyclerView.setAdapter(cardViewAdapter);
    }
}
