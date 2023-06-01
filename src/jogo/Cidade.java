package src.jogo;

public class Cidade {
    private String nome;
    private Missao missao;

    public Cidade(String nome, Missao missao) {
        this.missao = missao;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Missao getMissao() {
        return missao;
    }

    public void setMissao(Missao missao) {
        this.missao = missao;
    }

}
