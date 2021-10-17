package com.example.devsbooks;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TelaDeLogin extends AppCompatActivity {

    private EditText user;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_login);

        user = findViewById(R.id.login_user_field);
        password = findViewById(R.id.login_password_field);
        
        findViewById(R.id.login_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                autenticar();
            }
        });


    }

    private void autenticar(){

        String defaultUser = "ricardo.silva.30";
        String defaultPassword = "123456";

        if((user.getText().toString().compareTo(defaultUser) == 0) &&
                password.getText().toString().compareTo(defaultPassword) == 0){

            Intent home = new Intent(TelaDeLogin.this, MainActivity.class);
            startActivity(home);
            finish();

        }else{

            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setTitle("DevsBooks");
            builder.setMessage("Nome de usuário ou senha incorretos. Tente novamente.")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });

            builder.show();

        }


    }
}