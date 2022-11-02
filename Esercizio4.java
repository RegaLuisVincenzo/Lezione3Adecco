package lezione3Adecco;
/*
 * scrivi un programma
 * che legge un voto e dice se insufficente
 * o sufficente e se è insufficente distingue tra gravemente
 * insuffiente( minore o uguale )
 * o insufficiente ovvero compreso tra 4 (escluso) o 6(sufficente)
 * 
 */

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("inserisci voto");
		
		double voto=scan.nextDouble();
		
		scan.close();
		
		if ( voto==6 ){
			System.out.println("buono");
			}	
		else if(voto<=6){
			System.out.println("sufficente");
		 if(voto<=5) {
			 System.out.println(" insufficenza");
		}
		}
	}

}
