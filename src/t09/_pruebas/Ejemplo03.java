package t09._pruebas;

public class Ejemplo03 {
	public static void main(String[] args) throws Exception {
		System.out.println("MAIN1");
		a(args);
		System.out.println("FIN");
	}

	private static void a(String[] args) throws Exception {
		System.out.println("A1");
		try {
			b(args);
		}catch (ArithmeticException e) {
			System.out.println("División por cero");
		}
		catch (MiercolesException e) {
			System.out.println("Explosión por ser miércoles "+ e.getMessage());
		}
		catch (Exception e) {
			System.out.println("ERROR GENÉRICO");
		}
		System.out.println("A2");
	}

	public static void b(String[] args) throws Exception {
		Exception miBomba = new MiercolesException();
		int num = 2;
		if (3 > num) {
			throw miBomba;
		} else {
			System.out.println("SALVADO");
		}
	}
}
