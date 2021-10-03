package br.edu.ifsul.trabalho_2;

import java.io.Serializable;

public class Terreno implements Serializable {
    private Integer codigo;
    private double metrosQuadrados;
    private double largura;
    private double comprimento;
    private Proprietario proprietario;

    public Terreno() {

    }

    //codigo
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    //metrosQuadrados
    public double getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public void setMetrosQuadrados(double metrosQuadrados) {
        this.metrosQuadrados = metrosQuadrados;
    }

    //largura
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    //comprimento
    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    //proprietario
    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
}
