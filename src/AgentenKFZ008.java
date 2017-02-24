public class AgentenKFZ008 extends AgentenKFZ{
	private int maximaleRaketen;
	private int aktuelleRaketenL;
	private int aktuelleRaketenR;
	
	
	public int getMaximaleRaketen(){
		return this.maximaleRaketen;
	}
	public int getAktuelleRaketenR(){
		return this.aktuelleRaketenR;
	}
	public int getAktuelleRaketenL(){
		return this.aktuelleRaketenL;
	}
		
	public void setMaximaleRaketen(int maximaleRaketen){
		this.maximaleRaketen=maximaleRaketen;
	}
	public void setAktuelleRaketenL(int aktuelleRaketenL){
		this.aktuelleRaketenL=aktuelleRaketenL;
	}
	public void setAktuelleRaketenR(int aktuelleRaketenR){
		this.aktuelleRaketenR=aktuelleRaketenR;
	}
	
	
	
	
	public void abfeuern(int seite){
			if (seite==0)   { 		
				if (aktuelleRaketenL>0){
						System.out.println("Linke Rakete abgefeuert");
						aktuelleRaketenL=aktuelleRaketenL-1;
					}
					else {
						System.out.println("Nachladen!!!");
					nachladen(0);
					}
			}
			else if(seite==1) {
				if(aktuelleRaketenR>0){
					System.out.println("Rechte Rakete abgefeuert");
					aktuelleRaketenR=aktuelleRaketenR-1;
				}
					else{
						System.out.println("Nachladen!!!");
						nachladen(1);
					}
			}	
			else{
				System.out.println("FalschenParameterÜbergeben");
			}
			
	}
	public void nachladen(int LR){
		if (LR==0){
			this.aktuelleRaketenL=this.maximaleRaketen;
		}
		else if(LR==1){
			this.aktuelleRaketenR=this.maximaleRaketen;
		}
		else{
			System.out.println("FalschenParameterÜbergeben");
		}
	}

}
