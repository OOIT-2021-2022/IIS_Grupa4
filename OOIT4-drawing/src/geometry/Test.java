package geometry;

public class Test {

	//main metoda - ulazna tacka programa
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// promenljiva(varijabla) - imenovana memorijska lokacija koja omogucava skladistenje odredjenog podatka
		int i; //deklaracija promenljive, definisanje tipa podatka
		i = 0; //inicijalizacija promenljive, dodavanje vrednosti 
		
		// implicitna konverzija je moguca sa kompatibilnim tipovima podataka
		// kada se vrednost manjeg tipa podatka smesta u promenljivu veceg tipa podatka
		//jer u ovom slucaju ne dolazi do gubitka informacija
		int a = 6;
		double b = a;
		System.out.println(b);
		
		//eksplicitna konverzija
		int c = (int)b;
		System.out.println(c);
		
		//logicki operatori
		boolean firstBool = true;
		boolean secondBool = false;
		//&& || ! ^
		System.out.println(firstBool ^ secondBool);
		
		//konkatenacija stringova
		String string1 = "ime ";
		String string2 = "prezime";
		System.out.println(string1+string2);
				
 		//3. zadatak 
		/*for(i=1; i<10; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}*/
		
		//Vezbe 2:
		
		//objekat je instanca klase i ima sve osnobine i ponasanja koja su definisana u klasi
		//modeluje objekat (entitet) realnog sistema
		//predstavlja pojavu klase cijim je konstruktorom kreiran 
		//objekat se instancira pozivom konstruktora klase (oprator new + poziv konstruktora)
		Point point = new Point(); 
		//promenljiva point ukazuje na kreiran objekat, odnosno predstavlja referencu na objekat klase Point
		//kada metodi za ispis prosledimo referencu dobijamo ispis:
		//<nazivPaketa>.<nazivKlase>@<hexAdresa>
		System.out.println(point); 
		
		//direktan pristup atributu x promenljive point koja je tipa Point nije moguc jer atribut 
		//x ove klase Point ima private specifikator pristupa
		//System.out.println(point.x);
		
		//nakon instanciranja objekta, atributi primarnih tipova podataka kojima nije eksplicitno dodeljena vrednost
		//implicitno dobijaju podrazumevane vrednosti za odgovarajuci tip podatka
		System.out.println(point.getX()); //podrazumevana vrednost za int je 0
		System.out.println(point.isSelected()); //za boolean je false
		
		//get i set metode omogucavaju pristup privatnim atributima klase
		point.setX(10);
		System.out.println(point.getX());
		Point point2 = new Point(10,10); 
		System.out.println(point2.getY());
		
		Point point3 = new Point(50,50);
		//u metodi distance klase Point this.x se odnosi
		//na atribut x objekta this - objekta p1 nad kojim je pozvana metoda
		double distance = point3.distance(100, 100);
		System.out.println(distance);
		
		//Vezbe 3:
		Line line = new Line();
		//atributi koji su slozenog tipa podatka se moraju eksplicitno inicijalizovati
		//u suprotnom imaju null vrednost
		System.out.println(line.getEndPoint());//null
		
		// 1. Inicijalizovati x koordinatu tacke p
		// na vrednost y koordinate tacke p1
		Point p = new Point(10,10);
		Point p1 = new Point(20,20);
		p.setX(p1.getY());
		System.out.println(p.getX());//20
		
		// 2. Postaviti za pocetnu tacku linije l1 tacku p, a
		// za krajnju tacku linije l1 tacku p1
		Line l1 = new Line();
		l1.setStartPoint(p);
		l1.setEndPoint(p1);
		
		// 3. Postaviti y koordinatu krajnje tacke l1 na 23
		Point endPoint = l1.getEndPoint();
		endPoint.setX(23);
		//l1.getEndPoint().setX(23);
		
		// 4. Inicijalizovati x koordinatu pocetne tacke linije l1
		// na vrednost y koordinate krajnje tacke linije l1
		l1.getStartPoint().setX(l1.getEndPoint().getY());
		
		//Uraditi:
		// 5. Postaviti x koordinatu krajnje tacke l1 na vrednost
		// duzine linije l1 umanjene za vrednost zbira x i y
		// koordinate pocetne tacke linije l1


		// 6. Postaviti x koordinatu tacke gore levo pravougaonika
		// r1 na vrednost 10 i y koordinatu na vrednost 15


		// 7. Postaviti centar kruga c1 na koordinate tacke
		// gore levo od r1


		// 8. Postaviti x koordinatu centra kruga c1 na vrednost razlike
		// povrsine pravougaonika r1 i y koordinate pocetne tacke linije l1

		
	}

}
