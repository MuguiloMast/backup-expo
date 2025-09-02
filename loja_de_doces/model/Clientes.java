public class Clientes {
    private String nome;
    private String endereco;
    private int CPF;

    public Clientes(String nome, String endereco , int CPF) {
        this.nome = nome;
        this.endereco = endereco;
        this.CPF = CPF;
    }



    public Clientes(String nome2, String cpf2, String endereco2) {
        //TODO Auto-generated constructor stub
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

    public void add(Clientes clientes) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
