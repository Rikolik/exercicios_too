package Aula11.Ex3;

public class Profissao {
    private String descricao;
    private double salarioPiso;

    public Profissao (String descricao, double salarioPiso) {
        this.setDescricao(descricao);
        this.setSalarioPiso(salarioPiso);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSalarioPiso() {
        return salarioPiso;
    }

    public void setSalarioPiso(double salarioPiso) {
        this.salarioPiso = salarioPiso;
    }
}