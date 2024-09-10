package com.example.projetomobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FormLogin extends AppCompatActivity {

    //private TextView text_tela_cadastro;
    private androidx.appcompat.widget.AppCompatButton bt_entrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        IniciarComponentes();
        {

            // text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            //@Override
            // public void onClick(View v) {
            //  Intent intent = new Intent(FormLogin.this, FormCadastro.class);
            //  startActivity(intent);

//}
            //});
            bt_entrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(FormLogin.this, mainMenu.class);
                    startActivity(intent);
                }
            });


        }

        }
        private void IniciarComponentes() {
            //text_tela_cadastro = findViewById(R.id.text_tela_cadrastro);
            bt_entrar = findViewById(R.id.bt_entrar);
    }
}