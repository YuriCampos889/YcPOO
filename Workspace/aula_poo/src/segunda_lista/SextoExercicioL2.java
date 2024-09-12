package segunda_lista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class SextoExercicioL2 {
    private static final Logger log = Logger.getLogger(SextoExercicioL2.class.getName());
    public static void main(String[] args) {
    	
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            log.info("digite um valor maior que 100: ");
            int inicio = Integer.parseInt(reader.readLine());
            log.info("digite um valor maior que o inicial para fechar o intervalo:  ");
            int fim = Integer.parseInt(reader.readLine());

            if (inicio <= 100 || fim <= inicio) {
                log.warning("VALOR INVALIDO");
            } else {
                ArrayList<Integer> multiplosDe6 = new ArrayList<>();

                for (int i = inicio; i <= fim; i++) {
                    if (i % 6 == 0) {
                        multiplosDe6.add(i);
                    }
                }
                if (multiplosDe6.size() < 6) {
                    log.warning("não existe multiplos de 6 o suficiente");
                } else {
                    int soma = 0;
                    log.info("MÚLTIPLOS:");
                    StringBuilder multiplos = new StringBuilder();
                    
                    for (int i = 0; i < multiplosDe6.size(); i++) {
                        multiplos.append(multiplosDe6.get(i)).append(" ");
                        if (i < 3 || i >= multiplosDe6.size() - 3) {
                            soma += multiplosDe6.get(i);
                        }
                    }
                    log.info(multiplos.toString());
                    log.info("a soma dos 3 primeiros e dos 3 ultimos = " + soma);
                }
            }

        }
        catch (IOException | NumberFormatException e) {
            log.severe("erro de leitura: " + e.getMessage());
        }
    }
}
