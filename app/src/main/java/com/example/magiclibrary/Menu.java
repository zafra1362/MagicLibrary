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

import com.example.magiclibrary.databinding.FragmentLoginBinding;
import com.example.magiclibrary.databinding.FragmentMenuBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class Menu extends Fragment {

    private FragmentMenuBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentMenuBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController = Navigation.findNavController(view);

        binding.arthas.setOnClickListener(v ->
                navController.navigate(R.id.action_menu_to_arthas));
        binding.shattering.setOnClickListener(v ->
                navController.navigate(R.id.action_menu_to_theshattering));
        binding.voljin.setOnClickListener(v ->
                navController.navigate(R.id.action_menu_to_voljin));
    }
}