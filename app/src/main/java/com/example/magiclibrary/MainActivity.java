package com.example.magiclibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;

import com.example.magiclibrary.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding;
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        NavController navController = ((NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).getNavController();
        NavigationUI.setupWithNavController(binding.bottomNavView, navController);
        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            if (destination.getId() == R.id.login || destination.getId() == R.id.registro || destination.getId() == R.id.acerca || destination.getId() == R.id.theshattering || destination.getId() == R.id.voljin || destination.getId() == R.id.leerarthas || destination.getId() == R.id.leertheshattering || destination.getId() == R.id.leervoljin) {
                binding.bottomNavView.setVisibility(View.GONE);
            } else {
                binding.bottomNavView.setVisibility(View.VISIBLE);
            }
        });
    }
}