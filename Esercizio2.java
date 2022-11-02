package lezione3Adecco;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * creare un programma 3 numeri input 
		 * stampa si 
		 * se tutti i 3 numeri sono multipi di 5
		 * 
		 * 10 20 30 ->si
		 * 10 10 1 ->no
		 * 
		 */
		Scanner key=new Scanner(System.in);
		System.out.println("INSERIRE I 3 NUMERI ");
		int primo=key.nextInt() , secondo=key.nextInt(), terzo=key.nextInt();
		
		if(primo%5==0 && secondo %5==0 && terzo %5==0) {
			System.out.println("ok");	
		}
		else {
			System.out.println("no");
		}
		key.close();
		/*
		String ris =( primo%5==0 && secondo %5==0 && terzo %5==0)? "ok":"no";
		System.out.println(ris);
		*/

	}

}
