package br.edu.ifsul.trabalho_2;

import java.io.Serializable;

public class Empreiteira implements Serializable {
    private Integer codigo;
    private String nome;

    public Empreiteira() {

    }

    //codigo
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    //nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}