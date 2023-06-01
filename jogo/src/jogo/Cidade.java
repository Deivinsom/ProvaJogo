package jogo.src.jogo;

public class Cidade {
    private String nome;
    private Missao missao;
    private int alterarJoia;

    public Cidade(String nome, Missao missao, int alterarJoia) {
        this.missao = missao;
        this.nome = nome;
        this.alterarJoia = alterarJoia;
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

    public int getAlterarJoia() {
        return alterarJoia;
    }

    public void setAlterarJoia(int alterarJoia) {
        this.alterarJoia = alterarJoia;
    }

}
