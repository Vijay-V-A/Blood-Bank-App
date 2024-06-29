package com.vijay.bloodBank;

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
import java.util.List;


public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        ArrayList<CardData> cardDataList = new ArrayList<>();

        cardDataList.add(new CardData("Vijay V A", "O-", "va0459@srmist.edu.in", "+91 80720 80030", "Chennai, Tamil Nadu"));
        cardDataList.add(new CardData("Yuvaraj N", "B+", "yuvarajryd2@gmail.com", "+91 73575 88143", "Chennai, Tamil Nadu"));
        cardDataList.add(new CardData("Raj N", "O+", "raj94@gmaill.com", "+91 80410 90030", "Chennai, Tamil Nadu"));
        cardDataList.add(new CardData("Arjun K", "A+", "arjun99123@gmail.com", "+91 98473 73453", "Villupuram, Tamil Nadu"));

        CardAdapter cardAdapter = new CardAdapter(cardDataList, getContext());
        recyclerView.setAdapter(cardAdapter);

        return view;
    }
}