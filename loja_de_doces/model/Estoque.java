package loja_de_doces.model;

    import loja_de_doces.model.Clientes;
    import loja_de_doces.model.Doces;
    import loja_de_doces.model.Funcionarios;

public class Estoque {
    private String dataprodutos;
    private int quantidade;

    public Estoque(String dataprodutos, int quantidade) {
        this.dataprodutos = dataprodutos;
        this.quantidade = quantidade;

    }

    public void setDataprodutos(String dataprodutos) {
        this.dataprodutos = dataprodutos;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataprodutos() {
        return dataprodutos;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
