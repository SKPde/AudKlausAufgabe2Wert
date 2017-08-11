
public class CharWert extends Wert{

	private char z; // Zeichen
	public CharWert(char z) { //Konstruktor
		this.z = z;
	}
	
	public Wert add(Wert w) {
		
		CharWert neuWert = (CharWert) w;
		
		return new CharWert((char) (neuWert.z + this.z)); // Additions-Methode
		
	}
	
	public Wert mul(Wert w) {
		return w; // Multiplikations-Methode
		
	}
	
	public String toString() {
		return null;    // String Darstellung
		
	}
	
	public boolean equals(Object zahl) {
		return false;  // Vergleichs-Methode
		
	}
}
