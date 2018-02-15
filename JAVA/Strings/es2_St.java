package strings;

import java.util.Scanner;

// controlla se una parola è palindroma

public class es2_St {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci una parola: ");
		String parola = scan.next();
		
		boolean b = true;
		
		for(int i = 0; i < parola.length() / 2; i++) {
			if(parola.charAt(i) != parola.charAt(parola.length() - i - 1)) {
				b = false;
			}
		}
		
		if(b == true)
			System.out.println("Palindroma");
		else
			System.out.println("Non palindroma");
	}
}