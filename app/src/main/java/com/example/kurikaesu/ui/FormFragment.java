package com.example.kurikaesu.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kurikaesu.R;
import com.example.kurikaesu.adapter.TaskAdapter;
import com.example.kurikaesu.databinding.FragmentFormBinding;
import com.example.kurikaesu.model.TaskModel;

public class FormFragment extends Fragment {
    TaskModel model;
    FragmentFormBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFormBinding.inflate(inflater, container, false);
        NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_content_main);
        OnClick(navController);
        return binding.getRoot();
    }

    private void OnClick(NavController navController) {

    }
}