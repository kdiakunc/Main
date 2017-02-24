public class AgentenKFZ009 extends AgentenKFZ{
	
	private boolean aktivieren ;
	private int schleudersitz;
	
	public int getSchleudersitz(){
		return this.schleudersitz;
	}
	public boolean getAktivieren(){
		return this.aktivieren;
	}
	
	public void setAktivieren(boolean aktivieren){
		this.aktivieren=aktivieren;
	}
	public void setSchleudersitz(int schleudersitz){
		this.schleudersitz=schleudersitz;
	}
	
	
	public void schleudersitzauslösen(int schleudersitz){
		if (schleudersitz==1){
			if(aktivieren==true){
				System.out.println("Schleudersitz aktiviert!");
				this.aktivieren=false;
				}
			else {
				System.out.println("Schleudersitz wurde schon ausgelöst");
			}
		}
		else if(schleudersitz==0){
					if(aktivieren==true){
						System.out.println("Um Schleudersitz zu benutzen den Parameter ändern");					
					}
					else{
						System.out.println("Schleudersitz wurde schon ausgelöst");
					}
		}
		else {
			System.out.println("Falscher Parameter eingegeben");
		}
	}
}
