package lezione3Adecco;

import java.util.Scanner;


public class Starte4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// adesso andremo ad aggiungere AND LOGICO ---> &&
		//adesso andremo ad aggiungere OR LOGICO ---> ||
		//adesso andremo ad aggiungere not NEGAZIONE --> !
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * NOT
		 * 
		 * !(5>1 && 10>6)
		 * !( t&&t )--> !(t -- false
		 * if !(n1%n2==0) ! NEGATIVA
		 * INF(NUMERO1%2 !=0) DIVERSO
		 * 
		 * IF(!IS sUNNY){ JABDSJSH} // andiamo a indicare che non è soleggiato
		 * 
		 * )
		 */
		
		Scanner numeri=new Scanner(System.in);
		
		
		System.err.println("INSERISCI NUMERI");
		int a=numeri.nextInt();
		System.err.println("INSERISCI NUMERI");
		int b=numeri.nextInt();
		System.err.println("INSERISCI NUMERI");
		int c=numeri.nextInt();
		
		//ALL'INTERNO DEL System
		/*--AND LONG--System.out.println((n1==n2)&&(n2==n3));
		 *--OR LONG-- System.out.println((n1>=n2)||(n2==n3));
		*/
		
		// ALL'INTERNO DEL "if"
		/*if(a==b&&a==c){
			System.out.println("sono uguali");
		}
		else {
			System.out.println("sono divesri");
		}
		*/
		
		//ALL'INTERNO DEL STRIng
		 String ris=(a==b&&a==c)?"true":"false";
		 System.out.println(ris);
		numeri.close();
		
	}

}
