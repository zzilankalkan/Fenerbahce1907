package com.example.fenerbahceapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fenerbahceapp.R;
import com.example.fenerbahceapp.adapters.BasariAdapter;
import com.example.fenerbahceapp.models.Basari;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;
    private BasariAdapter adapter;
    private List<Basari> basariList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recycler_basari_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        basariList = new ArrayList<>();
        basariList.add(new Basari("28", "Süper Lig Şampiyonluğu", R.drawable.ic_trophy));
        basariList.add(new Basari("08", "Başbakanlık Kupası", R.drawable.ic_trophy));
        // Diğer başarıları ekle...

        adapter = new BasariAdapter(basariList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
