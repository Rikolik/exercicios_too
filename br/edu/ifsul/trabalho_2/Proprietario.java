package br.edu.ifsul.trabalho_2;

import java.io.Serializable;

public class Proprietario implements Serializable {
    private Integer codigo;
    private String nome;
    private String cpf;

    public Proprietario() {

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

    //cpf
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
