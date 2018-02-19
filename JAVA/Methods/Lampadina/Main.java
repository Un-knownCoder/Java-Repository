package Lampadina;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Switch sw1 = new Switch(5);
		
		Scanner scan = new Scanner(System.in);
    		int n;
		if(scan.hasNextInt())
			n = scan.nextInt();
		else
			n = -1;		
		
		for(int i = 0; i < n; i++){
			sw1.click();			
		}
	}
}
