package br.com.aula_poo.primeira_lista;

import java.util.Scanner;

public class TerceiroExercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("insira o primeiro numero: ");
		int num1 = sc.nextInt();
		System.out.print("insira o segundo numero: ");
		int num2 = sc.nextInt();
		int soma = num1 + num2;
		int subtracao = num1 - num2;
		int multiplicacao = num1 * num2;
		int divisao = num1 / num2;//preciso voltar aqui depois pra testar o double e if else
	
	System.out.println("Soma= " + soma);
	System.out.println("Subtracao= " + subtracao);
	System.out.println("Multiplicacao= " + multiplicacao);
	System.out.println("Divisão= " + divisao);
	
	sc.close();
	}
	
}
