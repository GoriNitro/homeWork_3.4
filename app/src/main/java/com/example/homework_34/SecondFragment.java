package com.example.homework_34;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework_34.databinding.FragmentMainBinding;
import com.example.homework_34.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements onClick {
    private FragmentSecondBinding binding;
    private ArrayList<CountryModel> countryList = new ArrayList<>();
    private CountryAdapter adapter;
    private Integer position;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");
        getPos(position);
        CountryAdapter countryAdapter = new CountryAdapter();
        binding.rvCountry.setAdapter(countryAdapter);
    }

    @Override
    public void onClick(Integer position) {

    }
    public void getPos (int position){
        if (position==0){
            loadDataSouthAmerica();}
        else if (position==1) {
            loadDataNorthAmerica();}
        else if (position==2) {
            loadDataEurasia();}
        else if (position==3) {
            loadDataAfrica();}
        else if (position==4) {
            loadDataAustralia();}
        else {

        }
    }

    private void loadDataAustralia() {
        countryList = new ArrayList<>();
        countryList.add(new CountryModel("Австралия","Канберра", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A4%25D0%25BB%25D0%25B0%25D0%25B3_%25D0%2590%25D0%25B2%25D1%2581%25D1%2582%25D1%2580%25D0%25B0%25D0%25BB%25D0%25B8%25D0%25B8&psig=AOvVaw3jcJrMxzcOR1qEBkAgNd66&ust=1700765338179000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCNihkuGi2IIDFQAAAAAdAAAAABAD"));
        countryList.add(new CountryModel("Виктория","Мельбурн", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.m.wikipedia.org%2Fwiki%2F%25D0%25A4%25D0%25B0%25D0%25B9%25D0%25BB%3AFlag_of_Victoria_%2528Australia%2529.svg&psig=AOvVaw0IqRs8iGA2oWTrsuaBIw5K&ust=1700765317338000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCIDfs9ei2IIDFQAAAAAdAAAAABAD"));
        countryList.add(new CountryModel("Квинсленд","Брисбен", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%259A%25D0%25B2%25D0%25B8%25D0%25BD%25D1%2581%25D0%25BB%25D0%25B5%25D0%25BD%25D0%25B4&psig=AOvVaw2T5cktMp35uw8ZcoySAZ4r&ust=1700765283602000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCPCsrcii2IIDFQAAAAAdAAAAABAD"));
        countryList.add(new CountryModel("Зап австралия","Перт", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A4%25D0%25BB%25D0%25B0%25D0%25B3_%25D0%2597%25D0%25B0%25D0%25BF%25D0%25B0%25D0%25B4%25D0%25BD%25D0%25BE%25D0%25B9_%25D0%2590%25D0%25B2%25D1%2581%25D1%2582%25D1%2580%25D0%25B0%25D0%25BB%25D0%25B8%25D0%25B8&psig=AOvVaw3mZEvky2uwRXRSUG9rw4ox&ust=1700765216393000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCNDCq6ei2IIDFQAAAAAdAAAAABAD"));
        countryList.add(new CountryModel("Тасмания","Хобарт", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru-travel.livejournal.com%2F32721293.html&psig=AOvVaw2HCGzwlW9GTRaJJyl0F9Vm&ust=1700765242284000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCKD84bqi2IIDFQAAAAAdAAAAABAD"));
        countryList.add(new CountryModel("Австрия","Вена", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%2590%25D0%25B2%25D1%2581%25D1%2582%25D1%2580%25D0%25B8%25D1%258F&psig=AOvVaw2x48EbNDbWMjMlaTey-84L&ust=1700764948634000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCNC45Kah2IIDFQAAAAAdAAAAABAE"));
        countryList.add(new CountryModel("Северная территория","Дарвин", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wikiwand.com%2Fru%2F%25D0%25A4%25D0%25BB%25D0%25B0%25D0%25B3_%25D0%25A1%25D0%25B5%25D0%25B2%25D0%25B5%25D1%2580%25D0%25BD%25D0%25BE%25D0%25B9_%25D1%2582%25D0%25B5%25D1%2580%25D1%2580%25D0%25B8%25D1%2582%25D0%25BE%25D1%2580%25D0%25B8%25D0%25B8&psig=AOvVaw3a9rAimGotY1EaSzmwpYQK&ust=1700765189934000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCLD0tJui2IIDFQAAAAAdAAAAABAD"));
        countryList.add(new CountryModel("Южный Уэльс","Сидней", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wikiwand.com%2Fru%2F%25D0%259A%25D0%25BE%25D0%25BB%25D0%25BE%25D0%25BD%25D0%25B8%25D1%258F_%25D0%259D%25D0%25BE%25D0%25B2%25D1%258B%25D0%25B9_%25D0%25AE%25D0%25B6%25D0%25BD%25D1%258B%25D0%25B9_%25D0%25A3%25D1%258D%25D0%25BB%25D1%258C%25D1%2581&psig=AOvVaw20lXBCP4Vum-IFNRiV4oP5&ust=1700765161642000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCNiN7o2i2IIDFQAAAAAdAAAAABAD"));
        countryList.add(new CountryModel("Юж австралия","Аделаида", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25AE%25D0%25B6%25D0%25BD%25D0%25B0%25D1%258F_%25D0%2590%25D0%25B2%25D1%2581%25D1%2582%25D1%2580%25D0%25B0%25D0%25BB%25D0%25B8%25D1%258F&psig=AOvVaw3iAhbJU6nzMFu4yu4nT4p2&ust=1700765137011000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCNi42oGi2IIDFQAAAAAdAAAAABAD"));
    }

    private void loadDataAfrica() {
        countryList = new ArrayList<>();
        countryList.add(new CountryModel("Южная Африка","претория", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25AE%25D0%25B6%25D0%25BD%25D0%25BE-%25D0%2590%25D1%2584%25D1%2580%25D0%25B8%25D0%25BA%25D0%25B0%25D0%25BD%25D1%2581%25D0%25BA%25D0%25B0%25D1%258F_%25D0%25A0%25D0%25B5%25D1%2581%25D0%25BF%25D1%2583%25D0%25B1%25D0%25BB%25D0%25B8%25D0%25BA%25D0%25B0&psig=AOvVaw1n5F8OT4oqJ_TXQKArbzF2&ust=1700764352855000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPC6mJGf2IIDFQAAAAAdAAAAABAE"));
        countryList.add(new CountryModel("Нигерия","Абуджа", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%259D%25D0%25B8%25D0%25B3%25D0%25B5%25D1%2580%25D0%25B8%25D1%258F&psig=AOvVaw1n5F8OT4oqJ_TXQKArbzF2&ust=1700764352855000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPC6mJGf2IIDFQAAAAAdAAAAABAI"));
        countryList.add(new CountryModel("Кения","Найроби", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%259D%25D0%25B8%25D0%25B3%25D0%25B5%25D1%2580%25D0%25B8%25D1%258F&psig=AOvVaw1n5F8OT4oqJ_TXQKArbzF2&ust=1700764352855000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPC6mJGf2IIDFQAAAAAdAAAAABAI"));
        countryList.add(new CountryModel("Марокко","Рабат", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%259C%25D0%25B0%25D1%2580%25D0%25BE%25D0%25BA%25D0%25BA%25D0%25BE&psig=AOvVaw1n5F8OT4oqJ_TXQKArbzF2&ust=1700764352855000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPC6mJGf2IIDFQAAAAAdAAAAABAM"));
        countryList.add(new CountryModel("Нигер","Ниамей", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%259D%25D0%25B8%25D0%25B3%25D0%25B5%25D1%2580&psig=AOvVaw1n5F8OT4oqJ_TXQKArbzF2&ust=1700764352855000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPC6mJGf2IIDFQAAAAAdAAAAABAU"));
        countryList.add(new CountryModel("Гана","Аккра", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%2593%25D0%25B0%25D0%25BD%25D0%25B0&psig=AOvVaw1n5F8OT4oqJ_TXQKArbzF2&ust=1700764352855000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPC6mJGf2IIDFQAAAAAdAAAAABAY"));
        countryList.add(new CountryModel("Сенегал","Дакар", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A1%25D0%25B5%25D0%25BD%25D0%25B5%25D0%25B3%25D0%25B0%25D0%25BB&psig=AOvVaw1n5F8OT4oqJ_TXQKArbzF2&ust=1700764352855000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPC6mJGf2IIDFQAAAAAdAAAAABAc"));
        countryList.add(new CountryModel("Танзания","Додома", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A2%25D0%25B0%25D0%25BD%25D0%25B7%25D0%25B0%25D0%25BD%25D0%25B8%25D1%258F&psig=AOvVaw1n5F8OT4oqJ_TXQKArbzF2&ust=1700764352855000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPC6mJGf2IIDFQAAAAAdAAAAABAn"));
        countryList.add(new CountryModel("Эфиопия","Адис Абеба", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25AD%25D1%2584%25D0%25B8%25D0%25BE%25D0%25BF%25D0%25B8%25D1%258F&psig=AOvVaw1n5F8OT4oqJ_TXQKArbzF2&ust=1700764352855000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPC6mJGf2IIDFQAAAAAdAAAAABAs"));
        countryList.add(new CountryModel("Мали","Бамако", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%259C%25D0%25B0%25D0%25BB%25D0%25B8&psig=AOvVaw1n5F8OT4oqJ_TXQKArbzF2&ust=1700764352855000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPC6mJGf2IIDFQAAAAAdAAAAABAw"));
    }

    private void loadDataEurasia() {
        countryList = new ArrayList<>();
        countryList.add(new CountryModel("Россия","Москва", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A0%25D0%25BE%25D1%2581%25D1%2581%25D0%25B8%25D1%258F&psig=AOvVaw0Uy-epOCRx9Cnxdc2UbGFz&ust=1700764070842000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPjfn4Se2IIDFQAAAAAdAAAAABAE"));
        countryList.add(new CountryModel("Казахстан","Астана", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%259A%25D0%25B0%25D0%25B7%25D0%25B0%25D1%2585%25D1%2581%25D1%2582%25D0%25B0%25D0%25BD&psig=AOvVaw1TisW1sQKoSgForyZwAwmX&ust=1700764090426000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOjT6I6e2IIDFQAAAAAdAAAAABAE"));
        countryList.add(new CountryModel("Кыргызстан","Бишкек", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%259A%25D0%25B8%25D1%2580%25D0%25B3%25D0%25B8%25D0%25B7%25D0%25B8%25D1%258F&psig=AOvVaw2NAY30RtShvou8aSP8lyns&ust=1700764118337000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCMik85qe2IIDFQAAAAAdAAAAABAE"));
        countryList.add(new CountryModel("Узбекизстан","Ташкент", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A3%25D0%25B7%25D0%25B1%25D0%25B5%25D0%25BA%25D0%25B8%25D1%2581%25D1%2582%25D0%25B0%25D0%25BD&psig=AOvVaw2vDWZIA_oO0bgWhDRHZ8UB&ust=1700764136953000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCJiQ5KOe2IIDFQAAAAAdAAAAABAE"));
        countryList.add(new CountryModel("Таждикистан","Душанбе", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A2%25D0%25B0%25D0%25B4%25D0%25B6%25D0%25B8%25D0%25BA%25D0%25B8%25D1%2581%25D1%2582%25D0%25B0%25D0%25BD&psig=AOvVaw1lUEaslxA2ti9buBUWw_kS&ust=1700764153260000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCMDiyKue2IIDFQAAAAAdAAAAABAE"));
        countryList.add(new CountryModel("Армения","Ереван", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%2590%25D1%2580%25D0%25BC%25D0%25B5%25D0%25BD%25D0%25B8%25D1%258F&psig=AOvVaw27VQUZQ1L7onz-mxnqXvbu&ust=1700764029737000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCNDxkfGd2IIDFQAAAAAdAAAAABAE"));
        countryList.add(new CountryModel("Эстония","Таллин", "https://ru.wikipedia.org/wiki/%D0%AD%D1%81%D1%82%D0%BE%D0%BD%D0%B8%D1%8F"));
        countryList.add(new CountryModel("Латвия","Рига", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%259B%25D0%25B0%25D1%2582%25D0%25B2%25D0%25B8%25D1%258F&psig=AOvVaw1dtieRhrBcIDdgFLRau976&ust=1700764231349000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCPivv9Ke2IIDFQAAAAAdAAAAABAE"));
        countryList.add(new CountryModel("Беларусь","Минск", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%2591%25D0%25B5%25D0%25BB%25D0%25BE%25D1%2580%25D1%2583%25D1%2581%25D1%2581%25D0%25B8%25D1%258F&psig=AOvVaw2-DHLRC1lHwK3l0nTFokI1&ust=1700764284045000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOCYq-qe2IIDFQAAAAAdAAAAABAE"));
        countryList.add(new CountryModel("Украина","Киев", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A3%25D0%25BA%25D1%2580%25D0%25B0%25D0%25B8%25D0%25BD%25D0%25B0&psig=AOvVaw3bUSftNKi9jMxvL5GUK0T6&ust=1700764321440000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCLDji_ye2IIDFQAAAAAdAAAAABAE"));
    }

    private void loadDataNorthAmerica() {
        countryList = new ArrayList<>();
        countryList.add(new CountryModel("USA","Washington", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A1%25D0%25BE%25D0%25B5%25D0%25B4%25D0%25B8%25D0%25BD%25D1%2591%25D0%25BD%25D0%25BD%25D1%258B%25D0%25B5_%25D0%25A8%25D1%2582%25D0%25B0%25D1%2582%25D1%258B_%25D0%2590%25D0%25BC%25D0%25B5%25D1%2580%25D0%25B8%25D0%25BA%25D0%25B8&psig=AOvVaw3sU0jHwayV7T1bPsw8nF7b&ust=1700763062871000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCODum9aa2IIDFQAAAAAdAAAAABAE"));
        countryList.add(new CountryModel("Canada","Ottawa", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%259A%25D0%25B0%25D0%25BD%25D0%25B0%25D0%25B4%25D0%25B0&psig=AOvVaw3sU0jHwayV7T1bPsw8nF7b&ust=1700763062871000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCODum9aa2IIDFQAAAAAdAAAAABAI"));
        countryList.add(new CountryModel("Mexico","Mexico", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%259C%25D0%25B5%25D0%25BA%25D1%2581%25D0%25B8%25D0%25BA%25D0%25B0&psig=AOvVaw3sU0jHwayV7T1bPsw8nF7b&ust=1700763062871000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCODum9aa2IIDFQAAAAAdAAAAABAS"));
        countryList.add(new CountryModel("Greenland","Nook", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%2593%25D1%2580%25D0%25B5%25D0%25BD%25D0%25BB%25D0%25B0%25D0%25BD%25D0%25B4%25D0%25B8%25D1%258F_%2528%25D0%25B0%25D0%25B4%25D0%25BC%25D0%25B8%25D0%25BD%25D0%25B8%25D1%2581%25D1%2582%25D1%2580%25D0%25B0%25D1%2582%25D0%25B8%25D0%25B2%25D0%25BD%25D0%25B0%25D1%258F_%25D0%25B5%25D0%25B4%25D0%25B8%25D0%25BD%25D0%25B8%25D1%2586%25D0%25B0%2529&psig=AOvVaw3sU0jHwayV7T1bPsw8nF7b&ust=1700763062871000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCODum9aa2IIDFQAAAAAdAAAAABAW"));
        countryList.add(new CountryModel("Cuba","Gavan", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%259A%25D1%2583%25D0%25B1%25D0%25B0&psig=AOvVaw3sU0jHwayV7T1bPsw8nF7b&ust=1700763062871000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCODum9aa2IIDFQAAAAAdAAAAABAf"));
        countryList.add(new CountryModel("Yamaika","Kingston", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25AF%25D0%25BC%25D0%25B0%25D0%25B9%25D0%25BA%25D0%25B0&psig=AOvVaw2H_NE7cCN37LT9dT4yA1Bc&ust=1700763600340000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCJCB7qOc2IIDFQAAAAAdAAAAABAE"));
        countryList.add(new CountryModel("Panama","Panama", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%259F%25D0%25B0%25D0%25BD%25D0%25B0%25D0%25BC%25D0%25B0&psig=AOvVaw0L3JgDnUzyqPNzych9ipVr&ust=1700763650650000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKDCrcic2IIDFQAAAAAdAAAAABAE"));
        countryList.add(new CountryModel("Salvador","San salvador", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A1%25D0%25B0%25D0%25BB%25D1%258C%25D0%25B2%25D0%25B0%25D0%25B4%25D0%25BE%25D1%2580&psig=AOvVaw0L3JgDnUzyqPNzych9ipVr&ust=1700763650650000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKDCrcic2IIDFQAAAAAdAAAAABAQ"));
        countryList.add(new CountryModel("Bagam","Nassau", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%2591%25D0%25B0%25D0%25B3%25D0%25B0%25D0%25BC%25D1%2581%25D0%25BA%25D0%25B8%25D0%25B5_%25D0%259E%25D1%2581%25D1%2582%25D1%2580%25D0%25BE%25D0%25B2%25D0%25B0&psig=AOvVaw0L3JgDnUzyqPNzych9ipVr&ust=1700763650650000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKDCrcic2IIDFQAAAAAdAAAAABAM"));
        countryList.add(new CountryModel("Kosta rika","san hose", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%259A%25D0%25BE%25D1%2581%25D1%2582%25D0%25B0-%25D0%25A0%25D0%25B8%25D0%25BA%25D0%25B0&psig=AOvVaw0L3JgDnUzyqPNzych9ipVr&ust=1700763650650000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCKDCrcic2IIDFQAAAAAdAAAAABAU"));
    }

    private void loadDataSouthAmerica() {
        countryList = new ArrayList<>();
        countryList.add(new CountryModel("Argentina","Buenos Aires", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fcommons%2F1%2F1a%2FFlag_of_Argentina.svg&tbnid=JFk8VMZb-9okjM&vet=12ahUKEwiG4ZSkjdiCAxXfExAIHVwIAvMQMygBegQIARBt..i&imgrefurl=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%2590%25D1%2580%25D0%25B3%25D0%25B5%25D0%25BD%25D1%2582%25D0%25B8%25D0%25BD%25D0%25B0&docid=JVIPxbrNIBexTM&w=800&h=500&itg=1&q=%D0%B0%D1%80%D0%B3%D0%B5%D0%BD%D1%82%D0%B8%D0%BD%D0%B0&ved=2ahUKEwiG4ZSkjdiCAxXfExAIHVwIAvMQMygBegQIARBt"));
        countryList.add(new CountryModel("Chili","Santiago", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A4%25D0%25BB%25D0%25B0%25D0%25B3_%25D0%25A7%25D0%25B8%25D0%25BB%25D0%25B8&psig=AOvVaw340R9Lt6oX77oMldI-mSYa&ust=1700759608605000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCLif_LSN2IIDFQAAAAAdAAAAABAD"));
        countryList.add(new CountryModel("Brazil","Brazil", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A4%25D0%25BB%25D0%25B0%25D0%25B3_%25D0%2591%25D1%2580%25D0%25B0%25D0%25B7%25D0%25B8%25D0%25BB%25D0%25B8%25D0%25B8&psig=AOvVaw32ocuRXPkj20PE_8qNbXmw&ust=1700759645483000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCPDstMaN2IIDFQAAAAAdAAAAABAD"));
        countryList.add(new CountryModel("Venezuela","Caracas", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A4%25D0%25BB%25D0%25B0%25D0%25B3_%25D0%2592%25D0%25B5%25D0%25BD%25D0%25B5%25D1%2581%25D1%2583%25D1%258D%25D0%25BB%25D1%258B&psig=AOvVaw0BZOEz5b0xd3ZhZwNc8K14&ust=1700759674718000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCIjPu9SN2IIDFQAAAAAdAAAAABAD"));
        countryList.add(new CountryModel("Colombia","Bogota", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A4%25D0%25BB%25D0%25B0%25D0%25B3_%25D0%259A%25D0%25BE%25D0%25BB%25D1%2583%25D0%25BC%25D0%25B1%25D0%25B8%25D0%25B8&psig=AOvVaw0SaR1ZEWDdXa9fZtakiYEH&ust=1700759696210000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCPjM196N2IIDFQAAAAAdAAAAABAD"));
        countryList.add(new CountryModel("Peru","Lima", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%259F%25D0%25B5%25D1%2580%25D1%2583&psig=AOvVaw21J7jzluFz_peYZvPI6GI8&ust=1700759714901000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCIjuy-eN2IIDFQAAAAAdAAAAABAD"));
        countryList.add(new CountryModel("Ecuador","Quito", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.m.wikipedia.org%2Fwiki%2F%25D0%25A4%25D0%25B0%25D0%25B9%25D0%25BB%3AFlag_of_Ecuador.svg&psig=AOvVaw2ijNRHP2GynvGtt-brNtJE&ust=1700759748444000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCLjgwfiN2IIDFQAAAAAdAAAAABAD"));
        countryList.add(new CountryModel("Bolivia","Bolivia", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A4%25D0%25BB%25D0%25B0%25D0%25B3_%25D0%2591%25D0%25BE%25D0%25BB%25D0%25B8%25D0%25B2%25D0%25B8%25D0%25B8&psig=AOvVaw0fcKWQ4zffV7QgvJXqVDrH&ust=1700759778655000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCPC8gYaO2IIDFQAAAAAdAAAAABAD"));
        countryList.add(new CountryModel("Uruguay","Montevideo", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.wikipedia.org%2Fwiki%2F%25D0%25A4%25D0%25BB%25D0%25B0%25D0%25B3_%25D0%25A3%25D1%2580%25D1%2583%25D0%25B3%25D0%25B2%25D0%25B0%25D1%258F&psig=AOvVaw2Gp3S13-qR4OCvyRhnbUEF&ust=1700759807366000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCODl2ZOO2IIDFQAAAAAdAAAAABAD"));
        countryList.add(new CountryModel("Paraguay","Asuncion", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fru.m.wikipedia.org%2Fwiki%2F%25D0%25A4%25D0%25B0%25D0%25B9%25D0%25BB%3AFlag_of_Paraguay.svg&psig=AOvVaw0dZ3eDNtDLC66hXtO4aVS9&ust=1700759825607000&source=images&cd=vfe&opi=89978449&ved=0CA8QjRxqFwoTCJDutpyO2IIDFQAAAAAdAAAAABAD"));
    }
}