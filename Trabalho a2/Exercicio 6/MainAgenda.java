import java.util.Scanner;

public class MainAgenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("=== Agenda de Contatos ===");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Buscar Contato");
            System.out.println("3 - Remover Contato");
            System.out.println("4 - Listar Contatos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone do contato: ");
                    String telefone = scanner.nextLine();

                    Contato novoContato = new Contato(nome, telefone);
                    agenda.adicionarContato(novoContato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome do contato: ");
                    String nomeBusca = scanner.nextLine();
                    Contato encontrado = agenda.buscarContatoPorNome(nomeBusca);

                    if (encontrado != null) {
                        System.out.println("Contato encontrado: " + encontrado);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do contato para remover: ");
                    String nomeRemover = scanner.nextLine();
                    if (agenda.removerContato(nomeRemover)) {
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("=== Lista de Contatos ===");
                    agenda.listarContatos();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Ops! Opção inválida. Tente novamente.");
            }
        }
    }
}