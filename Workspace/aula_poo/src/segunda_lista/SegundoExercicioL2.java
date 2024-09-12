package segunda_lista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.logging.Logger;

public class SegundoExercicioL2 {
    private static final Logger log = Logger.getLogger(SegundoExercicioL2.class.getName());

    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            log.info("Digite o ano do seu nascimento e use 4 dígitos por favorzinho: ");
            int ano = Integer.parseInt(read.readLine());
            log.info("Agora coloca aí o mês do seu nascimento com dois dígitos (por favorzinho tbm): ");
            int mes = Integer.parseInt(read.readLine());
            log.info("Agora eu vou pedir que você coloque o dia que você nasceu com dois dígitos e por favorzinho tbm: ");
            int dia = Integer.parseInt(read.readLine());

            LocalDate dataNasc = LocalDate.of(ano, mes, dia);
            LocalDate dataAtual = LocalDate.now();
            Period periodo = Period.between(dataNasc, dataAtual);

            int idade = periodo.getYears();
            log.info("OMGGGGGGG!! você tem " + idade + " aninhos!");

        }
        catch (IOException | NumberFormatException e) {
            log.severe("erro ao ler " + e.getMessage());
        }
    }
}
