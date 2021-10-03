package br.edu.ifsul.trabalho_2;

import javax.swing.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;

public class Obra implements Serializable {
    private Integer codigo;
    private String nome;
    private String descricao;
    private GregorianCalendar dataEntrega;
    private double orcamento;
    private double custoTotal;
    private List<Terreno> terrenos;
    private Empreiteira empreiteira;

    public Obra() {

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

    //descricao
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //dataEntrega
    public GregorianCalendar getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(GregorianCalendar dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    //orcamento
    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    //custoTotal
    public double getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(double custoTotal) {
        this.custoTotal = custoTotal;
    }

    //terrenos
    public List<Terreno> getTerrenos() {
        return terrenos;
    }

    public void setTerrenos(List<Terreno> terrenos) {
        this.terrenos = terrenos;
    }

    //empreiteira
    public Empreiteira getEmpreiteira() {
        return empreiteira;
    }

    public void setEmpreiteira(Empreiteira empreiteira) {
        this.empreiteira = empreiteira;
    }

    //****************FUNÇÕES****************//

    void exibirDados() {
        StringBuilder mensagem = new StringBuilder();
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");

        mensagem.append("Código: ").append(this.getCodigo()).append("\n");
        mensagem.append("Nome: ").append(this.getNome()).append("\n");
        mensagem.append("Descricao: ").append(this.getDescricao()).append("\n");
        mensagem.append("Data Entrega: ").append(formatadorData.format(this.getDataEntrega().getTime())).append("\n");
        mensagem.append("Orçamento: ").append(this.getOrcamento()).append("\n");
        mensagem.append("Custo Total: ").append(this.getCustoTotal()).append("\n");
        mensagem.append("Metragem Total: ").append(this.calcularMetragemTotal()).append("\n");

        mensagem.append("|========|Terrenos|========|").append("\n");

        for (Terreno terreno:this.getTerrenos())
        {
            mensagem.append("/** ").append(terreno.getCodigo()).append(" **/").append("\n");
            mensagem.append("Comprimento: ").append(terreno.getComprimento()).append("\n");
            mensagem.append("Largura: ").append(terreno.getLargura()).append("\n");
            mensagem.append("m² ").append(terreno.getMetrosQuadrados()).append("\n");
            mensagem.append("/***Proprietário***/").append("\n");
            mensagem.append(terreno.getProprietario().getCodigo()).append(" / ").append(terreno.getProprietario().getNome()).append("\n");
            mensagem.append("CPF: ").append(terreno.getProprietario().getCpf()).append("\n");
            mensagem.append("/******************/").append("\n");
        }

        mensagem.append("|==========================|").append("\n");
        mensagem.append("Empreiteira: ").append(this.getEmpreiteira().getCodigo()).append(" / ").append(this.getEmpreiteira().getNome()).append("\n");

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }

    double calcularMetragemTotal() {
        double metragemTotal = 0;

        for (Terreno terreno : this.getTerrenos()) {
            metragemTotal += terreno.getMetrosQuadrados();
        }

        return metragemTotal;
    }
}