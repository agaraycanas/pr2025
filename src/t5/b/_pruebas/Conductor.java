package t5.b._pruebas;

public class Conductor {
	private String 	nombre;
	private int 	edad;
	private Coche	carro;
	
	public void saludar() {
		System.out.println("Hola, soy "+this.nombre+" y tengo "+this.edad+" años");
	}
	
	public Conductor() {
		this.nombre = "Anónimo";
		this.edad = 20;
		this.carro = new Coche();
		//this.carro.litros = 57;
		//this.carro.matricula = "1111G";
	}

	public int getEdad() {
		return this.edad;
	}
	
	public Coche getCarro() {
		return this.carro;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setCarro( Coche coche ) {
		this.carro = coche;
	}
	
	

}
