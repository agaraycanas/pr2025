package t4;

public class Ej16 {
	public static void sumarMatrices(int[][] a, int[][]b, int[][] suma) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				suma[i][j] = a[i][j] + b[i][j];
			}
		}
	}
	
	public static void multiplicarMatrices(int[][] a, int[][]b, int[][] c) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				c[i][j] = a[i][0] * b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j];
			}
		}
	}

	public static void rellenarDatos(int[][] m, String[] args, int k) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = Integer.parseInt(args[k]);
				k = k +1;
			}
		}
	}

	public static void mostrarMatriz(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		final int TAM = 3;
		int[][] a = new int[TAM][TAM];
		int[][] b = new int[TAM][TAM];
		int[][] suma = new int[TAM][TAM];
		int[][] producto= new int[TAM][TAM];
		
		
		rellenarDatos(a,args,0);
		rellenarDatos(b,args,TAM*TAM);
		System.out.println("===================");
		mostrarMatriz(a);
		System.out.println("===================");
		mostrarMatriz(b);
		System.out.println("===================");
		sumarMatrices(a, b, suma);
		mostrarMatriz(suma);
		System.out.println("===================");
		multiplicarMatrices(a, b, producto);
		mostrarMatriz(producto);

	}

}