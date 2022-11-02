package lezione3Adecco;

import java.util.Scanner;

public class Starter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * // TESTO
		 * 
		 * PREDNER  3 NUMERI DI TIPO INTERO 
		 * STABILI I 3 NUMERI SONO UGUALI 
		 * 
		 * 
		 */
		
		Scanner numeri=new Scanner(System.in);
		System.err.println("Confronta 3 numeri e controlla se sono uguali ");
		
		int n1=numeri.nextInt(), n2=numeri.nextInt(), n3=numeri.nextInt();
		
		if(n1 == n2){
			System.out.println("hai inserito "+n1+" ,"+n2+ " e "+n3);
			
			if (n2==n3){
				System.out.println("i 3 numeri sono uguali ");
			}
		}		
		else {
			System.err.println("il numero è diverso");
			
		}
	
	
		
		
		 numeri.close();

	}

}
