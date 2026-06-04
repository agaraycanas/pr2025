package pruebas.arrays;

public class Main {

	public static void main(String[] args) {
		String[][] nombres = new String[4][2];
		nombres[0][0] = "Pepe";
		nombres[0][1] = "García";

		nombres[1][0] = "Ana";
		nombres[1][1] = "Sánchez";

		nombres[2][0] = "Federico";
		nombres[2][1] = "Pérez";

		nombres[3][0] = "Marta";
		nombres[3][1] = "Rodríguez";
		
		for (int i=0; i<nombres.length;i++) {
			System.out.println(nombres[i][1] + ", " + nombres[i][0]);
		}
}
}
