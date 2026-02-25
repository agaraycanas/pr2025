package t10.ej06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
	private static String rutaAlEjercicio = "src/t10/ej06/";

	private static void comprobarArgumentosDeEntrada(String[] args, int numero, String uso) {
		if (args.length != numero) {
			System.out.println("ERROR: Número de argumentos de entrada incorrectos");
			System.out.println("Uso: " + uso);
			throw new IllegalArgumentException();
		}
	}

	public static void main(String[] args) {
		try {
			comprobarArgumentosDeEntrada(args, 1, "t10.ej06.Main [numeroDeArchivos]");
			crearCarpetas();
			crearArchivos(Integer.parseInt(args[0]));
			System.out.println("FIN");
		} catch (IllegalArgumentException e) {
		} catch (IOException e) {
			System.out.println("ERROR de ENTRADA/SALIDA");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("ERROR GENÉRICO");
			e.printStackTrace();
		}
	}

	private static void crearArchivos(int numeroArchivos) throws Exception {
		String carpeta = "/uno/";
		for (int i=1;i<=numeroArchivos;i++) {
			Path ruta = Path.of( rutaAlEjercicio + carpeta + "f" + i + ".txt");
			Files.writeString(ruta, "TEST");
		}
	}

	private static void crearCarpetas() throws IOException {
		if (!Files.exists(Path.of(rutaAlEjercicio + "uno"))) {
			Files.createDirectory(Path.of(rutaAlEjercicio + "uno"));
		}
		if (!Files.exists(Path.of(rutaAlEjercicio + "dos"))) {
			Files.createDirectory(Path.of(rutaAlEjercicio + "dos"));
		}
		if (!Files.exists(Path.of(rutaAlEjercicio + "tres"))) {
			Files.createDirectory(Path.of(rutaAlEjercicio + "tres"));
		}

	}
}
