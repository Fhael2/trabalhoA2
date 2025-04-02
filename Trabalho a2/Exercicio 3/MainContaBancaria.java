import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("BANCO");
        System.out.print("digite sua conta: ");
        String  conta = teclado.nextLine();

        System.out.print("digite seu nome completo: ");
        String nome = teclado.nextLine();

        ContaBancaria conta1 = new ContaBancaria(conta, nome);

        while (true) {
            System.out.println("escolha uma opção: ");
            System.out.println("1 - colocar dinheiro");
            System.out.println("2 - tirar dinheiro");
            System.out.println("3 - ver saldo");
            System.out.println("4 - ver  dados da conta");
            System.out.println("5 - sair");

            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("quanto quer colocar? R$ ");
                    double valor1 = teclado.nextDouble();
                    conta1.depositar(valor1);
                    break;

                case 2:
                    System.out.print("quanto quer tirar? R$ ");
                    double valor2 = teclado.nextDouble();
                    conta1.sacar(valor2);
                    break;

                case 3:
                    conta1.mostrarSaldo();
                    break;

                case 4:
                    conta1.mostrarDados();
                    break;

                case 5:
                    System.out.println("ate mais");
                    return;
            }
        }

    }
}