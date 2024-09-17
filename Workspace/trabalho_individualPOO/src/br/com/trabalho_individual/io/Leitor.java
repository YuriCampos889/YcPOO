package br.com.trabalho_individual.io;

import br.com.trabalho_individual.entidade.Pessoa;
import br.com.trabalho_individual.entidade.Serie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class Leitor {
    private static final Logger log = Logger.getLogger(Leitor.class.getName());

    //metodo
    public static void lerDados(String caminhoArquivo, List<Pessoa> pessoas, List<Serie> series) {
        try (BufferedReader buffRead = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = buffRead.readLine()) != null) {
                String[] dados = linha.split(";");
                //Pessoa(int id, String nome, String nacionalidade, int idade)
                if (dados[0].equalsIgnoreCase("Pessoa")) {
                    Pessoa pessoa = new Pessoa(Integer.parseInt(dados[1]), dados[2], dados[3], Integer.parseInt(dados[4])
                    );
                    pessoas.add(pessoa);
                } 
                //Serie(id, String nome, String ano, int episodios,fkPessoa)
                else if (dados[0].equalsIgnoreCase("Serie")) {
                    Serie serie = new Serie(
                        Integer.parseInt(dados[1]), dados[2], dados[3], Integer.parseInt(dados[4]), Integer.parseInt(dados[5])//fkPessoa
                    );
                    series.add(serie);
                }
            }
        } catch (IOException e) {
            log.severe("ERRO DE LEITURA " + e.getMessage());
        }
    }
}
