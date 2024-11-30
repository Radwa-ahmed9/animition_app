package com.example.animition;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.animition_test.R;

public class RegisterFragment extends Fragment {

    private Spinner spinnerCountries;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        // Initialize the Spinner
        spinnerCountries = view.findViewById(R.id.spinner_countries);

        // Create an array of country names
        String[] countries = {"Egypt",
                "Iraq", "Jordan", "Kuwait", "Lebanon", "Libya",
                "Mauritania"};

        // Create an ArrayAdapter using the country array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getContext(),
                android.R.layout.simple_spinner_item,
                countries
        );

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinnerCountries.setAdapter(adapter);

        return view;
    }
}

