package br.com.aula_poo.primeira_lista;

import java.util.Scanner;

public class QuartoExercicio {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Insira aqui a temperatura em C°: ");
			double celsius = sc.nextDouble();
			double fahreinheit = celsius * 1.8 + 32;
			
			System.out.println("Temperatura em C°:" +celsius);
			System.out.print("Temperatura em F°:" + fahreinheit);
			
			sc.close();
		}
}
