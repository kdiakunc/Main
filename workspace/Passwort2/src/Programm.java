/* Programm zur Name und Passwort Verwaltung
 * Funktionen: Anlegen, Löschen, Liste anzeigen, Passwort ändern, ganzen Inhalt der Liste löschen
 * 
 * 24.02.2017
 * Kevin Diakunczak
 * 
 * 
 */
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.util.*;
import java.util.regex.Pattern;

public class Programm {

	static String name; //Variablendeklaration mit dem Typ String
	static String pass;
	static String passwort = ""; 
	static String need = "[0-9[a-z[A-Z]]]+";

	
	public static void main(String[] args) { //Start der Main-Methode
		Methods meth =new Methods();	//Initalisierung der Methode
		Daten pw = new Daten();

		for (;;){ //Endlosschleife
			pw.laden(); //Methode um die Hashmap zuladen
			
			meth.ausgabe= "Was willst du tun? add/add2/list/rm/clear list/change/exit"; //Text ausgabe zur Auswahl was im folgenden Ablauf passieren soll
			meth.ask();
		
			switch (meth.eingabe){ //Switch Methode, wird genutzt um bei verschiedenen Fällen unterschiedliche Aktionen durchzuführen
				case "add": 		//Name und Passwort anlegen
						meth.ausgabe="Gib einen Namen ein: ";
						meth.ask();//Methode zur Ein- und Ausgabe
					if (pw.liste.containsKey(meth.eingabe)==false){	//Abfrage ob der Name schon exsistiert, wenn nicht kann der Name und das Passwort angelegt werden	
							name=meth.eingabe; //Die Eingabe wird in der Variable name gespeichert 
						meth.ausgabe="Gib ein Passwort ein: ";
						meth.ask();//Methode zur Ein- und Ausgabe
						if (meth.eingabe.length() >= 8){ //Länge der Eingabe Überprüfen, die Eingabe soll mindestens 8 Zeichen besitzen
							//if (Pattern.matches(need, meth.eingabe)){ //Eingabe auf vorhandene Zeichen prüfen (Funktioniert nicht so wie gewollt 
								pass=meth.eingabe;
								pw.liste.put(name, pass); //Die beiden Variablen name und pass werden in die HashMap Liste aufgenommen
								pw.speichern(); //Methode um die HashMap abzuspeichern
								//break;
								//}
							//else{
								//System.out.println("Anforderungen erfüllen");
								//break;
								//}
							}
						else {
							System.out.println("Nicht lang genug!!");
							break;
							}
						}
					else { //falls der Name schon vorhanden ist gibt es eine enstprechende Rückmeldung
						System.out.println("Der Name ist schon vorhanden!!");
						break;
						}
				case "list": //listet alle exsistierenden Namen und Passwörter auf
					System.out.println(pw.liste );
					break;
		
				case "rm": //Löschung eines Namens und dem dazu gehörigen Passwort 
						meth.ausgabe="Gib einen Namen ein: ";
						meth.ask();
					if (pw.liste.containsKey(meth.eingabe)==true){ //Abfrage ob der Namen exsistiert, wenn ja wird er Gelöscht
							name=meth.eingabe;
						pw.liste.remove(name);
						pw.speichern();//Methode um die HashMap abzuspeichern
						break;
						}
					else{	//wenn der Name nicht vorhanden ist gibt es eine entsprechende Rückmeldung
						System.out.println("Der Name ist nicht vorhanden!!");
						break;
						}
				case "exit": //Beenden des Programms
						pw.speichern();//Methode um die HashMap abzuspeichern
						System.exit(0);//beendet das Programm
						break;
					
				case "change": //Passwort eines Namens ändern
						meth.ausgabe="Gib einen Namen ein: ";
						meth.ask();
					if (pw.liste.containsKey(meth.eingabe)==true){ // Überprüfung ob der Name exsistiert, wenn ja neues Passwort eingeben
							name=meth.eingabe;//Die Eingabe wird in der Variable name gespeichert
						meth.ausgabe="Gib ein neunes Passwort ein: ";
						meth.ask();
						if (meth.eingabe.length() >= 8){//Länge der Eingabe Überprüfen, die Eingabe soll mindestens 8 Zeichen besitzen
								pass=meth.eingabe;// Speichert die Eingabe in der Variable pass ab
							pw.liste.put(name, pass);//dadurch das der Name vorhanden wird wird das Passwort überschrieben
							pw.speichern();//Methode um die HashMap abzuspeichern
							break;
							}
						else {
							System.out.println("Nicht lang genug!!");
							break;
							}
					}
					else{ //wenn der Name nicht vorhanden ist gibt es eine entsprechende Rückmeldung
						System.out.println("Der Name ist nicht vorhanden!!");
						break;
						}		
				case "add2": 		//Name und Passwort anlegen mit PopUp-Fenster
						meth.ausgabe="Gib einen Namen ein: ";
						meth.ask();
					if (pw.liste.containsKey(meth.eingabe)==false){	//Abfrage ob der Name schon exsistiert, wenn nicht wird kann der Name und das Passwort angelegt werden	
							name=meth.eingabe;//Die Eingabe wird in der Variable name gespeichert
						meth.ausgabe="Gib ein Passwort ein: ";
						JPasswordField passwort = new JPasswordField(10); //Eingabe Fenster für das Passwort
						passwort.setEchoChar('*');//die Zeichen werden hiermit durch *ne angezeigt 
						JOptionPane.showMessageDialog(null,passwort,"Enter password",JOptionPane.OK_OPTION);//Optionen des PopUp-Fensters
			   
						pw.liste.put(name, passwort.getText()); //Abspeichern der beiden Variablen in der HashMap (getText enthält das eingegebene Passwort
						pw.speichern();//Methode um die HashMap abzuspeichern
						break;
						}
					else { //falls der Name schon vorhanden ist gibt es eine enstprechende Rückmeldung
						System.out.println("Der Name ist schon vorhanden!!");
						break;
						}
				case "clear list":{ //Gesamte HashMap leeren
						pw.liste.clear(); //Befehl zur Leerung der HashMap
						pw.speichern();//Methode um die HashMap abzuspeichern
						break;
						}
				default: //falls eine Üngultige Eingabe getätigt wird, gibt es eine entsprechende Rückmeldung
						System.out.println("Der Parameter ist nicht erlaubt!");
						break;
			}				
		}
	}
	
}





