public class Produtos { // Classe de modelo para produtos
    private int id; 
    private String nome; 
    private double preco;
    private int quantidade;

    public Produtos(int id, String nome, double preco, int quantidade) { // Construtor
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    // Getters e Setters
    public int getId() { 
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //metodos especificos para a classe produtos

    public void adicionarEstoque(int quantidade) { // Adiciona quantidade ao estoque
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
    }
    public boolean removerEstoque(int quantidade) { // Remove quantidade do estoque
        if (quantidade > 0 && this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return true;
        }
        return false;
    }

    @Override // Método toString para exibir informações do produto
    public String toString() {
        return "Produtos [id=" + id + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }


    
}
