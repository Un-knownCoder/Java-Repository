public class bin{
	public static void main(String[] args) {

		int[] m = new int[100000000];

		for(int i = 0; i < m.length; i++) {
			m[i] = i+1;
		}

		// ricerca sequenziale

		int inizio = 0;
		int fine = m.length - 1;
		int centro = (inizio + fine) / 2;
		int key = 13453456;

		while(key != m[centro]) {
			if(key > m[centro]) {
				inizio = centro;
				centro = (inizio + fine) / 2;
			}else if(key < m[centro]){
				fine = centro;
				centro = (inizio + fine) / 2;
			}

			if(key > m[m.length - 1] && key != m[m.length - 1]) {
				System.out.println("Non c'è");
				break;
			}else if(key == m[m.length - 1]){
				centro = m[m.length - 1];
				break;
			}
			System.out.println("C: " + centro + "	| I: " + inizio + "	| F: " + fine);
		}

		System.out.println("il tuo numero era in posizione: " + centro);
	}
}
