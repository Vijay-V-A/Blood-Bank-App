package com.vijay.bloodBank;


import android.app.Activity;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.vijay.bloodBank.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Activity activity = this;
        activity.setTitle("Settings");

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());
        binding.bottomMenu.setBackground(null);

        binding.bottomMenu.setOnItemSelectedListener(item -> {

            CharSequence title = item.getTitle();
            assert title != null;
            if (title.equals("Home"))
                replaceFragment(new HomeFragment());
            else if (title.equals("Request"))
                replaceFragment(new RequestFragment());
            else if (title.equals("Profile"))
                replaceFragment(new ProfileFragment());

            return true;
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }
}
