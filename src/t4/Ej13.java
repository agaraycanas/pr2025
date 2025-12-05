package t4;

public class Ej13 {
	public static void pintarSeparador() {
		System.out.println("==========================");		
	}
	
	public static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void sumarMatrices(int[][] a, int[][]b, int[][] suma) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				suma[i][j] = a[i][j] + b[i][j];
			}
		}
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 3, 2, 1 }, { 0, 0, -1 } };
		int[][] b = { { 0, -2, 0 }, { -3, 0, 10 }, { -20, 0, -1 } };
		int[][] suma = new int[3][3];

		mostrarMatriz(a);
		pintarSeparador();
		mostrarMatriz(b);
		pintarSeparador();
		sumarMatrices(a,b,suma);
		mostrarMatriz(suma);
	}



}
