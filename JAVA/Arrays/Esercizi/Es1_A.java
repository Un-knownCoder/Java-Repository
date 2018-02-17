package arrays;

import java.util.Scanner;

// This will read an Array from a String and it will print it

public class Es1_A {
	static Scanner scan = new Scanner(System.in);
	
	//-- MAIN ----------------------------------
	public static void main(String[] args) {
		int[] array = readArray();
		printArray(array);
	}
	//------------------------------------------
	
	static int[] readArray() {
		System.out.println("Inserisci una serie di numeri seperati da uno SPAZIO");
		String str = scan.nextLine();
		
		String[] raw = str.split(" ");
		int[] array = new int[raw.length];
		
		for (int i = 0; i < raw.length; i++) {
			array[i] = Integer.parseInt(raw[i]);
		}
		
		return array;
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
