package Rettangolo;
import java.util.Scanner;
public class TestRettangolo {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("digita: [C]erchio, [Q]uadrato, [R]ettatngolo, a seconda della scelta");
		String scelta=input.nextLine();
		
		switch (scelta.charAt(0)){
		
		case 'C':Cerchio a=new Cerchio(); 
				System.out.println("inserisci il raggio");
				int rg=input.nextInt(); 
				a.Ridimensiona(rg);
				System.out.println("l'area del cerchio è: "+a.Area());
				System.out.println("il perimetro del cerchio è: "+a.Perimetro());
				break;
				
		case 'Q':Quadrato q1=new Quadrato();
				System.out.println("inserisci il lato del quadrato");
				int qd=input.nextInt();
				q1.Ridimensiona(qd);
				System.out.println("Perimetro del quadrato è: "+q1.Perimetro());
				System.out.println("l'area del quadrato è: "+q1.Area());
				break;
				
		case 'R':Rettangolo r1=new Rettangolo();
				System.out.println("Inserisci Base e Altezza");
				int br=input.nextInt(), ar=input.nextInt();
				r1.Ridimensiona(br,ar);
				System.out.println("Perimetro del rettangolo è: "+r1.Perimetro());
				break;
				
		default: System.out.println("Error");
		}

	}
}
