//import static java.lang.System;
public class Initalisierung {
	
	public static void main(String[] args) {
		double version= 1.0+0.1;
		System.out.println("AgentenKfzProgramm " + version);
		System.out.println("Progeamm initalisieren...");
		AgentenKFZ008 akfz = new AgentenKFZ008();
		AgentenKFZ009 akfz2 = new AgentenKFZ009();
		
		akfz.setMaximalesTankVolumenL(51.7);
		akfz.setAktuellesTankVolumenL(0.0);
		akfz.setVerbrauchPro100Km(10.0);
		
		akfz.tanken(50.0);
		System.out.println(akfz.getAktuellesTankVolumen());
		
		akfz.fahren(245.3);
		akfz.fahren(102.3);
		System.out.println(akfz.getAktuellesTankVolumen());
		
		
		akfz.setAktuelleRaketenL(3);
		akfz.setAktuelleRaketenR(3);
		akfz.setMaximaleRaketen(3);
		
		akfz.abfeuern(1);
		akfz.abfeuern(0);
		akfz.abfeuern(1);
		akfz.abfeuern(0);
		akfz.abfeuern(1);
		akfz.abfeuern(0);
		akfz.abfeuern(1);
		akfz.abfeuern(0);
		akfz.abfeuern(1);
		akfz.abfeuern(0);
		
		
		akfz2.setAktivieren(true);
		akfz2.setSchleudersitz(0);
		
		akfz2.schleudersitzauslösen(0);
		akfz2.schleudersitzauslösen(1);	
		akfz2.schleudersitzauslösen(1);	
		akfz2.schleudersitzauslösen(3);
	}
	
}