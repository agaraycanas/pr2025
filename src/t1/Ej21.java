package t1;

import java.util.Scanner;

public class Ej21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dias;
		int horas;
		int minutos;
		int segundosIniciales;
		int segundosFinales;
		final int SEGUNDOS_EN_UN_DIA = 86400;
		final int SEGUNDOS_EN_UNA_HORA = 3600;
		final int SEGUNDOS_EN_UN_MINUTO = 60;

		System.out.println("Segundos: ");
		segundosIniciales = s.nextInt();
		segundosFinales = segundosIniciales;
		
		dias 			= 	segundosFinales / SEGUNDOS_EN_UN_DIA;
		segundosFinales	=	segundosFinales % SEGUNDOS_EN_UN_DIA;
		
		horas			= 	segundosFinales	/ SEGUNDOS_EN_UNA_HORA;
		segundosFinales =	segundosFinales	% SEGUNDOS_EN_UNA_HORA;
		
		minutos			= 	segundosFinales	/ SEGUNDOS_EN_UN_MINUTO;
		segundosFinales	= 	segundosFinales	% SEGUNDOS_EN_UN_MINUTO;
		
		System.out.println(
				segundosIniciales +
				" segundos son "+
				dias +
				" días, " +
				horas +
				" horas, " +
				minutos +
				" minutos y "+
				segundosFinales +
				" segundos"
				);
		s.close();
	}
}
