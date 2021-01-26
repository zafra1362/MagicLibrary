package com.example.magiclibrary;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.magiclibrary.databinding.FragmentArthasBinding;
import com.example.magiclibrary.databinding.FragmentVoljinBinding;


public class arthas extends Fragment {
    private FragmentArthasBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentArthasBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController = Navigation.findNavController(view);

        binding.arthasbutton.setOnClickListener(v ->
                navController.navigate(R.id.leerarthas));

    }
}