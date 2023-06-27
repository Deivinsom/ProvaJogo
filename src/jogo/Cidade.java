package src.jogo;

public class Cidade {
    private String nome;
    private Missao missao;
    private int alterarJoia;
    private int id;

    public Cidade() {
        
    }

    public Cidade(String nome, Missao missao, int alterarJoia, int id) {
        this.missao = missao;
        this.nome = nome;
        this.alterarJoia = alterarJoia;
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

    public int getAlterarJoia() {
        return alterarJoia;
    }

    public void setAlterarJoia(int alterarJoia) {
        this.alterarJoia = alterarJoia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}