import java.util.Scanner;

public class MainLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Quantos livros você deseja cadastrar? ");
        int quantidadeLivros = scanner.nextInt();
        scanner.nextLine();

        Livro[] biblioteca = new Livro[quantidadeLivros];

        for (int i = 0; i < quantidadeLivros; i++) {
            System.out.println("Cadastro do " + (i + 1) + "º livro:");
            System.out.println("------------------------");

            System.out.print("Digite o título do livro: ");
            String titulo = scanner.nextLine();

            System.out.print("Digite o nome do autor: ");
            String autor = scanner.nextLine();

            System.out.print("Digite o ano de publicação: ");
            int ano = scanner.nextInt();
            scanner.nextLine();

            biblioteca[i] = new Livro(titulo, autor, ano);
        }


        for (Livro livro : biblioteca) {
            livro.exibirInfo();
        }

    }
}