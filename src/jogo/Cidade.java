package src.jogo;

public class Cidade {
    private String nome;
    private Missao missao;
    private int alterarJoia;
    private int valorRota;

    public Cidade(String nome, Missao missao, int alterarJoia, int valorRota) {
        this.missao = missao;
        this.nome = nome;
        this.alterarJoia = alterarJoia;
        this.valorRota = valorRota;
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

    public int getValorRota() {
        return valorRota;
    }

    public void setValorRota(int valorRota) {
        this.valorRota = valorRota;
    }

}