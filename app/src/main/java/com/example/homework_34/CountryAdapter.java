package com.example.homework_34;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.homework_34.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<countryViewHolder> {
    private ArrayList<CountryModel> countryList;

    public CountryAdapter() {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public countryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new countryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull countryViewHolder holder, int position) {
        holder.bind(countryList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}

class countryViewHolder extends RecyclerView.ViewHolder{
    private TextView Name, tvCapital;
    private ImageView imgFlag;
    public countryViewHolder(@NonNull View itemView) {
        super(itemView);
        imgFlag = itemView.findViewById(R.id.img_flag);
        Name = itemView.findViewById(R.id.tv_country);
    }
    public void bind(CountryModel country){
        Name.setText(country.getName());
        tvCapital.setText(country.getCapital());
        Glide.with(imgFlag).load(country.getFlag()).into(imgFlag);
    }
}