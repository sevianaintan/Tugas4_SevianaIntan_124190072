package com.example.tugasempat;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<ListWisataModel> list = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
    recyclerView = view.findViewById(R.id.rcv);
    recyclerView.setHasFixedSize(true);
    list.addAll(ListWisataData.getHeroList());
    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    ListWisataAdapter listWisataAdapter = new ListWisataAdapter(ListWisataData.getHeroList(), getActivity());
    recyclerView.setAdapter(listWisataAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}