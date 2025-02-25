package edu.eliandro.conditionals;

public class ifelseif {

	public static void main(String[] args) {
		int nota = 6;

		if (nota >= 7) 
			System.out.println("Approval");
		else if (nota >= 5 && nota < 7)
			System.out.println("Recuperation");
		else
 		System.out.println("Preapproval");
	}
}