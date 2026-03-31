import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SistemaCadastro sistema = new SistemaCadastro();

        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE CADASTRO ===");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Buscar usuário");
            System.out.println("4 - Remover usuário");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();

                    sistema.adicionarUsuario(new Usuario(nome, idade));
                    System.out.println("Usuário cadastrado!");
                    break;

                case 2:
                    sistema.listarUsuarios();
                    break;

                case 3:
                    System.out.print("Nome para buscar: ");
                    nome = scanner.nextLine();
                    sistema.buscarUsuario(nome);
                    break;

                case 4:
                    System.out.print("Nome para remover: ");
                    nome = scanner.nextLine();
                    sistema.removerUsuario(nome);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}