package com.example.projetomobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mainMenu extends AppCompatActivity {

    private androidx.appcompat.widget.AppCompatButton text_adicionaproduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        IniciarComponentes();
        {
            text_adicionaproduto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mainMenu.this, add.class);
                    startActivity(intent);
                }
            });
        }

        }
    private void IniciarComponentes() {
        text_adicionaproduto = findViewById(R.id.text_adicionaproduto);
    }
}
