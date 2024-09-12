package br.com.aula_poo.primeira_lista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Logger;

public class PrimeiroExercicio {
	//instância p metodo main(?)
    private static final Logger log = Logger.getLogger(PrimeiroExercicio.class.getName());
    public static void main(String[] args) {
    	
        //bufferedreader p capturar a entrada do usuário
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try {
            //log p nome
            log.info("Digite seu nome: ");
            String nome = read.readLine();

            //log p sobrenome
            log.info("Digite seu sobrenome: ");
            String sobrenome = read.readLine();

            //log de msg
            log.info("Olá " + nome + " " + sobrenome + " Seja bem-vindo(a) ao universo de POO!");
            
            //adicionar outro catch caso insira outros caracteres alem de nome(?)
        } catch (IOException e) {
            log.severe("Erro ao ler a entrada do usuário: " + e.getMessage());//getMessage vai descrever o que causou o erro
        }
    }
}
