package t4;

public class Ej14 {
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
	
	public static void multiplicarMatrices(int[][] a, int[][]b, int[][] c) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				c[i][j] = a[i][0] * b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j];
			}
		}
	}

	public static void main(String[] args) {
		int[][] a = { {1,2,3}, {4,5,6}, {7,8,9} };
		int[][] b = { {9,8,7}, {6,5,4}, {3,2,1} };
		int[][] producto = new int[3][3];

		mostrarMatriz(a);
		pintarSeparador();
		mostrarMatriz(b);
		pintarSeparador();
		multiplicarMatrices(a,b,producto);
		mostrarMatriz(producto);
	}



}
