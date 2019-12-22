package com.destiny.deconapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.destiny.deconapp.API.ApiRequest;
import com.destiny.deconapp.API.RetroServer;
import com.destiny.deconapp.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {
    EditText etNama, etEmail, etNoHP, etUsername, etPassword;
    Button btRegister;
    TextView tvSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etNama = findViewById(R.id.etNama);
        etEmail = findViewById(R.id.etEmail);
        etNoHP = findViewById(R.id.etNoHP);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btRegister = findViewById(R.id.btRegister);
        tvSignIn = findViewById(R.id.tvSignIn);

        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ApiRequest api = RetroServer.getClient().create(ApiRequest.class);
                Call<ResponseModel> register = api.Register(etNama.getText().toString(),etEmail.getText().toString(),etNoHP.getText().toString(),etUsername.getText().toString(),etPassword.getText().toString());
                register.enqueue(new Callback<ResponseModel>() {
                    @Override
                    public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                        try {
                            if (response.body().getResponse().equals("Insert")){
                                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(RegisterActivity.this, response.body().getResponse(), Toast.LENGTH_SHORT);

                            }
                        }catch (Exception e){
                            Toast.makeText(RegisterActivity.this, "Terjadi Kesalahan", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseModel> call, Throwable t) {
                        Toast.makeText(RegisterActivity.this, "Koneksi Gagal", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
    private void changeActivity(){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
