package com.example.homework_34;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.homework_34.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<ContinentModel> continentList;
    private onClick onClick;

    public ContinentAdapter(ArrayList<ContinentModel> continentList, onClick onClick) {
        this.continentList = continentList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Bind(continentList.get(position));
        holder.itemView.setOnClickListener(v -> {
            onClick.onClick(position);
        });

    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }
}

class ViewHolder extends RecyclerView.ViewHolder {
    private ItemContinentBinding binding;
    private TextView tvName, tvInformation;
    private ImageView imgFlag;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_continent);
        tvInformation = itemView.findViewById(R.id.tv_c_information);
    }

    public void Bind(ContinentModel continent) {
        binding.tvContinent.setText(continent.getName());
        binding.tvCInformation.setText(continent.getInformation());
    }
}
