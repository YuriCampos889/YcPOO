package br.com.trabalho_individual.entidade;

public class Pessoa {
    private int id;
    private String nome;
    private String nacionalidade;
    private int idade;

    //construtor
    public Pessoa(int id, String nome, String nacionalidade, int idade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    //get set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return String.format("▐████████████████████████████████████████ \n\tID: " + id + "\tNOME: " + nome + "\t\t\n\tNACIONALIDADE: " + nacionalidade + "\t\n\tIDADE: " + idade + "\t\t\t\t\n▐████████████████████████████████████████\n ");
    }
}
