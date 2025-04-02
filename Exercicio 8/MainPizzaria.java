import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPizzaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pizza> menuPizzas = new ArrayList<>();
        List<Pedido> pedidosRealizados = new ArrayList<>();

        menuPizzas.add(new Pizza("Margherita", 25.00, List.of("Molho de tomate", "Mussarela", "Manjericão")));
        menuPizzas.add(new Pizza("Calabresa", 30.00, List.of("Molho de tomate", "Mussarela", "Calabresa")));
        menuPizzas.add(new Pizza("Portuguesa", 35.00, List.of("Molho de tomate", "Mussarela", "Presunto", "Ovo", "Cebola")));

        while (true) {
            System.out.println("=== Pizzaria ===");
            System.out.println("1. Ver Menu de Pizzas");
            System.out.println("2. Adicionar Nova Pizza");
            System.out.println("3. Realizar Pedido");
            System.out.println("4. Gerar Relatório de Pedidos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Menu de Pizzas:");
                    for (int i = 0; i < menuPizzas.size(); i++) {
                        System.out.println((i + 1) + ". " + menuPizzas.get(i));
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome da pizza: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o valor da pizza: R$ ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Digite os ingredientes (separados por vírgula): ");
                    String ingredientesStr = scanner.nextLine();
                    List<String> ingredientes = List.of(ingredientesStr.split(","));
                    menuPizzas.add(new Pizza(nome, valor, ingredientes));
                    System.out.println("Pizza adicionada com sucesso!");
                    break;
                case 3:
                    System.out.println("Escolha uma pizza:");
                    for (int i = 0; i < menuPizzas.size(); i++) {
                        System.out.println((i + 1) + ". " + menuPizzas.get(i));
                    }
                    System.out.print("Digite o número da pizza escolhida: ");
                    int pizzaEscolhidaIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    Pizza pizzaEscolhida = menuPizzas.get(pizzaEscolhidaIndex);

                    System.out.print("Escolha o tamanho (pequena, media, grande): ");
                    String tamanho = scanner.nextLine();

                    System.out.print("Digite o endereço de entrega: ");
                    String enderecoEntrega = scanner.nextLine();

                    Pedido novoPedido = new Pedido(pizzaEscolhida, tamanho, enderecoEntrega);
                    pedidosRealizados.add(novoPedido);
                    System.out.println("Pedido realizado com sucesso!");
                    break;
                case 4:
                    System.out.println("Relatório de Pedidos:");
                    double total = 0;
                    int count = 0;
                    for (Pedido pedido : pedidosRealizados) {
                        System.out.println(pedido);
                        if (!pedido.isCancelado()) {
                            total += pedido.getValorTotal();
                            count++;
                        }
                    }
                    double media = (count > 0) ? total / count : 0;
                    System.out.println("Total de Pedidos: " + count);
                    System.out.println("Média de Preço dos Pedidos: R$ " + media);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}