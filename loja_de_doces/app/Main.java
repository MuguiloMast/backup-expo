
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in); // Scanner para entrada do usuário

    public static void main(String[] args) { // Função principal
        boolean executando = true;

        while (executando) {
            menu();
            int opcao = opcao(); // recebe a escolha do usuario
            switch (opcao) {
                case 1:
                    gerenciarProdutos(); // chama o gerenciador de produtos
                    break;
                case 2:
                    gerenciarClientes(); // chama o gerenciador de clientes
                    break;
                case 0:
                    executando = false;
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
            }
        }

        // pausa para o usuario
        if (executando) {
            System.out.println("\nAperte Enter para continuar...");
            scanner.nextLine(); // Espera o usuário pressionar Enter
        }

        scanner.close(); // Fecha o scanner ao sair do programa
    }

    private static int opcao() { // Lê a opção do usuário
        try {
            int opcao = Integer.parseInt(scanner.nextLine()); // Lê a entrada do usuário
            return opcao; // Retorna a opção escolhida
        } catch (NumberFormatException e) {
            return -1; // Retorna um valor inválido para indicar erro
        }
    }

    public static void menu() { // Menu principal
        System.out.println("=== Menus de Gerenciamento ===");
        System.out.println("1. Gerenciar Produtos");
        System.out.println("2. Gerenciar Clientes");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void menuProdutos() { // Menu de produtos
        System.out.println("Gerenciamento de Produtos");
        System.out.println("1. Adicionar Produto");
        System.out.println("2. Remover Produto");
        System.out.println("3. Atualizar Produto");
        System.out.println("4. Listar Produtos");
        System.out.println("0. Voltar ao Menu Principal");
        System.out.print("Escolha uma opção: ");
    }

    public static void menuClientes() { // Menu de clientes
        System.out.println("Gerenciamento de Clientes");
        System.out.println("1. Adicionar Cliente");
        System.out.println("2. Remover Cliente");
        System.out.println("3. Atualizar Cliente");
        System.out.println("4. Listar Clientes");
        System.out.println("0. Voltar ao Menu Principal");
        System.out.print("Escolha uma opção: ");
    }

    // gerenciamento de produtos
    public static void gerenciarProdutos() { // função para gerenciar produtos
        boolean executandoGProdutos = true;

        while (executandoGProdutos) {

            menuProdutos();
            int opcao = opcao(); // recebe a escolha do usuario

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    removerProduto();
                    break;
                case 3:
                    atualizarProduto();
                    break;
                case 4:
                    listarProdutos();
                    break;
                case 0:
                    executandoGProdutos = false;
                    System.out.println("Voltando ao Menu Principal.");
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
            }
        }

        // pausa para o usuario
        if (executandoGProdutos) {
            System.out.println("\nAperte Enter para continuar...");
            scanner.nextLine(); // Espera o usuário pressionar Enter
        }
    }

    // funções para cada opção do menu de produtos
    private static void adicionarProduto() { // função para adicionar produto
        System.out.println("Adicionando um novo produto...");
    }

    private static void removerProduto() { // função para remover produto
        System.out.println("Removendo um produto...");
    }

    private static void atualizarProduto() { // função para atualizar produto
        System.out.println("Atualizando um produto...");
    }

    private static void listarProdutos() { // função para listar produtos
        System.out.println("Listando todos os produtos...");
    }

    // gerenciamento de clientes
    public static void gerenciarClientes() { // função para gerenciar clientes

        boolean executandoGClientes = true;

        while (executandoGClientes) {
            menuClientes();
            int opcao = opcao(); // recebe a escolha do usuario

            switch (opcao) {
                case 1:
                    adicionarCliente();
                    break;
                case 2:
                    removerCliente();
                    break;
                case 3:
                    atualizarCliente();
                    break;
                case 4:
                    listarClientes();
                    break;
                case 0:
                    executandoGClientes = false;
                    System.out.println("Voltando ao Menu Principal.");
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
            }
        }

        // pausa para o usuario
        if (executandoGClientes) {
            System.out.println("\nAperte Enter para continuar...");
            scanner.nextLine(); // Espera o usuário pressionar Enter
        }

    }

    // funções para cada opção do menu de clientes
    private static void adicionarCliente() { // função para adicionar cliente
        System.out.println("Adicionando um novo cliente...");
    }

    private static void removerCliente() { // função para remover cliente
        System.out.println("Removendo um cliente...");
    }

    private static void atualizarCliente() { // função para atualizar cliente
        System.out.println("Atualizando um cliente...");
    }

    private static void listarClientes() { // função para listar clientes
        System.out.println("Listando todos os clientes...");
    }
}
