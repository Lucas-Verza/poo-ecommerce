/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Categoria {

    String nome;
    String descricao;
    ArrayList<Produto> lista_categoriaProd;

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

    public ArrayList<Produto> getLista_categoriaProd() {
        return lista_categoriaProd;
    }

    public void setLista_categoriaProd(ArrayList<Produto> lista_categoriaProd) {
        this.lista_categoriaProd = lista_categoriaProd;
    }

}
