package t10.ej04;

import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

@SuppressWarnings("serial")
class NoEsUnDirectorioException extends Exception {}

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Debes introducir UN argumento de entrada");
			System.out.println("Uso: t10.ej04.Main [directorioABorrar]");
		} else {
			String nombreDirectorio = args[0];
			String carpeta = "src/t10/ej04/";
			Path directorioABorrar = Path.of( carpeta + nombreDirectorio);
			try {
				if (!Files.exists(directorioABorrar)) {
					throw new NoSuchFileException(nombreDirectorio);
				}
				if (!Files.isDirectory(directorioABorrar)) {
					throw new NoEsUnDirectorioException();
				}
				Files.delete(directorioABorrar);
				System.out.println("El directorio de nombre \"" + args[0] + "\" ha sido borrado");
			}
			catch (NoEsUnDirectorioException e) {
				System.out.println("El archivo de nombre \"" + nombreDirectorio + "\" no es un directorio");
			}
			catch (NoSuchFileException e) {
				System.out.println("El directorio de nombre \"" + nombreDirectorio + "\" no existe");
			}
			catch (DirectoryNotEmptyException e) {
				System.out.println("El directorio de nombre \"" + nombreDirectorio + "\" no está vacío");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
