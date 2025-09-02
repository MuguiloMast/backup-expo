import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Clientes> clientes = new ArrayList<>();
    private static Estoque estoque = new Estoque();
    private static Scanner scanner = new Scanner(System.in);
    private static final List<Funcionarios> funcionarios = new ArrayList<>();
    private static String[] args;

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

    private static void inicializarEstoque() {
        // Cria alguns produtos
        Produto p1 = new Produto(1, "Notebook", 3500.0);
        Produto p2 = new Produto(2, "Mouse", 50.0);
        Produto p3 = new Produto(3, "Teclado", 120.0);

        // Cadastra produtos no estoque
        estoque.cadastrarProduto(p1);
        estoque.cadastrarProduto(p2);
        estoque.cadastrarProduto(p3);

        // Adiciona quantidade aos produtos
        estoque.atualizarEstoque(1, 10);
        estoque.atualizarEstoque(2, 20);
        estoque.atualizarEstoque(3, 15);

        System.out.println("Estoque inicializado com produtos para teste.");
    }

    private static void exibirMenu() {
        System.out.println("\n===== SISTEMA DE GERENCIAMENTO DE ESTOQUE =====");
        System.out.println("1 - Cadastrar novo produto");
        System.out.println("2 - Atualizar quantidade em estoque");
        System.out.println("3 - Remover produto");
        System.out.println("4 - Buscar produto por nome");
        System.out.println("5 - Listar todos os produtos");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao() {
        try {
            int opcao = Integer.parseInt(scanner.nextLine());
            return opcao;
        } catch (NumberFormatException e) {
            return -1; // Retorna opção inválida
        }
    }

    private static void cadastrarProduto() {
        try {
            System.out.println("\n--- CADASTRO DE PRODUTO ---");

            System.out.print("Informe o código do produto: ");
            int codigo = Integer.parseInt(scanner.nextLine());

            System.out.print("Informe o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Informe o preço do produto: R$ ");
            double preco = Double.parseDouble(scanner.nextLine());

            Produto novoProduto = new Produto(codigo, nome, preco);
            boolean sucesso = estoque.cadastrarProduto(novoProduto);

            if (sucesso) {
                System.out.println("Produto cadastrado com sucesso!");

                System.out.print("Deseja adicionar quantidade em estoque? (S/N): ");
                String resposta = scanner.nextLine();

                if (resposta.equalsIgnoreCase("S")) {
                    System.out.print("Informe a quantidade a adicionar: ");
                    int quantidade = Integer.parseInt(scanner.nextLine());
                    estoque.atualizarEstoque(codigo, quantidade);
                    System.out.println("Estoque atualizado com sucesso!");
                }
            } else {
                System.out.println("Erro: Produto com este código já existe!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor numérico inválido!");
        }
    }

    private static void atualizarEstoque() {
        try {
            System.out.println("\n--- ATUALIZAÇÃO DE ESTOQUE ---");

            System.out.print("Informe o código do produto: ");
            int codigo = Integer.parseInt(scanner.nextLine());

            System.out.print("Informe a quantidade a adicionar (use valores negativos para remover): ");
            int quantidade = Integer.parseInt(scanner.nextLine());

            boolean sucesso = estoque.atualizarEstoque(codigo, quantidade);
            if (sucesso) {
                System.out.println("Estoque atualizado com sucesso!");
            } else {
                System.out.println("Erro: Produto não encontrado ou quantidade insuficiente!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor numérico inválido!");
        }
    }

    private static void removerProduto() {
        try {
            System.out.println("\n--- REMOÇÃO DE PRODUTO ---");

            System.out.print("Informe o código do produto a remover: ");
            int codigo = Integer.parseInt(scanner.nextLine());

            boolean sucesso = estoque.removerProduto(codigo);
            if (sucesso) {
                System.out.println("Produto removido com sucesso!");
            } else {
                System.out.println("Erro: Produto não encontrado!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor numérico inválido!");
        }
    }

    private static void buscarPorNome() {
        System.out.println("\n--- BUSCA POR NOME ---");

        System.out.print("Informe o termo de busca: ");
        String termo = scanner.nextLine();

        List<Produto> resultados = estoque.buscarProdutoPorNome(termo);

        if (resultados.isEmpty()) {
            System.out.println("Nenhum produto encontrado com o termo: " + termo);
        } else {
            System.out.println("\nProdutos encontrados:");
            for (Produto p : resultados) {
                p.exibirInformacoes();
                System.out.println("----------------------------");
            }
        }
    }

    private static void listarTodos() {
        System.out.println("\n--- LISTA DE PRODUTOS ---");
        estoque.listarProdutos();
    }

    {
        String[] args2 = args;
        Main.args = args;
        System.out.println("=== Sistema de Gestão Clientes e Funcionarios ===\n");

        int opcao;
        do {
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarClientes();
                    break;
                case 2:
                    cadastrarFuncionarios();
                    break;
                case 3:
                    listarClientes();
                    break;
                case 4:
                    listarFuncionarios();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            if (opcao != 0) {
                System.out.println("\nPressione Enter para continuar...");
                scanner.nextLine();
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1. Cadastrar Clientes");
        System.out.println("2. Cadastrar Funcionarios");
        System.out.println("3. Listar Clientes");
        System.out.println("4. Listar Funcionarios");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarClientes() {
        System.out.println("\n--- Cadastro de Clientes ---");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Enderoço: ");
        String endereco = scanner.nextLine();

        try {
            Clientes clientes = new Clientes(nome, cpf, endereco);
            clientes.add(clientes);
            System.out.println("Clientes cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar Clientes: " + e.getMessage());
        }
    }

    private static void cadastrarFuncionarios() {
        System.out.println("\n--- Cadastro de Funcionarios ---");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Função: ");
        String funcao = scanner.nextLine();

        try {
            Funcionarios funcionarios = new Funcionarios(nome, cpf, funcao);
            Funcionarios.add(funcionarios);
            System.out.println("Funcionarios cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar Funcionarios: " + e.getMessage());
        }
    }

    private static void listarClientes() {
        System.out.println("\n--- Lista de Clientes ---");

        if (clientes.isEmpty()) {
            System.out.println("Nenhum Clientes cadastrado.");
            return;
        }

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i));
        }
    }

    private static void listarFuncionarios() {
        System.out.println("\n--- Lista de funcionarios ---");

        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionarios cadastrado.");
            return;
        }

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println((i + 1) + ". " + funcionarios.get(i));
        }
    }

}
