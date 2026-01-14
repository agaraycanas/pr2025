package pruebas;

import java.util.Random;

public class Prueba {
	public static void main(String[] args) {

		Cantante[] x = new Cantante[4];
		for (int i=0;i<4;i++) {
			x[i] = (new Random()).nextInt(2)==0 ? new CantanteOpera() : new CantanteRock();
		}
		for (int i=0;i<4;i++) {
			x[i].cantar();
		}

		/*
		Cantante cantante = new Cantante();
		cantante.cantar();
		*/
	}
}
