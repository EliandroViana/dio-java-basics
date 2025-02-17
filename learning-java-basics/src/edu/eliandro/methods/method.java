package edu.eliandro.methods;

public class method {

	public static void main(String[] args) {
		method sum = new method();	
		sum.add(10,20);
	}
		
	// Print the sum of two numbers
	public void add(int a,int b){
		int sum=a+b;
		System.out.println("Sum is "+sum);
	}

}
