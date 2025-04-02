
public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, int codigo, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidadeEmEstoque += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        if (quantidade <= this.quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Ops! Não temos produtos suficientes no estoque.");
        }
    }

    public double valorTotalEmEstoque() {
        return this.preco * this.quantidadeEmEstoque;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
        System.out.println("Valor total em estoque: R$" + valorTotalEmEstoque());
        System.out.println("------------------------------");
    }
}



