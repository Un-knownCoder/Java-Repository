package Rettangolo;

public class Cerchio {
	private int raggio;
	public void Ridimensiona(int r){
		raggio=r;
	}
	public double Perimetro(){
		double p=2*raggio*Math.PI;
		return p;
	}
	public double Area(){
		return raggio*raggio*Math.PI;
	}
	public Cerchio(){
		raggio=0;
	}
}
