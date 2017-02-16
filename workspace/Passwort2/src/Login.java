//import java.util.*;

public class Login {

	static String name;
	static String pass;

	
	public static void main(String[] args) {
		Methods meth =new Methods();
		//String ausgabe=meth.ausgabe;
		Passwort2 pw = new Passwort2();
	
	for (;;){
	
	meth.ausgabe= "Was willst du tun? add/list/rm/exit";
	meth.ask();
		
	switch (meth.eingabe){
	case "add":
		meth.ausgabe="Gib einen Namen ein: ";
		meth.ask();
		name=meth.eingabe;
		meth.ausgabe="Gib ein Passwort ein: ";
		meth.ask();
		pass=meth.eingabe;
		pw.liste.put(name, pass);
		break;
	case "list":
		System.out.println(pw.liste );
		break;
	case "rm":
		meth.ausgabe="Gib einen Namen ein: ";
		meth.ask();
		name=meth.eingabe;
		pw.liste.remove(name);
		break;
	case "exit":
		System.exit(0);
		break;
	default :
		System.out.println("Der Parameter ist nicht erlaubt!");
		break;
	}
	}		
	/*
	for (;;){	
		for (int i = 0; i < args.length; i++) {
            //System.out.println(args[i]);
        } 
		if (args[0].equals("add")){
			
			meth.ausgabe="name";
			meth.ask();
			name=meth.eingabe;
			meth.ausgabe="pass";
			meth.ask();
			pass=meth.eingabe;
			pw.liste.put(name, pass);
			System.out.println(pw.liste );
		}
		else if (args[0].equals("list")){
			System.out.println(pw.liste );
		}
		else if (args[0].equals("rm")){
			meth.ausgabe="name";
			meth.ask();
			name=meth.eingabe;
			pw.liste.remove(name);
		}
		else{
			System.out.println("Der Parameter ist nicht erlaubt!"); 
		}
	*/
		
		
		
		//	System.out.println("Der erste Parameter ist: " + args[0]);
       // else if (args[0].equals("1"))
        //    System.out.println("Hallo Welt!");
       // else
        //    System.out.println("Der Parameter ist nicht erlaubt!");
     
	
	
	
	//meth.ausgabe="bla";
	//meth.ask();
	//System.out.println(pw.liste );
	//System.out.println(meth.eingabe);
	}
}
//}

