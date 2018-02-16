package Rettangolo;

public class Rettangolo {
	private int base;
	private int altezza;
	
	public void Ridimensiona(int b, int a){
		base=b;
		altezza=a;
	}
	public int Perimetro(){
		int p=(altezza+base)*2;
		return p;
	}
	public int Area(){
		return base*altezza;
	}
	public Rettangolo(){
		base=0; altezza=0;
	}

}
