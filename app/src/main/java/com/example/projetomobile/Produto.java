package com.example.projetomobile;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



    public  class Produto {
        String codigo;
        String nome;
        int quantidade;
        int foto; // variavel para foto


        public  Produto (int Foto, String codigo, String nome, String descricao, int quantidade) {

            this.foto = foto;
            this.codigo = codigo;
            this.nome = nome;
            this.quantidade = quantidade;
        }

        // Getters e Setters
        public int getFoto() {

            return foto;
        }

        public void setfoto(int foto) {

            this.foto = foto;
        }

        public String getCodigo() {

            return codigo;
        }


        public void setcodigo(String codigo) {

            this.codigo = codigo;
        }


        public String getNome() {

            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }



        public int getQuantidade() {

            return quantidade;
        }

        public void setQuantidade(int quantidade) {

            this.quantidade = quantidade;
        }
    }

