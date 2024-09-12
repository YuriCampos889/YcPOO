package br.com.aula_poo.primeira_lista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Logger;

public class QuartoExercicio {
    private static final Logger log = Logger.getLogger(QuartoExercicio.class.getName());
    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        try {
            log.info("qual a temperatura em C°?: ");
            String input = read.readLine();
            double celsius = Double.parseDouble(input);
            double fahrenheit = celsius * 1.8 + 32;
            log.info("C°: " + celsius);
            log.info("F°: " + fahrenheit);

        } catch (IOException e) {
            log.severe("erro na leitura try" + e.getMessage());
        } catch (NumberFormatException e) {
            log.severe("valor ou caractere invalido");
        }
    }
}
