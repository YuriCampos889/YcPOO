package br.com.trabalho_individual.entidade;

public class Serie {
    private int id;
    private String nome;
    private String ano;
    private int episodios;
    private int fkPessoa;//FK p o ator/atriz principal das respectivas series

    public Serie(int id, String nome, String ano, int episodios, int fkPessoa) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.episodios = episodios;
        this.fkPessoa = fkPessoa;
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

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getFkPessoa() {
        return fkPessoa;
    }

    public void setFkPessoa(int fkPessoa) {
        this.fkPessoa = fkPessoa;
    }

    @Override
    public String toString() {
        return "▐█████████████████████████████████████████████████ \n\tID:" + id + "\tNOME: " + nome + "\n\tANO: " + ano + "\tNÚMERO DE EPISÓDIOS: " + episodios + "\n\tATOR PRINCIPAL: " + fkPessoa + "\n▐█████████████████████████████████████████████████\n";
    }
}
