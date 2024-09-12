package segunda_lista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Logger;

public class SetimoExercicioL2{
    private static final Logger log = Logger.getLogger(SetimoExercicioL2.class.getName());
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            log.info("Quantos estudantes têm na turma? ");
            int quantidadeEstudantes = Integer.parseInt(reader.readLine());
            double percentualDisciplina1 = 35.0 / 100;
            double percentualDisciplina2 = 30.0 / 100;
            double mediaPercentual = (percentualDisciplina1 + percentualDisciplina2) / 2;
            double mediaEstudantesMadrugada = quantidadeEstudantes * mediaPercentual;

            log.info("Em média, " + (int) mediaEstudantesMadrugada + " estudantes estudam de madrugada nas duas primeiras disciplinas.");   
        } 
        
        catch (IOException | NumberFormatException e) {
            log.severe("erro ao ler " + e.getMessage());
        }
    }
}
