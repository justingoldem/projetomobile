package com.example.projetomobile.model;


 public class produto {
    int foto;
   String codigo;
   String nome;
   String descricao;
   int quantidade;


 public produto() {
 }

  public produto (int foto, String codigo, String nome, String descricao, int quantidade) {

     this.foto = foto;
     this.codigo = codigo;
     this.nome = nome;
     this.descricao = descricao;
     this.quantidade = quantidade;
 }

 // Getters e Setters
     public int getFoto() {

     return foto;
 }

 public void setFoto(int foto) {

     this.foto = foto;
 }

 public String getCodigo() {

     return codigo;
 }


 public void setCodigo(String codigo) {

     this.codigo = codigo;
 }


 public String getNome() {

     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public String getDescricao() {

     return descricao;
 }

 public void setDescricao(String descricao) {

     this.descricao = descricao;
 }

 public int getQuantidade() {

     return quantidade;
 }

 public void setQuantidade(int quantidade) {

     this.quantidade = quantidade;
 }
}

