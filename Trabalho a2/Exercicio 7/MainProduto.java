import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> estoque = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Sistema de Gerenciamento de Estoque ===");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Atualizar Produto");
            System.out.println("3 - Remover Produto");
            System.out.println("4 - Gerar Relatório de Estoque");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nNome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Código do Produto: ");
                    int codigo = scanner.nextInt();
                    System.out.print("Preço do Produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade em Estoque: ");
                    int quantidade = scanner.nextInt();

                    // Cria um novo produto e adiciona à lista
                    Produto produto = new Produto(nome, codigo, preco, quantidade);
                    estoque.add(produto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("\nInforme o código do produto a ser atualizado: ");
                    int codigoAtualizacao = scanner.nextInt();
                    Produto produtoAtualizado = buscarProdutoPorCodigo(estoque, codigoAtualizacao);

                    if (produtoAtualizado != null) {
                        System.out.print("Novo nome do Produto: ");
                        scanner.nextLine(); // Limpa o buffer
                        String novoNome = scanner.nextLine();
                        System.out.print("Novo preço do Produto: ");
                        double novoPreco = scanner.nextDouble();
                        System.out.print("Nova quantidade em Estoque: ");
                        int novaQuantidade = scanner.nextInt();

                        // Atualiza as informações do produto
                        produtoAtualizado.setNome(novoNome);
                        produtoAtualizado.setPreco(novoPreco);
                        produtoAtualizado.setQuantidadeEmEstoque(novaQuantidade);
                        System.out.println("Produto atualizado com sucesso!");
                    } else {
                        System.out.println("Ops! Produto não encontrado.");
                    }
                    break;

                case 3:

                    System.out.print("\nInforme o código do produto a ser removido: ");
                    int codigoRemocao = scanner.nextInt();
                    Produto produtoRemovido = buscarProdutoPorCodigo(estoque, codigoRemocao);

                    if (produtoRemovido != null) {
                        estoque.remove(produtoRemovido);
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Ops! Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("\n=== Relatório de Estoque ===");
                    for (Produto p : estoque) {
                        p.exibirInfo();
                    }
                    break;

                case 0:
                    // Encerra o programa
                    System.out.println("\nSaindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("\nOps! Opção inválida. Tente novamente.");
            }
        }
    }

    // Método para encontrar um produto pelo seu código
    public static Produto buscarProdutoPorCodigo(List<Produto> estoque, int codigo) {
        // Procura em todos os produtos da lista
        for (Produto produto : estoque) {
            // Se encontrar um produto com o código procurado, retorna ele
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        // Se não encontrar, retorna null
        return null;
    }
}