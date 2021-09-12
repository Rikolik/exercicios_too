package Aula11.Ex3;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private Cidade cidade;
    private Profissao profissao;

    public Pessoa(String nome, String cpf, String telefone, Cidade cidade, Profissao profissao) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
        this.setCidade(cidade);
        this.setProfissao(profissao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public void mostrarDadosCidade() {
        System.out.println("Nome: " + this.cidade.getNome());
        System.out.println("UF: " + this.cidade.getUf());
    }

    public void mostrarDadosProfissao() {
        System.out.println("Descrição: " + this.profissao.getDescricao());
        System.out.println("Piso: R$" + this.profissao.getSalarioPiso());
    }

    public void imprimeDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("-----Cidade-----");
        this.mostrarDadosCidade();
        System.out.println("-----Profissão-----");
        this.mostrarDadosProfissao();
    }
}