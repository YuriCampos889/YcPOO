package br.com.aula_poo.primeira_lista;
import java.util.logging.Logger;

public class QuintoExercicio {
    private static final Logger log = Logger.getLogger(QuintoExercicio.class.getName());

    public static void main(String[] args) {
        int A = 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66;
        int B = 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;

        log.info("A = : " + A);
        log.info("B = " + B);
    }
}
