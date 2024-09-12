package br.com.aula_poo.primeira_lista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Logger;

public class TerceiroExercicio {
    private static final Logger log = Logger.getLogger(TerceiroExercicio.class.getName());
    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try {//se aqui der erro no que ta aqui dentro vai imprimir a msg de erro do IOexception - LEMBRA DISSO YURI
            log.info("num1: ");
            int num1 = Integer.parseInt(read.readLine());
            log.info("num2: ");
            int num2 = Integer.parseInt(read.readLine());

            int soma = num1 + num2;
            int subtracao = num1 - num2;
            int multiplicacao = num1 * num2;
            double divisao = 0.0;

            if (num2 != 0) {
                divisao = (double) num1 / num2;
                log.info("divisão = " + divisao);
            } else {
                log.warning("sem divisão por zero aqui >;0");
            }
            log.info("soma = " + soma);
            log.info("subtração = " + subtracao);
            log.info("multiplicação = " + multiplicacao);

        } catch (IOException e) {
            log.severe("erro na leitura do try" + e.getMessage());
        } catch (NumberFormatException e) {
            log.severe("numero invalido");
        }
    }
}
