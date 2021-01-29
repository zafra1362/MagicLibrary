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
import android.widget.Toast;

import com.example.magiclibrary.databinding.FragmentRateBinding;
import com.example.magiclibrary.databinding.FragmentTicketBinding;


public class Rate extends Fragment {
    private FragmentRateBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentRateBinding.inflate(inflater, container, false)).getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController = Navigation.findNavController(view);

        binding.ratebutton.setOnClickListener(v ->
                Toast.makeText(requireContext(), "¡Valoración enviada correctamente!", Toast.LENGTH_SHORT).show());
    }
}