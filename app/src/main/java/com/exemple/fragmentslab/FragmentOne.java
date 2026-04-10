package com.exemple.fragmentslab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import android.widget.Button;
import android.widget.TextView;
public class FragmentOne extends Fragment {


    @Override
    public void onResume() {
        super.onResume();
        android.util.Log.d("CycleDeVie", "FragmentOne : onResume() - Je suis affiché !");
    }

    @Override
    public void onPause() {
        super.onPause();
        android.util.Log.d("CycleDeVie", "FragmentOne : onPause() - Je disparais...");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        TextView tv = view.findViewById(R.id.txtFragment1);
        Button btn = view.findViewById(R.id.btnChangeText);

        btn.setOnClickListener(v -> tv.setText("Bonjour depuis Fragment 1 !"));

        return view;
    }
}