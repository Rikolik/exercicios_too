package Aula11.Ex2;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this.setNome(nome);
        this.setCargaHoraria(cargaHoraria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
