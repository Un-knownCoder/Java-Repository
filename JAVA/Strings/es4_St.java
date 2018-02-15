package strings;

import java.util.Scanner;

//controlla se una stringa ne contiene un'altra

public class es4_St {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		String s2 = scan.next();
		
		if(control(s,s2))
			System.out.println("Contenuta");
		else
			System.out.println("Non contenuta");
		
		/*if(s.contains(s2))
			System.out.println("Contenuta");
		else
			System.out.println("Non contenuta");*/
		
		scan.close();
	}
	
	static boolean control(String s , String s2) {
		
		int n = s.length();
		int n2 = s2.length();
		
		for(int i = 0; i <= n - n2; i++) {
			if(s.substring(i, i + n2).equals(s2)) {
				return true;
			}
		}
		
		return false;
	}
}