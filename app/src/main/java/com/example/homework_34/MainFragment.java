package com.example.homework_34;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework_34.databinding.FragmentMainBinding;

import java.util.ArrayList;

public class MainFragment extends Fragment implements onClick {


    private FragmentMainBinding binding;
    private ArrayList<ContinentModel> continentList = new ArrayList<>();
    private ContinentAdapter adapter;
    private Integer position;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        initAdapter();
        adapter= new ContinentAdapter(continentList, this::onClick);
        binding.lvContinents.setAdapter(adapter);

    }

    private void loadData() {
        continentList =new ArrayList<>();
        continentList.add(new ContinentModel("Южная Америка","один из шести материков планеты Земля, четвертый по площади и пятый по численности населения континент на планете"));
        continentList.add(new ContinentModel("Северная Америка","один из шести материков планеты Земля, расположенный на севере Западного полушария Земли, занимающий 1/6 часть суши и имеющий большее количество островов."));
        continentList.add(new ContinentModel("Евразия","один из шести материков планеты Земля, Самый большой по площади материк"));
        continentList.add(new ContinentModel("Африка","один из шести материков планеты Земля, второй по площади материк после Евразии"));
        continentList.add(new ContinentModel("Австралия","один из шести материков планеты Земля, самый маленький. Площадь островов по сравнению с материками гораздо меньше"));
    }

    private void initAdapter() {
        ContinentAdapter adapter = new ContinentAdapter(continentList, this);
        binding.lvContinents.setAdapter(adapter);
    }

    @Override
    public void onClick(Integer position) {
        Bundle bundle = new Bundle();
        bundle.putInt("key",position);

        MainFragment mainFragment = new MainFragment();
        mainFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).addToBackStack(null).commit();
    }
}
