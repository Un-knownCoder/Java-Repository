package strings;

import java.util.Scanner;

// Ricerca delle occorrenze di un carattere

public class es1_St {	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("- Inserisci una stringa");
		String s = scan.nextLine();
		
		System.out.println("- inserisci carattere");
		char c = scan.next().charAt(0);
		
		int v = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c)
				v++;
		}
		
		System.out.println("ci sono " + v + " occorrenze");
		
		scan.close();
	}
}
