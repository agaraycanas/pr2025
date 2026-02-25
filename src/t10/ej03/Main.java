package t10.ej03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Debes introducir DOS argumentos de entrada");
			System.out.println("Uso: t10.ej03.Main [numeroArchivos] [nombreArchivo]");
		} else {
			int nArchivos = Integer.parseInt(args[0]);
			String carpeta = "src/t10/ej03/";
			String nombreArchivo = args[1];
			String extension = ".txt";
			String contenido = "";
			try {
				for (int i = 0; i < nArchivos; i++) {
					String nombreCompleto = carpeta + nombreArchivo + (i+1) + extension;
					contenido = "" + (i+1);
					Path archivo = Path.of(nombreCompleto);
					Files.writeString(archivo, contenido);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("HECHO");
		}
	}

}
