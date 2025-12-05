package t1;

import java.util.Scanner;

public class Ej20 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int segundos;
		int minutos;
		int horas;
		int solucion;
		final int SEGUNDOS_EN_UNA_HORA = 3600;
		final int SEGUNDOS_EN_UN_MINUTO = 60;

		System.out.println("Horas: ");
		horas = s.nextInt();
		System.out.println("Minutos (0-59): ");
		minutos = s.nextInt();
		System.out.println("Segundos (0-59): ");
		segundos = s.nextInt();
		
		solucion = (horas * SEGUNDOS_EN_UNA_HORA) + (minutos * SEGUNDOS_EN_UN_MINUTO) + segundos;
		s.close();
		System.out.println(
				horas + " horas, " + minutos + " minutos y " + segundos + " segundos son " + solucion + " segundos");

	}

}
