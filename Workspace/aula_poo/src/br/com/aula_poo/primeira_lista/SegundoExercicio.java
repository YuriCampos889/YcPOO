package br.com.aula_poo.primeira_lista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Logger;

public class SegundoExercicio {
    private static final Logger log = Logger.getLogger(SegundoExercicio.class.getName());
    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int somaIdades = 0;
        int numeroPessoas = 5;

        try {
            for (int i = 1; i <= numeroPessoas; i++) {
                log.info("Bota aqui a idade do amiguinho " + i + ": ");
                int idade = Integer.parseInt(read.readLine());
                somaIdades += idade;
            }
            log.info("Agora bota aqui a sua idade: ");
            int suaIdade = Integer.parseInt(read.readLine());
            somaIdades += suaIdade;
            log.info("A soma da sua idade com a dos amiguinhos é: " + somaIdades);
        }
        catch (IOException e) {
            log.severe("????" + e.getMessage());
        }
        catch (NumberFormatException e) {
            log.severe("idade invalida");
        }
    }
}
