public class Estoque {
    private int id;
    private Produtos produto;
    private int quantidade;

    public Estoque(int id, Produtos produto, int quantidade) { // Construtor
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Produtos getProduto() {
        return produto;
    }
    public void setProduto(Produtos produto) {
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //metodos especificos para a classe estoque

    @Override // Método toString para exibir informações do estoque
    public String toString() {
        return "Estoque [id=" + id + ", produto=" + produto + ", quantidade=" + quantidade + "]";
    }
    
}
