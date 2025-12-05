package t5.b.ej08;

import t5.b.ej03.Naranja;
import t5.b.ej04.Limon;

public class CestaCompra {
	private Naranja n;
	private Limon l;
	//===============================
	public      CestaCompra (   ) { 
		this.n = new Naranja( 50 );
		this.l = new Limon( 30 );
	}
	public void comerFruta() {
		this.n.comer();
		this.l.comer();
	}
	public Naranja getN() {
		return this.n;
	}
	public Limon getL() {
		return this.l;
	}
}