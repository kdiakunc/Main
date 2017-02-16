import java.util.*;
public class Methods {
	private Scanner in;
	public String ausgabe;
	public String eingabe;
	
	public String ask(){
			in = new Scanner(System.in);
		   System.out.print (ausgabe);
		   eingabe = in.nextLine();
		   return eingabe;
	}

}
