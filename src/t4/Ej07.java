package t4;

import java.util.Arrays;

public class Ej07 {
	public static void main(String[] args) {
		final int TAM = 40;
		String[] a = new String[TAM];
		for (int i=1;i<args.length;i++) {
			a[i-1] = args[i];
		}
		System.out.println(Arrays.toString(a));
		
		int incremento = Integer.parseInt( args[0] );
		System.out.println("Incremento: "+incremento);

		for (int i = 0; i < a.length; i+=incremento) {
			if (a[i]!=null) {
				System.out.print(a[i] + " ");
			}
		}
		
	}

}
