package loja_de_doces.model;

public class Funcionarios {
    private static String NomeFuncionarios = null;

    protected int CPF;
    protected String Funcao;

    public Funcionarios(String NomeFuncionarios, int CPF, String funcao) {
        this.NomeFuncionarios = NomeFuncionarios;
        this.CPF = CPF;
        this.Funcao = Funcao;
    }

    public void setNomeFuncionarios(String NomeFuncionarios) {
        this.NomeFuncionarios = NomeFuncionarios;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    public String getNomeFuncionarios() {
        return NomeFuncionarios;
    }

    public int getCPF() {
        return CPF;
    }

    public String getFuncao() {
        return Funcao;
    }

}
