package com.exemple.fragmentslab;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assure-toi que ces IDs existent dans ton XML (celui qu'on a fait ensemble)
        Button btnFirst = findViewById(R.id.action_show_first);
        Button btnSecond = findViewById(R.id.action_show_second);

        if (savedInstanceState == null) {
            displayFragment(new FragmentOne(), false);
        }

        btnFirst.setOnClickListener(view -> displayFragment(new FragmentOne(), true));
        btnSecond.setOnClickListener(view -> displayFragment(new FragmentTwo(), true));
    }

    private void displayFragment(Fragment fragment, boolean addStack) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_content_area, fragment);
        transaction.setReorderingAllowed(true);
        if (addStack) {
            transaction.addToBackStack(null);
        }
        transaction.commit();
    }
    private void replaceFragment(Fragment fragment, boolean addToBackStack) {
        // 1. Obtenir le gestionnaire de fragments
        FragmentManager fragmentManager = getSupportFragmentManager();

        // 2. Commencer la transaction
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        // 3. Remplacer le contenu du FrameLayout par le nouveau fragment
        transaction.replace(R.id.main_content_area, fragment);

        // 4. Gérer le bouton "Retour" (Back Stack)
        if (addToBackStack) {
            transaction.addToBackStack(null);
        }

        // 5. Valider et appliquer les changements
        transaction.commit();
    }
}