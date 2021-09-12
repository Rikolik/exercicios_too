package Aula11.Ex2;

public class Main {
    public static void main(String[] args) {
        Curso letrasEspanhol = new Curso("Letras Espanhol");
        Disciplina linguistica_1 = new Disciplina("Linguística 1", 80);
        Disciplina drama = new Disciplina("Drama", 40);
        Disciplina sintaxe_1 = new Disciplina("Síntaxe 1", 80);
        Disciplina espanhol_1 = new Disciplina("Espanhol 1", 80);
        Disciplina sociolinguistica = new Disciplina("Sociolínguística", 80);

        letrasEspanhol.adicionaNovaDisciplina(linguistica_1);
        letrasEspanhol.adicionaNovaDisciplina(drama);
        letrasEspanhol.adicionaNovaDisciplina(sintaxe_1);
        letrasEspanhol.adicionaNovaDisciplina(espanhol_1);
        letrasEspanhol.adicionaNovaDisciplina(sociolinguistica);

        letrasEspanhol.imprimeDados();
    }
}