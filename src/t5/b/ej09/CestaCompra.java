package t5.b.ej09;

import t5.b.ej03.Naranja;
import t5.b.ej04.Limon;

public class CestaCompra {
	// ATRIBUTOS
	private Naranja n;
	private Limon 	l;
	//===============================
	// MÉTODOS CONSTRUCTORES
	public      CestaCompra (   ) { 
		this.n = new Naranja( 50 );
		this.l = new Limon( 30 );
	}
	public      CestaCompra ( int pesoNaranja, int pesoLimon) {
		this.n =  new Naranja(pesoNaranja);
		this.l =  new Limon(pesoLimon);
	}
	//-----------------------
	// Otros métodos
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
	
	public void  getPesos( ) {
		int pesoNaranja	=	this.n.getPeso();
		int pesoLimon	=	this.l.getPeso();
		System.out.println("Naranja: " + pesoNaranja+ ", limón: " + pesoLimon);
	}
}