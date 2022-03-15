package geometry; 
//klasa u Java programu jedinstveno odredjena specifikacijom koja sadrzi
//naziv paketa i naziv kalse geometry.Point

//klasa - koncept o-o programskih jezika putem kojeg se modeluje klasa objekata realnog sistema
//modeluje stanja i ponasanja objekata koji pripadaju datoj klasi objekata realnog sistema
//sablon za kreiranje objekata
//slozen tip podatka
public class Point {
	
	//atributi klase - modeluju stanje objekata
	//inkapsulacija - skrivanje sadrzaja klase (od drugih klasa), ostvaruje se putem specifikatora pristupa
	//specifikatori pristupa: private, protected, public
	private int x;
	private int y;
	private boolean selected; //isSelected setSelected
	
	//konstruktor - posebna metoda klase koja sluzi za instanciranje objekata
	//poziv konstruktora vrsi kreiranje objekta na heap-u
	//naziv konstruktora mora biti isti kao naziv klase u kojoj je definisan
	//konstruktor nema specifiran tip povratne vrednosti (ni void)
	public Point() {
		
	}
	
	//overloading - preklapanje naziva metoda, pridruzivanje istog naziva razlicitim metodama
	//preklopljene metode moraju se razlikovati ili po broju parametara
	//ili po redosledu tipova podataka koji su pridruzeni parametrima
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//metode klase - modeluju ponasanje objekata
	//get i set metode 
	public int getX() {
		return this.x;
	}
	
	public void setX(int x_coord) {
		if (x_coord > 0) {
			x = x_coord;
		}else {
			System.out.println("Vrednost mora da bude pozitivna");
		}
	}
	
	public int getY() {
		return y;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setY(int y_coord) {
		y = y_coord;
	}
	
	public void setSelected(boolean s) {
		selected = s;
	}
	
	//THIS - referencira objekat za koji je pozvana metoda 
	public double distance(int x2, int y2) {
		double dx = x2 - this.x;
		double dy = y2 - this.y;
		double d = Math.sqrt(dx*dx + dy*dy);
		return d;
		
	}
	
}
