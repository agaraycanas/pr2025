package t5.b.ej05;

import t5.b.ej03.Naranja;
import t5.b.ej04.Limon;

public class CestaCompra {
	public Naranja n;
	public Limon l;
	//===============================
	public      CestaCompra (   ) { 
		this.n = new Naranja( 50 );
		this.l = new Limon( 30 );
	}
	public void comerFruta() {
		this.n.comer();
		this.l.comer();
	}
}