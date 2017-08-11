
public class CharWert extends Wert {

	private char z; // Zeichen

	public CharWert(char z) { // Konstruktor
		this.z = z;
	}

	public Wert add(Wert w) {

		CharWert neuWert = (CharWert) w;

		return new CharWert((char) (neuWert.z + this.z)); // Additions-Methode

	}

	public Wert mul(Wert w) {
		
		CharWert neuWert = (CharWert) w;
		
		return new CharWert((char) (neuWert.z * this.z)); // Multiplikations-Methode

	}

	public String toString() {
		return String.valueOf(z); // String Darstellung

	}

	public boolean equals(Object zahl) {
		
		if(zahl instanceof CharWert) {
			CharWert neuWert = (CharWert) zahl;
			if(neuWert.z == this.z)
				return true;
		}
		return false; // Vergleichs-Methode

	}
}
