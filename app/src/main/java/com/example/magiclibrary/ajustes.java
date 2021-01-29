package com.example.magiclibrary;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.magiclibrary.databinding.FragmentAjustesBinding;
import com.example.magiclibrary.databinding.FragmentTheshatteringBinding;



public class ajustes extends Fragment {
    private FragmentAjustesBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentAjustesBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController = Navigation.findNavController(view);

        binding.acercabutton.setOnClickListener(v ->
                navController.navigate(R.id.action_ajustes_to_acerca));
        binding.valorarbutton.setOnClickListener(v ->
                navController.navigate(R.id.action_ajustes_to_rate));
    }
}