package pruebas.musicos;

public class Trompeta implements IInstrumento {
	public void soplar() {
		System.out.println("PUUU");
	}
	
	public void accionar() {
		this.soplar();
	}
	
}
