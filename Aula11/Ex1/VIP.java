package Aula11.Ex1;

public class VIP extends Ingresso {
    private double adicionalVip;

    public VIP(double valor, double adicionalVip){
        super(valor);
        this.setAdicionalVip(adicionalVip);
    }

    public void imprimeDados() {
        this.imprimeValor(this.adicionalVip);
    }

    public void setAdicionalVip(double valor) {
        this.adicionalVip = valor;
    }

    public double getAdicionalVip() {
        return this.adicionalVip;
    }
}
