package com.example.projetomobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FormLogin extends AppCompatActivity {


   Button bt_entrar;
   EditText txtUsuario,txtSenha;
   TextView lbResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        txtUsuario = findViewById(R.id.edit_email);
        txtSenha = findViewById(R.id.edit_senha);
        lbResultado = findViewById(R.id.resultado);
        bt_entrar = findViewById(R.id.bt_entrar);
    }
    public void login (View v){
        String nome = txtUsuario.getText().toString();
        String senha = txtSenha.getText().toString();


        if (nome.equalsIgnoreCase("admin")){
            if(senha.equalsIgnoreCase("12345")) {
                lbResultado.setText("login com sucesso!");
                Intent intent = new Intent(FormLogin.this, mainMenu.class);
                startActivity(intent);

                finish();
            }else{
                lbResultado.setText("senha invalida!");
                limpar();
            }
        }else {
            lbResultado.setText("usuario invalido!");
            limpar();
        }
    }
}

