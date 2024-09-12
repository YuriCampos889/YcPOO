package segunda_lista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Logger;

public class QuintoExercicioL2 {
    private static final Logger log = Logger.getLogger(QuintoExercicioL2.class.getName());
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            log.info("que horas são? ");
            double hrs = Double.parseDouble(read.readLine());
            double seg = hrs * 3600;

            log.info("CONVERSÃO:");
            log.info("HORAS: " + hrs);
            log.info("SEGUNDOS EM UMA HORA: 3600");
            log.info("CONVERSÃO DE HORAS PARA SEGUNDOS: " + hrs + " * 3600");
            log.info("RESULTADO = " + seg + " segundos");

        } catch (IOException | NumberFormatException e) {
            log.severe("erro ao ler " + e.getMessage());
        }
    }
}
