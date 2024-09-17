package br.com.trabalho_individual.io;

import br.com.trabalho_individual.utils.Util;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class Relatorio {
    private static final Logger log = Util.setupLogger(); 

    public static void gerarRelatorioTela(String conteudo) {
        log.info(conteudo);
    }

    public static void gerarRelatorioImpresso(String caminhoArquivo, String conteudo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            writer.write(conteudo);
            log.info("RELATÓRIO IMPRESSO GERADO:\n " + caminhoArquivo + "\n");
        } catch (IOException e) {
            log.severe("Erro ao escrever o relatório impresso: " + e.getMessage());
        }
    }
}
