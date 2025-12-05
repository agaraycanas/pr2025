package t5.b._pruebas;

public class Coche {
	private int 	litros;
	private String 	matricula;
	public void arrancar() {
		System.out.println("BRRUM ("+ this.litros + "," + this.matricula+")");
	}
	public String getMatricula() {
		return this.matricula;
	}
}
