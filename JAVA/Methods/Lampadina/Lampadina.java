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
		if(mClicks > 0){
			if(stato == 0)
				stato = 1;
			else
				stato = 0;
			mClicks--;
		}else{
			stato = 2;
		}
	}
	
	public void stato(){
		if(stato == 0)
			System.out.println("Spenta");
		else if(stato == 1)
			System.out.println("Accesa");
		else
			System.out.println("Rotta");
	}
}
