public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
        this.nivel = 1;
    }

    public void aumentarPontuacao(int pontos) {
        this.pontuacao += pontos;
        if (this.pontuacao >= this.nivel + 100) {
            subirNivel();
        }
    }

    private void subirNivel() {
        this.nivel++;
        System.out.println("parabens " + nome + "! voce subiu para o nivel " + nivel );
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public String mostrarInformacoes() {
        return "jogador: " + nome + " pontuação: " + pontuacao + "  nivel: " + nivel;
    }
}
