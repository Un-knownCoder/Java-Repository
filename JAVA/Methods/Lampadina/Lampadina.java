package Lampadina;

// Stato: 0 = spenta, 1 = accesa, 2 = rotta

public class Lampadina {
	
	private int stato;
	private int mClicks;	
	
	public Lampadina(){
		stato = 0;
		mClicks = 5;
	}
	
	public void click(){
		// modifica lo stato della lampadina
		//stato = mClicks <= 0 ? 2 : stato > 0 ? 0 : 1;
		if(stato == 0){
			stato = 1;
		}else{
			stato = 0;
		}
		
		if(mClicks <= 0)
			stato = 2;
	}
	
	public void getState(){
		return stato;
	}
}
