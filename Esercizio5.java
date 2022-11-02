package lezione3Adecco;

import java.util.Scanner;

/*
 * 
 * inserisci 3 numeri A, B e C
 * dire se B è compreso tra A e C
 * 
 * 
 * es:10 20 30 -->si
 * 
 * 
 * 
 */

public class Esercizio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("INSERISCI 3 NUMERI");
		
		int n1=scan.nextInt(),n2=scan.nextInt(),n3=scan.nextInt();
		
		scan.close();
		
		if(n1==n2&&n2==n3)
			System.out.println("Tutti i numeri sono uguali");	
		
		if (n2>n1&&n2<n3) {
			System.out.println("il numero " +n2+ " è compreso tra "+n1+" e "+n3);
		}
		else {
			System.out.println("non  è compreso");
		}
		

	}	

}		
