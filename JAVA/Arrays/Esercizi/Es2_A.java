package arrays;

import java.util.Scanner;

// Somma due Array in un terzo, secondo una determinata procedura

public class Es2_A {
	
	static Scanner scan = new Scanner(System.in);
	
	//-- MAIN ----------------------------------
	public static void main(String[] args) {
		int[] temp1 = fillArray(5);
		int[] temp2 = fillArray(5);
		int[] array = new int[temp1.length + temp2.length]; 
		
		for (int i = 0; i < array.length - 1; i+=2) {
			array[i] = temp1[i/2];
			array[i + 1] = temp2[i/2];
		}
		int a = 1 > 2 ? 2 : 3;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	//------------------------------------------
	
	static int[] fillArray(int N) {
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.ceil(Math.random() * 99);
		}
		
		return arr;
	}
}
