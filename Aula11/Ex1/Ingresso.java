package Aula11.Ex1;

public class Ingresso {
    private double valor;

    protected Ingresso(double valor) {
        this.setValor(valor);
    }

    protected void imprimeValor(double adicional) {
        System.out.println("Valor: " + (valor + adicional));
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }
}
