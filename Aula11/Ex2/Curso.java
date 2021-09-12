package Aula11.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    List<Disciplina> disciplinaList = new ArrayList<>();
    private String nomeCurso;

    public Curso(String nomeCurso) {
        this.setNomeCurso(nomeCurso);
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void adicionaNovaDisciplina(Disciplina novaDisciplina) {
        this.disciplinaList.add(novaDisciplina);
    }

    public void imprimeDados() {
        int cargaHoraria = 0;

        System.out.println("Nome: " + nomeCurso);

        for (Disciplina disciplina : this.disciplinaList) {
            cargaHoraria += disciplina.getCargaHoraria();
            System.out.println("-----" + disciplina.getNome() + "-----");
            System.out.println("Carga horária: " + disciplina.getCargaHoraria());
        }

        System.out.println("----------------------------------");
        System.out.println("Carga horária total: " + cargaHoraria);
    }
}