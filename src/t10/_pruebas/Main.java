package t10._pruebas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String carpeta = "src/t10/_pruebas/";
		Path ruta = Path.of(carpeta+"prueba.txt");
		try {
			//List<String> lineas = Files.readAllLines(ruta);
			String contenido = Files.readString(ruta);
			String[] lineasArray = contenido.split("\n");
			System.out.println(Arrays.toString(lineasArray));
		} catch (IOException e) {
			System.out.print("ERROR al leer el fichero ");
			System.out.println(e.getMessage());
		}
	}

}
