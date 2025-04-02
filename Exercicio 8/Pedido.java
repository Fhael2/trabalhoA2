public class Pedido {
    private Pizza pizzaEscolhida;
    private String tamanho;
    private double valorTotal;
    private boolean cancelado;
    private String enderecoEntrega;

    public Pedido(Pizza pizzaEscolhida, String tamanho, String enderecoEntrega) {
        this.pizzaEscolhida = pizzaEscolhida;
        this.tamanho = tamanho;
        this.enderecoEntrega = enderecoEntrega;
        this.cancelado = false;
        calcularValor();
    }

    private void calcularValor() {
        double multiplicador = 1.0;

        switch (tamanho.toLowerCase()) {
            case "pequena":
                multiplicador = 0.8;
                break;
            case "media":
                multiplicador = 1.0;
                break;
            case "grande":
                multiplicador = 1.2;
                break;
            default:
                break;
        }

        this.valorTotal = pizzaEscolhida.getValor() * multiplicador;
    }

    public void cancelarPedido() {
        this.cancelado = true;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Pizza getPizzaEscolhida() {
        return pizzaEscolhida;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public String toString() {
        return "Pizza: " + pizzaEscolhida.getNome() +
                ", Tamanho: " + tamanho +
                ", Valor: R$ " + valorTotal +
                ", Endereço: " + enderecoEntrega +
                (cancelado ? " [CANCELADO]" : "");
    }
}