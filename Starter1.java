package lezione3Adecco;

import java.util.Scanner;

public class Starter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if(condizionebooleana){
		 * //istruzione1
		 * //istruzione2
		 * //istruzione3
		 * 
		 */
		/*
		 * 
		 * creare un programma che prenda in input  un numero intero(int)
		 * da tastiera
		 * il programma stampa il video se la persona può peeseguire la patente(18)
		 */
		
		Scanner eta = new Scanner(System.in) ;
			System.out.println("Quanti  anni hai");
			int n1= eta.nextInt();
			
			if(n1>=18){
				System.out.println("puoi prendere la patente?");
				int vecchio = n1;
				System.out.println("Hai "+ vecchio+"  anni , occhio che ti mettono dentro ");
			
			}
			else {
				System.err.println("non puoi prendere la pantente");
				System.out.println("Ti mancono ancora "+(18-n1)+" anni per prendere la patente");
				
				// potevi anche scrivere ;
				// int anniMancanti =18-n1
				// System.out.println("Ti mancono ancora " anniMancanti+" anni per prendere la patente");
				
				eta.close();
				
			}
		}
		
	}


