//F�r die Simulation eines Wettrennens sollen verschiedene Fahrzeugarten objektorientiert modelliert 
//werden. Da alle Fahrzeugtypen gemeinsame Eigenschaften haben, definieren wir uns zun�chst 
//eine Basisklasse Fahrzeug, die als Oberklasse f�r die anderen Klassen dienen soll. 
//Ein Fahrzeug hat folgende allgemeinen Merkmale:
//
//Seine aktuelle Position (in km und der Einfachheit halber in nur einer Dimension)
//Seine aktuelle Geschwindigkeit (in km/h)
//Es kann bewegt werden (Methode bewege). Die Methode wird mit einem double-Parameter aufgerufen, 
//der die Anzahl der Minuten angibt, die sich das Fahrzeug mit der aktuellen Geschwindigkeit 
//vorw�rts bewegt. Der Methodenaufruf �ndert nat�rlich die Position des Fahrzeugs, wenn es mit 
//einer von 0 verschiedenen Geschwindigkeit bewegt wird.
//Man kann seine Geschwindigkeit setzen (Methode setzeGeschwindigkeit). Die Geschwindigkeit darf 
//die Maximalgeschwindigkeit nicht �berschreiten, eine korrekte Ausf�hrung sollte protokolliert werden.
//Es kann seine Maximalgeschwindigkeit angeben (Methode getMaxGeschwindigkeit). F�r ein Objekt 
//der Klasse Fahrzeug soll die Maximalgeschwindigkeit 0 sein.
//Es kann die Anzahl seiner R�der angeben. In der Klasse Fahrzeug soll diese ebenfalls 0 sein.
//Nun sollen einige konkrete Fahrzeuge definiert werden, indem entsprechende Klassen von Fahrzeug 
//abgeleitet werden:
//
//Ein Fahrrad ist ein Fahrzeug mit 2 R�dern und Maximalgeschwindigkeit 30 km/h.
//Ein Auto ist ein Fahrzeug mit 4 R�dern und Maximalgeschwindigkeit 140 km/h.
//Ein Rennwagen ist ein Auto mit Maximalgeschwindigkeit 220 km/h.
//Ein Krankenwagen ist ein Auto mit einem zus�tzlichen Blaulicht, das ein- oder ausgeschaltet sein 
//kann (neues Attribut!). Au�erdem muss der Krankenwagen Methoden zum Ein- bzw. Ausschalten 
//des Blaulichts anbieten.
//Definieren Sie diese Klassen und nutzen Sie dabei so weit wie m�glich die Vererbung 
//von Eigenschaften aus!


public class Fahrzeug {

	protected double geschwindigkeit;
	protected double max_geschwindigkeit;
	protected double position;
	protected int anzahl_raeder = 0;
	
	Fahrzeug(double geschwindigkeit, double max_geschwindigkeit, double position, int anzahl_raeder) {
		this.geschwindigkeit = geschwindigkeit;
		this.max_geschwindigkeit = max_geschwindigkeit;
		this.position = position;
		this.anzahl_raeder = anzahl_raeder;
	}
	
	public void bewege(double zeit, double geschwindigkeit) {
		if (geschwindigkeit > 0 & geschwindigkeit < max_geschwindigkeit) {
			position = position + zeit * geschwindigkeit;
		} else {
			System.out.println("Ung�ltige Geschwindigkeit.");
		}
		
	}
	
	public void setzeGeschwindigkeit(double geschwindigkeit) {
		if (geschwindigkeit >= 0 & geschwindigkeit < max_geschwindigkeit) {
			this.geschwindigkeit = geschwindigkeit;
			System.out.println("Geschwindigkeit betr�gt:" + geschwindigkeit);
		} else {
			System.out.println("Ung�ltige Geschwindigkeit.");
		}
	}
	
	public double getMaxGeschwindigkeit() {
		return max_geschwindigkeit;
	}
	
	public double getAnzahlRaeder() {
		return anzahl_raeder;
	}
	
}
