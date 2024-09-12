package segunda_lista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Logger;

public class QuartoExercicioL2 {
    private static final Logger log = Logger.getLogger(QuartoExercicioL2.class.getName());
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            log.info("valor do primeiro ângulo = ");
            int angulo1 = Integer.parseInt(read.readLine());
            log.info("valor do segundo ângulo = ");
            int angulo2 = Integer.parseInt(read.readLine());
            log.info("valor do terceiro ângulo = ");
            int angulo3 = Integer.parseInt(read.readLine());

            if (angulo1 + angulo2 + angulo3 != 180) {
                log.warning("Os ângulos não formam um triângulo válido");
            } else {
                String classificacao = classificarTriangulo(angulo1, angulo2, angulo3);

                log.info("ângulos do triângulo: " + angulo1 + ", " + angulo2 + ", " + angulo3);
                log.info("classificação do triângulo: " + classificacao);
            }
        }
        catch (IOException | NumberFormatException e) {
            log.severe("erro ao ler " + e.getMessage());
        }
    }
//achei um pouco dificil pelo fato de nao me lembrar sobre triangulos kkkk
    private static String classificarTriangulo(int angulo1, int angulo2, int angulo3) {
        if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
        	//> 90°(
            return "Acutângulo";
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
        	//< 90°
            return "Obtusângulo";
        } else {
        	//= 90º
            return "Retângulo";
        }
    }
}
