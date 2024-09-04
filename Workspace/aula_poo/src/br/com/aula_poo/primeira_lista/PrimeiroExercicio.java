package br.com.aula_poo.primeira_lista;

import java.util.Scanner;
//ex1 - poseidon

public class PrimeiroExercicio {

	public static void main(String[] args) {
		
		//instância
		Scanner sc = new Scanner(System.in);
		
		//cadeia nome
		String nome;
		
		//cadeia sobrenome
		String sobrenome;
		
		//escreva("Digite seu nome: ")
		System.out.print("Digite seu nome: ");
		
		//leia(nome)
		nome = sc.nextLine();
		
		//escreva (digite seu sobrenome)
		System.out.print("Digite seu sobrenome: ");
		
		//leia(sobrenome)
		sobrenome = sc.nextLine();
		
		//leia(nome) |Para nome composto colocar nextLine, caso coloque next, vai ler somente a primeira palavra
		System.out.printf("\nOla " + nome + " " + sobrenome + " Seja bem-vindo(a) ao universo de POO! ");
		
		
		//fechar o scanner
		sc.close();
		//ctrl + s para salvar

	}

}
