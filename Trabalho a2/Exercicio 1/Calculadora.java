public class Calculadora {

    int numero1;
    int numero2;


    void soma(){
        int somadosnumeros = (numero1 + numero2);
        System.out.println( somadosnumeros);
    }
    void subtracao(){
        int menosdosnumeros = (numero1 - numero2);
        System.out.println( menosdosnumeros);
    }
    void divisao(){
        if (numero2 != 0) {
            float divisaoDosNumeros = (float) numero1 / numero2;
            System.out.println( "A multiplicação dos dois numero é: " + divisaoDosNumeros);
        } else {
            System.out.println("Erro: Divisão por zero não permitida.");
        }
    }
    void multiplicacao(){
        float vezesdosnumeros = (numero1 * numero2);
        System.out.println(vezesdosnumeros);
    }





}
