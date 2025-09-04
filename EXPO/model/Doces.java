package model;

public class Doces {
    private String nomeDoces;
    private int valor;
    private String sabor;

    public Doces(String nomeDoces, int valor, String sabor) {
        this.nomeDoces = nomeDoces;
        this.valor = valor;
        this.sabor = sabor;
    }

    public void setNomeDoces(String nomeDoces) {
        this.nomeDoces = nomeDoces;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getNomeDoces() {
        return nomeDoces;
    }

    public int getValor() {
        return valor;
    }

    public String getSabor() {
        return sabor;
    }
}
