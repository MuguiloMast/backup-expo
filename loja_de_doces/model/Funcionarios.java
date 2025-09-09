public class Funcionarios {
    private String nomeFuncionarios = null;
   
    protected int cpf;

    protected String funcao;

    public Funcionarios(String nomeFuncionarios, String funcao, int cpf) {
        this.nomeFuncionarios = nomeFuncionarios;
        this.cpf = cpf;
        this.funcao = funcao;
    }


    public void setNomeFuncionarios(String nomeFuncionarios) {
        this.nomeFuncionarios = nomeFuncionarios;
    }

    public void setCPF(int cpf) {
        this.cpf = cpf;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getNomeFuncionarios() {
        return nomeFuncionarios;
    }

    public int getCPF() {
        return cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cpf;
        result = prime * result + ((funcao == null) ? 0 : funcao.hashCode());
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
        Funcionarios other = (Funcionarios) obj;
        if (cpf != other.cpf)
            return false;
        if (funcao == null) {
            if (other.funcao != null)
                return false;
        } else if (!funcao.equals(other.funcao))
            return false;
        return true;
    }

}
