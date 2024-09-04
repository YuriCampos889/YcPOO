package segunda_lista;
//tentei usar java util date mas acho que esse deixa mais simples
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class SegundoExercicioL2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano do seu nascimento e use 4 digitos por favorzinho: ");
		int ano = sc.nextInt();
		System.out.print("Agora coloca aí o mês do seu nascimento com dois digitos (por favorzinho tbm): ");
		int mes = sc.nextInt();
		System.out.print("Agora eu vou pedir que vc coloque o dia que vc nasceu com dois digitos e por favorzinho tbm: ");
		int dia = sc.nextInt();	
		
        LocalDate dataNasc = LocalDate.of(ano, mes, dia);        
        LocalDate dataAtual = LocalDate.now(); 
        Period periodo = Period.between(dataNasc, dataAtual);
        
        int idade = periodo.getYears();
		System.out.print("OMGGGGGGG vc tem " + idade + " aninhos");
		sc.close();
		
	}
//VOLTAR AQUI PARA ADICIONAR O TRATAMENTO DE ERRO
}
