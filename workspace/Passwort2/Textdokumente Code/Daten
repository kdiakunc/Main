import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Daten {
public HashMap<String,String> liste;

	public Daten() {
		liste = new HashMap<String,String>(); // Erstellung der HashMap
	}
		public void speichern(){//Methode zur Speicherung der HashMap
			try{
				FileOutputStream fos = new FileOutputStream("hashmap.ser"); //Hashmap wird unter den Namen "hashmap.ser" gespeichert
				ObjectOutputStream oos = new ObjectOutputStream(fos); //Der Objektoutputstream verweist auf den Fileoutputstream
				oos.writeObject(liste);//die HashMap wird als Objekt angesehen
				oos.close();
				fos.close();
				}
			catch (IOException ioe){ //Falls ein Fehler auftritt wird der Verlauf bis zum Auftreten angezeigt
				ioe.printStackTrace();
				}
		}
		public void laden(){//Methode zum Laden der HashMap	
			try{
				FileInputStream fis = new FileInputStream ("hashmap.ser"); //HashMap wird unter den Namen "hashmap.ser" gesucht
				ObjectInputStream ois = new ObjectInputStream (fis); //der Fileinputstream verweist auf den Objectinputstream
				liste = (HashMap) ois.readObject();//einlesen der HashMap als Objekt
				ois.close();
				fis.close();
				}
			catch (IOException ioe){//Falls ein Fehler auftritt wird der Verlauf bis zum Auftreten angezeigt
				ioe.printStackTrace();
				return;
			}
			catch (ClassNotFoundException c){ //Falls die Datei nicht gefunden werden kann wird der Verlauf bis zu dem Fehler angezeigt
				System.out.println("Class not found");
				c.printStackTrace();
				return;
				}
		}
}


