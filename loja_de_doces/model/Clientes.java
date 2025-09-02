public class Clientes {
    private String nome;
    private String endereco;
    private int CPF;

    public Clientes(String nome, String endereco, int cPF) {
        this.nome = nome;
        this.endereco = endereco;
        CPF = cPF;
    }

    public Clientes(String nome2, String cpf2, String endereco2) {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCPF(final int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getCPF() {
        return CPF;
    }

    public void add(Clientes clientes) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
        result = prime * result + CPF;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Clientes other = (Clientes) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (endereco == null) {
            if (other.endereco != null)
                return false;
        } else if (!endereco.equals(other.endereco))
            return false;
        if (CPF != other.CPF)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Clientes [nome=" + nome + ", endereco=" + endereco + ", CPF=" + CPF + ", getNome()=" + getNome()
                + ", getEndereco()=" + getEndereco() + ", getCPF()=" + getCPF() + ", hashCode()=" + hashCode()
                + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
}
