import java.util.List;

public class Estoque {
    private String dataprodutos;
    private int quantidade;

    public Estoque(String dataprodutos, int quantidade) {
        this.dataprodutos = dataprodutos;
        this.quantidade = quantidade;
    }

    public Estoque() {
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

    public boolean cadastrarProduto(Produto p1) {
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarProduto'");
    }

    public boolean atualizarEstoque(int i, int j) {
        throw new UnsupportedOperationException("Unimplemented method 'atualizarEstoque'");
    }

    public boolean removerProduto(int codigo) {
        throw new UnsupportedOperationException("Unimplemented method 'removerProduto'");
    }

    public List<Produto> buscarProdutoPorNome(String termo) {
        throw new UnsupportedOperationException("Unimplemented method 'buscarProdutoPorNome'");
    }

    public void listarProdutos() {
        throw new UnsupportedOperationException("Unimplemented method 'listarProdutos'");
    }

}
