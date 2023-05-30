package src.jogo;

public class Cidade {
    private String nome;
    private Missao missao;
    private Cidade next;

    public Cidade(String nome, Missao missao) {
        this.missao = missao;
        this.nome = nome;
        this.next = null;
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

    public Cidade getNext() {
        return next;
    }

    public void setNext(Cidade next) {
        this.next = next;
    }

}
