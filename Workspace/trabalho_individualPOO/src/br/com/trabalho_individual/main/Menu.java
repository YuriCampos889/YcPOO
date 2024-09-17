package br.com.trabalho_individual.main;

import br.com.trabalho_individual.entidade.Pessoa;
import br.com.trabalho_individual.entidade.Serie;
import br.com.trabalho_individual.io.Leitor;
import br.com.trabalho_individual.io.Relatorio;
import br.com.trabalho_individual.utils.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Menu {
    private static final Logger log = Util.setupLogger(); //log do util
    private static final Scanner sc = new Scanner(System.in);
    //list p pessoa e serie
    private List<Pessoa> pessoas = new ArrayList<>();
    private List<Serie> series = new ArrayList<>();

    public void exibirMenu() {
        //TXT
        String caminhoArquivo = "temp/dados.txt";
        carregarDados(caminhoArquivo);

        while (true) {
            log.info("▐███████████████████████████████████████████\n▐\t     MENU PRINCIPAL\t\t   ▐\n▐███████████████████████████████████████████\n");
            log.info("▐█▐▐ 1\t   Relatório na tela\t\t▐▐▐█\n▐█▐▐█████████████████████████████████████▐▐█\n");
            log.info("▐█▐▐ 2\t   Relatório impresso\t\t▐▐▐█\n▐█▐▐█████████████████████████████████████▐▐█\n");
            log.info("▐█▐▐ 3\t   Sair\t\t\t\t▐▐▐█\n▐███████████████████████████████████████████\n");
            
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    exibirMenuRelatorioTela();
                    break;
                case 2:
                    exibirMenuRelatorioImpressao();
                    break;
                case 3:
                    log.info("Até mais!");
                    System.exit(0);
                    break;
                default:
                    log.warning("Opção inválida!");
                    break;
            }
        }
    }

    private void exibirMenuRelatorioTela() {
        log.info("\n▐███████████████████████████████████████████\n▐\tRELATÓRIO NA TELA:\t\t   ▐\n▐███████████████████████████████████████████");
        log.info("\n▐█▐▐1. Relatório - Pessoa(ATOR/ATRIZ)\t▐▐▐█\n▐█▐▐█████████████████████████████████████▐▐█");
        log.info("\n▐█▐▐2. Relatório - Série\t\t▐▐▐█\n▐█▐▐█████████████████████████████████████▐▐█");
        log.info("\n▐█▐▐3. Voltar para o Menu Principal\t▐▐▐█\n▐███████████████████████████████████████████");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                //pessoa
                String conteudoRelatorioPessoa = gerarRelatorioPessoa();
                Relatorio.gerarRelatorioTela(conteudoRelatorioPessoa);
                break;
            case 2:
                //serie
                String conteudoRelatorioSerie = gerarRelatorioSerie();
                Relatorio.gerarRelatorioTela(conteudoRelatorioSerie);
                break;
            case 3:
                return;
            default:
                log.warning("Opção inválida!");
                break;
        }
        
        log.info("\nPRESSIONE QUALQUER TECLA PARA VOLTAR AO MENU PRINCIPAL: ");
        sc.next();
    }

    private void exibirMenuRelatorioImpressao() {
        log.info("\n▐███████████████████████████████████████████\n▐\tRELATÓRIO IMPRESSO:\t\t   ▐\n▐███████████████████████████████████████████");
        log.info("\n▐█▐▐1. Relatório Impresso - Pessoa\t▐▐▐█\n▐█▐▐█████████████████████████████████████▐▐█");
        log.info("\n▐█▐▐2. Relatório Impresso - Série\t▐▐▐█\n▐█▐▐█████████████████████████████████████▐▐█");
        log.info("\n▐█▐▐3. Voltar para o Menu Principal\t▐▐▐█\n▐███████████████████████████████████████████");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                //pessoa impressa
                String conteudoRelatorioPessoaImpresso = gerarRelatorioPessoa();
                Relatorio.gerarRelatorioImpresso("temp/relatorio1_pessoa.txt", conteudoRelatorioPessoaImpresso);
                break;
            case 2:
                //serie impressa
                String conteudoRelatorioSerieImpresso = gerarRelatorioSerie();
                Relatorio.gerarRelatorioImpresso("temp/relatorio2_serie.txt", conteudoRelatorioSerieImpresso);
                break;
            case 3:
                return;
            default:
                log.warning("Opcão inválida!");
                break;
        }
        log.info("\nPRESSIONE QUALQUER TECLA PARA VOLTAR AO MENU PRINCIPAL: ");
        sc.next();
    }

    private void carregarDados(String caminhoArquivo) {
        pessoas.clear();
        series.clear();
        Leitor.lerDados(caminhoArquivo, pessoas, series);
    }

    private String gerarRelatorioPessoa() {
        String resultado = "Relatório de Pessoas:\n";
        for (Pessoa pessoa : pessoas) {
            resultado += pessoa.toString() + "\n";
        }
        return resultado;
    }

    private String gerarRelatorioSerie() {
        String resultado = "Relatório de Séries:\n";
        for (Serie serie : series) {
            resultado += serie.toString() + "\n";
        }
        return resultado;
    }
}
