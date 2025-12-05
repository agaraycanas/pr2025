package t1;

import java.util.Scanner;

public class Ej14 {

	public static int maximo ( int n1 , int n2 ) {
		return n1>n2 ? n1 : n2;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1;
		int n2;
		
		System.out.println("Introduce n1: ");
		n1 = s.nextInt();
		
		System.out.println("Introduce n2: ");
		n2 = s.nextInt();
		
		s.close();
		
		System.out.println("El máximo de " + n1 + " y " + n2 +" es "+ maximo(n1,n2) );
	}

}
