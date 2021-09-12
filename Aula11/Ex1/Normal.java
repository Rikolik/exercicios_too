package Aula11.Ex1;

public class Normal extends Ingresso {
    private String identificacaoCadeira;

    public Normal(double valor, String cadeira) {
        super(valor);
        this.identificacaoCadeira = cadeira;
    }

    public void imprimeDados() {
        this.imprimeValor(0);
        System.out.println("Cadeira: " + this.identificacaoCadeira);
    }

    public void setIdentificacaoCadeira(String valor) {
        this.identificacaoCadeira = valor;
    }

    public String getIdentificacaoCadeira() {
        return this.identificacaoCadeira;
    }
}