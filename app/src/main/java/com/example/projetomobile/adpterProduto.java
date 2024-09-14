package com.example.projetomobile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adpterProduto extends RecyclerView.Adapter<adpterProduto.ProdutoViewHolder> {

    //public Context context;
   private List<Produto> listaDeProdutos;

    // Construtor do adapter
    public adpterProduto(List<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    @NonNull
    @Override
    public ProdutoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.produto_item,parent,false);
        return new
                ProdutoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutoViewHolder holder, int position){
        Produto produto = listaDeProdutos.get(position);
        holder.tvCodigo.setText(produto.getCodigo());
        holder.tvNome.setText(produto.getNome());
        holder.tvQuantidade.setText(produto.getQuantidade());
        holder.ivFoto.setImageResource(produto.getFoto());
    }
    @Override
    public int getItemCount(){
        return
                listaDeProdutos.size();
    }
      static class ProdutoViewHolder extends RecyclerView.ViewHolder {
        TextView tvCodigo,tvNome,tvQuantidade;
        ImageView ivFoto;

          public ProdutoViewHolder(@NonNull View itemView) {
              super(itemView);
               tvCodigo = itemView.findViewById(R.id.tv_codigo);
               tvNome = itemView.findViewById(R.id.tv_nome);
               tvQuantidade = itemView.findViewById(R.id.tv_quantidade);
               ivFoto = itemView.findViewById(R.id.iv_foto);
          }
      }


    }

