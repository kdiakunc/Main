public class AgentenKFZ{
	private double gesamtkilometer = 0.0;
	
	private double maximalesTankVolumenL;
	private double aktuellesTankVolumenL;
	private double verbraucherPro100Km ;
	
	public AgentenKFZ(){
		System.out.println("Erzeuge AgentenKFZ-Objekt");
		
	}
	public void fahren(double km){
		this.gesamtkilometer = this.gesamtkilometer + km;
		
		double verbrauch= km / 100.0 * this.verbraucherPro100Km; 
		this.aktuellesTankVolumenL = this.aktuellesTankVolumenL - verbrauch;
		System.out.println(this.gesamtkilometer +" Kilometer brummbrumm" + verbrauch);
	}
	public double getMaximalesTankVolumenL(){
		return this.maximalesTankVolumenL;
	}
	public double getAktuellesTankVolumen(){
		return this.aktuellesTankVolumenL;
	}
	public void setMaximalesTankVolumenL(double maximalesTankVolumenL){
		this.maximalesTankVolumenL = maximalesTankVolumenL;
	}
	public void setAktuellesTankVolumenL(double aktuellesTankVolumenL){
		this.aktuellesTankVolumenL = aktuellesTankVolumenL;
	}
	public void tanken(double liter){
		if ((this.maximalesTankVolumenL - this.aktuellesTankVolumenL) >= liter){
			this.aktuellesTankVolumenL = this.aktuellesTankVolumenL + liter ;
		}
		else {
			this.aktuellesTankVolumenL = this.maximalesTankVolumenL;
		}
	}
	public double getGesamtkilometer(){
		return this.gesamtkilometer;
	}
	public void setVerbrauchPro100Km(double verbraucherPro100Km){
		this.verbraucherPro100Km = verbraucherPro100Km;
	}
	public double getVerbrauchPro100Km(){
		return this.verbraucherPro100Km;
	}
	
}
