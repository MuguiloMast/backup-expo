import loja_de_doces.model.Estoque;
import loja_de_doces.model.Clientes;
import loja_de_doces.model.Funcionarios;
import loja_de_doces.validacoes.Validacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Clientes> clientes = new ArrayList<>();
    private static Estoque estoque = new Estoque(null, 0);
    private static Scanner scanner = new Scanner(System.in);
    private static final List<Funcionarios> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        boolean executando = true;

        // Pré-cadastrar alguns produtos para teste
        inicializarEstoque();

        while (executando) {
            exibirMenu();
            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    atualizarEstoque();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    buscarPorNome();
                    break;
                case 5:
                    listarTodos();
                    break;
                case 0:
                    executando = false;
                    System.out.println("Finalizando o programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }

            // Pausa para o usuário ler a saída
            if (executando) {
                System.out.println("\nPressione ENTER para continuar...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    private static void listarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodos'");
    }

    private static void buscarPorNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorNome'");
    }

    private static void removerProduto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerProduto'");
    }

    private static void atualizarEstoque() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarEstoque'");
    }

    private static void cadastrarProduto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarProduto'");
    }

    private static int lerOpcao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lerOpcao'");
    }

    private static void exibirMenu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirMenu'");
    }

    private static void inicializarEstoque() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inicializarEstoque'");
    }
}
