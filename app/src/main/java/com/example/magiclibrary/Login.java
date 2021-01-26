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
import android.widget.Button;

import com.example.magiclibrary.databinding.FragmentLoginBinding;


public class Login extends Fragment {

    private FragmentLoginBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentLoginBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController = Navigation.findNavController(view);

        binding.loginbutton.setOnClickListener(v ->
                navController.navigate(R.id.action_login_to_menu));
        binding.registerbutton.setOnClickListener(v ->
                navController.navigate(R.id.action_login_to_registro));
    }
}