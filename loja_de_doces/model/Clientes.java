package loja_de_doces.model;

public class Clientes {
    private String nome;
    private String endereco;
    private int CPF;
    

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


    
