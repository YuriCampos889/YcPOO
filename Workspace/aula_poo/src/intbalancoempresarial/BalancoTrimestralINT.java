package intbalancoempresarial;

public class BalancoTrimestralINT {
	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastoTrimestral = (gastosJaneiro + gastosFevereiro + gastosMarco);
		System.out.print("O GASTO FOI DE " + gastoTrimestral + " R$");
	}
}
