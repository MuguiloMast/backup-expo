public class Doces extends Produtos{ // Classe de modelo para doces, que herda de Produtos
    private String sabor;
    private boolean contemGluten;

    public Doces(int id, String nome, double preco, int quantidade, String sabor, boolean contemGluten) { // Construtor
        super(id, nome, preco, quantidade);
        this.sabor = sabor;
        this.contemGluten = contemGluten;
    }

    // Getters e Setters
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public boolean isContemGluten() {
        return contemGluten;
    }

    public void setContemGluten(boolean contemGluten) {
        this.contemGluten = contemGluten;
    }


    //metodos especificos para a classe doces

    @Override // Método toString para exibir informações do doce
    public String toString() {
        return "Doces [sabor=" + sabor + ", contemGluten=" + contemGluten + ", toString()=" + super.toString() + "]";
    }

}
