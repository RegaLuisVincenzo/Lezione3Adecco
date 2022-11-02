package lezione3Adecco;
/*
 * CReare un programma 
 * che prenda in ingresso 
 * 3 interi e ritorna
 * 
 */

import java.util.Scanner;

public class Esercizio3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner key=new Scanner(System.in);
		System.err.println("INSERISCI 3 NUMERI");
		int n1=key.nextInt(),n2=key.nextInt(),n3=key.nextInt();
		
		if(n1==n2&&n2==n3)
		System.out.println("i numeri sono uguali "); 
		 
	    if(n1>=n2&&n1>=n3){
			System.out.println("Numero MAggiore"+n1);
		}
		else if(n2>=n1&&n2>=n3){
			System.out.println("Numero MAggiore"+n2);	
		}
		else if(n3>=n1&&n3>=n1) {
			System.out.println("Numero MAggiore"+n3);		
		}
		
		
		key.close();
		*/
		
	
		Scanner scan = new Scanner(System.in);

		System.out.println("caccia 3 numeri: ");
		int primoNumero = scan.nextInt();
		int seccondoNumero = scan.nextInt();
		int terzoNumero = scan.nextInt();
		scan.close();

		int bigG = primoNumero;

		// verifica se sono uguali 
		if (bigG == seccondoNumero && bigG == terzoNumero) {
			System.out.println("Sono uguali!!");
		} else {
			// trovare piu grande
			if (bigG < seccondoNumero)
				bigG = seccondoNumero;
			
			if (terzoNumero > bigG)
				bigG = terzoNumero;
			
			System.out.println("il piu grande e: " + bigG);
			scan.close();
	}

}
}
