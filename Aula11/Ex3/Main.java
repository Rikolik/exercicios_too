package Aula11.Ex3;

public class Main {
    public static void main(String[] args) {
        Cidade cidadePessoa = new Cidade("Passo Fundo", "RS");
        Profissao profissaoPessoa = new Profissao("Programador 1", 1500);
        Pessoa pessoa = new Pessoa("Henrique Lopes", "012.345.678-90", "998877665", cidadePessoa, profissaoPessoa);
        pessoa.imprimeDados();
    }
}
