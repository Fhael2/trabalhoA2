import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("digite a marca do carro: ");
        String marca = teclado.nextLine();

        System.out.print("digite o modelo: ");
        String modelo = teclado.nextLine();

        System.out.print("digite o ano: ");
        int ano = teclado.nextInt();
        teclado.nextLine();

        System.out.print("digite a placa: ");
        String placa = teclado.nextLine();

        Carro carro = new Carro(marca, modelo, ano, placa);

        while (true) {
            System.out.println("1) acelerar");
            System.out.println("2) frear");
            System.out.println("3) ver dados do carro");
            System.out.println("4)] sair");

            int escolha = teclado.nextInt();

            if (escolha == 1) {
                System.out.print("quanto você quer acelerar? ");
                int quanto = teclado.nextInt();
                carro.acelerar(quanto);
            }

            else if (escolha == 2) {
                System.out.print("quanto você quer frear? ");
                int quanto = teclado.nextInt();
                carro.frear(quanto);
            }

            else if (escolha == 3) {
                carro.mostrarDados();
            }

            else if (escolha == 4) {
                System.out.println("tchau");
                break;
            }

            else {
                System.out.println("opção errada");
            }
        }

        teclado.close();
    }
}