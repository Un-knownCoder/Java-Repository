package arrays;

public class Es4_A {
	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 5, 3, 6, 6, 8};
		String num = check(arr); // Questo ritorna solo un valore tra quelli ripetuti (se ce ne sono)
		
		System.out.println(num);
	}
	
	static String check(int[] array) {
		array = bubbleSort(array);
		
		for(int i = 0; i < array.length - 2; i++) {
			if(array[i] == array[i + 1] && array[i] == array[i + 2])
				return array[i] + "";
		}
		return null;
	}
	
	static int[] bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
    }
}
