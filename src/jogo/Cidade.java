package src.jogo;

public class Cidade {
    private String nome;
    private Missao missao;
    private int qntPoder;
    private int id;

    public Cidade() {
        
    }

    public Cidade(String nome, Missao missao, int qntPoder, int id) {
        this.missao = missao;
        this.nome = nome;
        this.qntPoder = qntPoder;
        this.id = id;
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

    public int getQntPoder() {
        return qntPoder;
    }

    public void setQntPoder(int qntPoder) {
        this.qntPoder = qntPoder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}