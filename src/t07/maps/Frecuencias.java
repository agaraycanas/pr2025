package t07.maps;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class Frecuencias {
	public static void main(String[] args) {
		// Simular N tiradas de un dado de C caras obtenidos N y C a través de los dos
		// primeros argumentos de entrada
		// Mostrar el número de veces que se obtiene cada cara
		// y la frecuencia (en porcentaje con un decimal) de ocurrencia de cada tirada

		if (args.length != 2) {
			System.out.println("Necesitas introducir N y C");
		} else {
			int n = Integer.parseInt(args[0]);
			int c = Integer.parseInt(args[1]);
			Map<Integer, Integer> frecuencia = new HashMap<Integer, Integer>();
			Random r = new Random();
			for (int i=0;i<n;i++) {
				int cara = r.nextInt(c) + 1;
				if (frecuencia.get(cara) == null) {
					frecuencia.put(cara, 1);
				}
				else {
					frecuencia.put(cara, frecuencia.get(cara) + 1 );
				}
			}
			System.out.println(frecuencia);
			System.out.println("==========================");
			for ( Entry<Integer,Integer> dato : frecuencia.entrySet()) {
				System.out.println(dato.getKey() + ": " + dato.getValue() );
			}
			System.out.println("==========================");
			for ( int cara : frecuencia.keySet()) {
				float porcentaje = frecuencia.get(cara) / (float)n *100 ;
				System.out.printf("Cara %d: %.1f %% %n" , cara, porcentaje);
			}
			System.out.println("==========================");
		}
	}
}
