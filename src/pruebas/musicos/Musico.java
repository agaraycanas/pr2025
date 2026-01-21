package pruebas.musicos;

public class Musico {
	private IInstrumento instrumento;
	
	public Musico() {
		//this.trompeta = new Trompeta();
		this.instrumento = new Triangulo();
	}
	public void tocar() {
		//this.trompeta.sonar();
		this.instrumento.accionar();
	}
	
}
