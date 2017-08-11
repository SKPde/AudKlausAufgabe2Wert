
public class Kombi {

	private Wert a, b; // Werte der Kombination

	public Kombi(Wert a, Wert b) { // Konstruktor
		this.a = a;
		this.b = b;
	}

	public void erhoehenUm(Wert s) {
		a = a.mul(s);
		b = b.mul(s);
		
	}
	
	public Wert mul (Kombi k) {
		return a.add(k.a).mul(b.add(k.b));
	}

}
