package Rettangolo;

public class Quadrato {
	private int Lato;
	
	public void Ridimensiona(int l){
		Lato=l;
	}
	public int Perimetro(){
		return Lato*4;
	}
	public int Area(){
		return Lato*Lato;
	}
	
	public 	Quadrato(){
		Lato=0;
	}
}
