public class Clientes { // Classe de modelo para clientes
    private int id;
    private String nome;
    private int cpf;

    public Clientes(int id, String nome, int cpf) { // Construtor
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
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
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    //metodos especificos para a classe clientes
    @Override // Método toString para exibir informações do cliente
    public String toString() {
        return "Clientes [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
    }

    
}
