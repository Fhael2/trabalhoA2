import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Calculadora[] operacoes = new Calculadora[1]; // Tamanho do array ajustado

        for (int i = 0; i < operacoes.length; i++) {
            operacoes[i] = new Calculadora();

            System.out.println("---------------");
            System.out.println("Digite o primeiro numero" );
            operacoes[i].numero1 = leitor.nextInt();

            System.out.println("---------------");
            System.out.println("Digite o Segundo numero");
            operacoes[i].numero2 = leitor.nextInt();

            System.out.println("1: Soma");
            System.out.println("2: Subtração");
            System.out.println("3: Divisão");
            System.out.println("4: Multiplicação");

            int calculo = leitor.nextInt();

            switch (calculo) {
                case 1:
                    System.out.println("A soma dos dois numero é: ");
                    operacoes[i].soma();
                    break;

                case 2:
                    System.out.println("A subtração dos dois numero é: ");
                    operacoes[i].subtracao();
                    break;
                case 3:
                    System.out.println("A divisao dos dois numero é: " );
                    operacoes[i].divisao();break;

                case 4:
                    System.out.println(" ");
                    operacoes[i].multiplicacao();



            }
        }


    }
}
