package segunda_lista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Logger;

public class TerceiroExercicioL2 {
    private static final Logger log = Logger.getLogger(TerceiroExercicioL2.class.getName());
    public static void main(String[] args) {
        String[] produtos = {"Folha A4", "Canetas Nanquim[12 pontas]", "Lápis Para Desenho Profissional", "cx. Lápis de cor[72 Cores]"};
        int[] quantidades = {50000, 400, 500, 0};
        boolean continuar = true;
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            while (continuar) {
                log.info("OIII! BEM VINDO(A) A PAPELARIA DO DESENHISTA\n");
                log.info("1. Materiais\n");
                log.info("2. Produtos fora do estoque\n");
                log.info("3. Sair\n");
                log.info("\nEscolha uma opção: ");

                int opcao = Integer.parseInt(read.readLine().trim());

                switch (opcao) {
                    case 1:
                        listarProdutosEmEstoque(produtos, quantidades);
                        break;
                    case 2:
                        listarProdutosSemEstoque(produtos, quantidades);
                        break;
                    case 3:
                        log.info("\nvolte sempre!(de preferência com o desenho pronto)");
                        continuar = false;
                        break;
                    default:
                        log.warning("opcão invalida. Tente novamente.");
                }

                if (opcao == 1 || opcao == 2) {
                    boolean respostaValida = false;
                    while (!respostaValida) {
                        log.info("você deseja voltar ao menu? (sim/não): ");
                        String resposta = read.readLine().trim().toLowerCase();
                        if (resposta.equals("sim")) {
                            respostaValida = true;
                        } else if (resposta.equals("não")) {
                            continuar = false;
                            respostaValida = true;
                        } else {
                            log.warning("responda com 'sim' ou 'não'.");
                        }
                    }
                }
            }
        }
        catch (IOException | NumberFormatException e) {
            log.severe("erro ao ler " + e.getMessage());
        }
    }
    private static void listarProdutosEmEstoque(String[] produtos, int[] quantidades) {
        log.info("produtos no estoque");
        for (int i = 0; i < produtos.length; i++) {
            if (quantidades[i] > 0) { // Verifica se a quantidade é maior que 0
                log.info("- " + produtos[i] + " (Qtd: " + quantidades[i] + ")");
            }
        }
    }
    private static void listarProdutosSemEstoque(String[] produtos, int[] quantidades) {
        log.info("produtos fora do estoque");
        for (int i = 0; i < produtos.length; i++) {
            if (quantidades[i] == 0) {
                log.info("- " + produtos[i]);
            }
        }
    }
}
