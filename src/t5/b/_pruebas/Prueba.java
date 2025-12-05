package t5.b._pruebas;

public class Prueba {
	
	public static void main(String[] args) {
		Conductor conductor1 = new Conductor();
		
		conductor1.setEdad(70);
		//conductor1.edad = 70;
		
		System.out.println( conductor1.getEdad() 	);
		//System.out.println( conductor1.edad 		);
		
		Coche c = new Coche();
		//c.litros = 80;
		//c.matricula ="6756H";
		//conductor1.carro = c;
		conductor1.setCarro(c);
		
		System.out.println(conductor1.getCarro().getMatricula());
	
	}
}
