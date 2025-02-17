package edu.eliandro.scope;

public class Conta {

	double saldo = 10.0;

	public void sacar(Double valor) {
		double novoSaldo = saldo - valor;
	}

	public void imprimirSaldo(){
		// the variable saldo is defined globally, can accessed in all the class.
		System.out.println("Saldo: " + saldo);
		// the variable novoSaldo is not defined in this scope, so it will be treated as a local variable
		System.out.println("Saldo atualizado: " + novoSaldo)
	}

	public double calcularDividaExponencial() {
		// local variables
		double valorParcela = 50.0;
		double valorMontante = 0.0;

		// the "i" is scope variable and is restarted each loop.
		for(int i = 1; i <= 5; i++) {
			double valorCalculado = valorParcela * i;
			valorMontante = valorMontante + valorCalculado;
		}
		//scope flow "i" and "valorCalculado" never can be accessed out of scope.
		return valorMontante;
	}

}
