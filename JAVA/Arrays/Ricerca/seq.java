public class seq {

	public static void main(String[] args) {
		int[] m = new int[100000000];

		for(int i = 0; i < m.length; i++) {
			m[i] = i;
		}

		// ricerca sequenziale
		int key = 9989999;
		boolean b = false;

		for(int i = 0; i < m.length; i++) {
			if(m[i] == key) {
				b = true;
				break;
			}else {
				System.out.println(m[i]);
			}
		}

		if(b) {
			System.out.println("Trovato");
		}else {
			System.out.println("Non c'è");
		}

		// ricerca sequenziale
	}

}
