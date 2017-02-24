import java.util.*;

public class Methods extends Daten{
	private Scanner in;
	public String ausgabe;
	public String eingabe;
	
	public String ask(){ //Methode zur Ein- und Ausgabe
			in = new Scanner(System.in); //Scanner zur Erkennung der Eingabe
		   System.out.print (ausgabe); //Ausgabetext
		   eingabe = in.nextLine(); // Eingegebener Text wird durch den Scanner in der Variable $eingabe gespeichert
		   return eingabe; //gibt den Wert der Variable $eingabe zurück
	}
}
