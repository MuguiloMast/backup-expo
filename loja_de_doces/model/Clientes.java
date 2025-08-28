package loja_de_doces.model;

import loja_de_doces.model.Doces.java;

public class Clientes {
    protected String nome;
    protected String endereco;
    protected int CPF;
    

    public Clientes(String nome, String endereco, int CPF){
        this.nome = nome;
        this.endereco = endereco;
        this.CPF= CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCpf(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getCpf() {
        return CPF;
    }
}


    
