package segunda_lista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Logger;

public class PrimeiroExercicioL2 {
    private static final Logger log = Logger.getLogger(PrimeiroExercicioL2.class.getName());

    public static void main(String[] args) {
        final int universo = 42;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int numero = -1;

        try {
            do {
                log.info("oiiiii vc sabe qual é o número do universo? ");
                numero = Integer.parseInt(read.readLine());

                if (numero != universo) {
                    log.info("ta errado hehehe tenta de novo >;D");
                }

            } while (numero != universo);

            //ESSE LOG INFO ACABOU COM MEU LIMPA IMPROVISADO KKKK MAS EU VOU MANTER AQUI
            //for (int i = 0; i < 50; i++) {
                //log.info(" ");

            log.info("                                               \n" +
            		"                                                \n" +
            		"                                                \n" +
            		"                                                \n" +
                    "    ownnnn vc acertou! olha oq eu fiz pra vc ;D\n" +
                    "╔═════════════════════════════════════════════════╗\n" +
                    "║=================================================║\n" +
                    "║=================================================║\n" +
                    "║|  * .    .    *   *       .          .   *    .|║\n" +
                    "║|*  |████| .      |████|    |███████████████| * |║\n" +
                    "║|   |████|   *    |████|    |███████████████|   |║\n" +
                    "║|   |████| *      |████| *        .    |████|   |║\n" +
                    "║| . |████|  . *   |████|     .         |████|   |║\n" +
                    "║|   |████|________|████|  *      *  .  |████|   |║\n" +
                    "║|*  |██████████████████|     __________|████|   |║\n" +
                    "║|   |██████████████████|.   |███████████████|   |║\n" +
                    "║| *               |████|    |███████████████|   |║\n" +
                    "║|      .  *       |████| .  |████| *            |║\n" +
                    "║|.             .  |████|  * |████|     .   *    |║\n" +
                    "║|     *   .       |████|    |████|  . *         |║\n" +
                    "║|       *     *   |████|*   |████|__________ *  |║\n" +
                    "║| *      .        |████|  * |███████████████|   |║\n" +
                    "║|    *   *    *   |████| .  |███████████████|   |║\n" +
                    "║=================================================║\n" +
                    "║=================================================║\n" +
                    "╚═════════════════════════════════════════════════╝"
                );
        } //PIPE!
        catch (IOException | NumberFormatException e) {
            log.severe("erro ao ler " + e.getMessage());
        }
        
    }
}
