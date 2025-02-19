package edu.eliandro.conditionals;

public class elseif {

	public static void main(String[] args) {

		double saldo = 25.0;
		double saque = 30.0;

		if (saque < saldo) {
			saldo = saldo - saque;
			System.out.println("Saldo atual: " + saldo);
		} else if (saque == saldo) {
			saldo = 0.0;
			System.out.println("Saldo atual: " + saldo);
		} else {
			System.out.println("Valor solicitado maior que o saldo disponível.");
			System.out.println("Saldo atual: " + saldo);
		}
	}

}
