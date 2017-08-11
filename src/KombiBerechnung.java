public class KombiBerechnung {

	public static void main(String[] args) {

		CharWert a = new CharWert('A');
		CharWert b = new CharWert('B');
		CharWert r = new CharWert('X');
		
		Kombi p = new Kombi(a,b);
		Wert w;
		
		//System.out.println(a.toString());
		
		do{
			w = p.mul(p);
			System.out.println(w.toString());
			p.erhoehenUm(w);
		} while(! w.equals(r));
		

	}
}
