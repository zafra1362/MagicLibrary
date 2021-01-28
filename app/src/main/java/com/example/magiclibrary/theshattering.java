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

import com.example.magiclibrary.databinding.FragmentTheshatteringBinding;
import com.example.magiclibrary.databinding.FragmentVoljinBinding;


public class theshattering extends Fragment {
    private FragmentTheshatteringBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentTheshatteringBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController = Navigation.findNavController(view);

        binding.shatteringbutton.setOnClickListener(v ->
                navController.navigate(R.id.action_theshattering_to_leertheshattering));

    }
}