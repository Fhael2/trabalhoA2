public class Carro {
    String marca;
    String modelo;
    int ano;
    String placa;
    int velocidade;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidade = 0;
    }

    public void acelerar(int quanto) {
        velocidade = velocidade + quanto;
        System.out.println("O carro está a " + velocidade + " km/h");
    }

    public void frear(int quanto) {
        if (velocidade > 0) {
            velocidade = velocidade - quanto;
            if (velocidade < 0) {
                velocidade = 0;
            }
            System.out.println("o carro está a " + velocidade + " km/h");
        } else {
            System.out.println("o carro já está parado!");
        }
    }

    // Método para mostrar dados do carro
    public void mostrarDados() {
        System.out.println("Dados do carro:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("----------------");
    }
}