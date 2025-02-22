package com.york.sample.wmt4x3u;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.york.sample.wmt4x3u.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.loginBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueUsername = binding.loginEditUsername.getText().toString();
                String valuePassword = binding.loginEditPassword.getText().toString();

                Log.d("LOGIN", "username is:" + valueUsername + " and the password is:" + valuePassword);
            }
        });

    }
}