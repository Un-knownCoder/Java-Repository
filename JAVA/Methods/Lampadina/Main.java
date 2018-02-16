package Lampadina;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Lampadina lamp1 = new Lampadina();
		int n;
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt())
			n = scan.nextInt();
		else
			n = -1;		
		
		for(int i = 0; i < n; i++){
			lamp1.click();			
		}
		lamp1.stato();
	}
}
