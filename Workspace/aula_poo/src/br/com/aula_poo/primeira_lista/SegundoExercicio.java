package br.com.aula_poo.primeira_lista;
import java.util.Scanner;
//tudo está dentro de uma classe Yuri!!!
public class SegundoExercicio {
	public static void main(String[] args) {
		//declare as variaveis Yuri!!!
		Scanner sc = new Scanner(System.in);//INSTANCIA YURI, LEMBRA DISSO ~.~
		int somaidd = 0;
		int numpessoas = 5;
		
		//um lacinho pra simplificar
		for (int i = 1 ; i <=numpessoas; i++) {
			System.out.print("Qual a idade do colega " + i + "?: ");
			int idade = sc.nextInt();
			somaidd += idade;
			
		}
		System.out.print("Qual é a minha idade?: ");
        int suaIdade = sc.nextInt();
        somaidd += suaIdade;
		
		System.out.print("O tempo de vida dos meus colegas é de " + somaidd);
		sc.close();
	}

}
