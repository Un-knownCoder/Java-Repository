package strings;

import java.util.Scanner;

//rimpiazza i caratteri

public class Es3_St {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();

		char a = scan.next().charAt(0);
		char b = scan.next().charAt(0);
		
		s = s.replace(a, b);
		
		System.out.println(s);
	}
}
