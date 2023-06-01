package jogo.src.jogo;

public class Missao {
    private String titulo;
    private String text;
    private int recomAceitar;
    private int recomCompletar;
    private int alterarJoia;

    public Missao(String titulo, String text, int recomAceitar, int recomCompletar, int alterarJoia) {
        this.text = text;
        this.titulo = titulo;
        this.recomAceitar = recomAceitar;
        this.recomCompletar = recomCompletar;
        this.alterarJoia = alterarJoia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRecomAceitar() {
        return recomAceitar;
    }

    public void setRecomAceitar(int recomAceitar) {
        this.recomAceitar = recomAceitar;
    }

    public int getRecomCompletar() {
        return recomCompletar;
    }

    public void setRecomCompletar(int recomCompletar) {
        this.recomCompletar = recomCompletar;
    }

    public int getAlterarJoia() {
        return alterarJoia;
    }

    public void setAlterarJoia(int alterarJoia) {
        this.alterarJoia = alterarJoia;
    }

}
