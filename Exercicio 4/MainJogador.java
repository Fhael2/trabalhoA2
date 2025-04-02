import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MainJogador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<>();

        while (true) {
            System.out.println("1) Cadastrar Novo Jogador");
            System.out.println("2) Adicionar Pontos");
            System.out.println("3) Buscar Jogador");
            System.out.println("4) Listar Jogadores");
            System.out.println("5) Remover Jogador");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do jogador: ");
                    String nome = scanner.nextLine();
                    Jogador novoJogador = new Jogador(nome);
                    jogadores.add(novoJogador);
                    System.out.println("Jogador " + nome + " cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("\nNome do jogador: ");
                    String nomePontos = scanner.nextLine();
                    Jogador jogador = buscarJogador(jogadores, nomePontos);
                    if (jogador != null) {
                        System.out.print("Quantidade de pontos para adicionar: ");
                        int pontos = scanner.nextInt();
                        jogador.aumentarPontuacao(pontos);
                        System.out.println("Pontos adicionados com sucesso!");
                    } else {
                        System.out.println("Jogador não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Nome do jogador para buscar: ");
                    String nomeBusca = scanner.nextLine();
                    Jogador encontrado = buscarJogador(jogadores, nomeBusca);
                    if (encontrado != null) {
                        System.out.println(encontrado.mostrarInformacoes());
                    } else {
                        System.out.println("Jogador não encontrado.");
                    }
                    break;

                case 4:
                    if (jogadores.isEmpty()) {
                        System.out.println("Nenhum jogador cadastrado.");
                    } else {
                        System.out.println("=== Lista de Jogadores ===");
                        for (Jogador j : jogadores) {
                            System.out.println(j.mostrarInformacoes());
                        }
                    }
                    break;

                case 5:
                    System.out.print("Nome do jogador para remover: ");
                    String nomeRemover = scanner.nextLine();
                    Jogador jogadorRemover = buscarJogador(jogadores, nomeRemover);
                    if (jogadorRemover != null) {
                        jogadores.remove(jogadorRemover);
                        System.out.println("Jogador " + nomeRemover + " removido com sucesso!");
                    } else {
                        System.out.println("Jogador não encontrado.");
                    }
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

    private static Jogador buscarJogador(List<Jogador> jogadores, String nome) {
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                return jogador;
            }
        }
        return null;
    }
}