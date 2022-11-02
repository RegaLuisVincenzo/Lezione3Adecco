package lezione3Adecco;

import java.util.Scanner;


public class Starter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * operatori incontrati
		 * +  -  *  /
		 * 
		 * oggi andremo ad incontrare la percentuale "%"
		 * 
		 */
		//abbiamo anche l'operatore del resto o Modulo"%"
		/*
		 * esempio:
		 * 10% 2==> 0 risultato
		 * % modulo è il resto della divisione 
		 * 
		 * 10 : 2 = 5 con resto ==> 0 ( esso è il modulo)
		 * 
		 * 10%3 ==> 10 : 3= 3 con resto 1
		 */
		/*
		 * all'intero di esso abbiamo dei cronfonti 
		 * 
		 * <
		 * <
		 * <=
		 * >=
		 * == uguale confronto 
		 * 
		 */
		
		Scanner numero= new Scanner(System.in);
		System.err.println("INSERISCI DUE NUMERI ");
		
		//PRIMO ESEMPIO
		
		int n1=numero.nextInt(), n2=numero.nextInt();
		/*
		if(n1 == n2){
			System.out.println("il numero è uguale ");
			
		}		
		else {
			System.err.println("il numero è diverso");
		}
		*/
		
		// SECONDO ESEMPIO
		 String ris =n1==n2?"Sono Uguali": " Sono Diversi";
		 
		 System.out.println(ris);
		
		numero.close();
	}

}
