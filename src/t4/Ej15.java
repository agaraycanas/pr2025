package t4;

public class Ej15 {
	public static void rellenarDatos(int[][] m, String[] args) {
		int k = 0;

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
		int[][] m = new int[3][3];
		rellenarDatos(m,args);
		mostrarMatriz(m);
	}

}