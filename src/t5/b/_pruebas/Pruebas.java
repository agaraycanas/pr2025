package t5.b._pruebas;

public class Pruebas {

	public static void main(String[] args) {
		Telefono t1 = new Telefono();
		Telefono t2 = new Telefono();
		
		t1.setNumero(99988811);
		t2.setNumero(62536323);
		
		System.out.println( t1.getNumero() );
		System.out.println( t2.getNumero() );
	}

}
