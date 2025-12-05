package t2;


public class Ej33 {

	public static void main(String[] args) {
		double sumaParcial = 0;
		
		for (int i=1;i<=100;i++) {
			sumaParcial = sumaParcial +  ((Math.pow(i,2) + 1) / (double)i ) ;
		}
		System.out.println("El sumatorio vale: " + sumaParcial);
	}

}
