package lezione3Adecco;

import java.util.Scanner;

public class Starter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//INSERISCI UN NUMERO INTERO
		  
		Scanner key=new Scanner(System.in);
		System.out.println("INSERISCI NUMERO ");
		int numero=key.nextInt();
		
		// DICHIARI SE è PARI O DISPARI
		 
		-primo metodo--String ris=(numero% 2==0)? "pari":"dispari";
		-secondo metodo--String ris=(numero% 2!=0)? "pari":"dispari";
		System.out.println(ris);
		key.close();
		*/
		
		Scanner key=new Scanner(System.in);
		System.out.println("INSERISCI NUMERO ");
		int numero=key.nextInt();
		
		if(numero% 2==0) {
			System.out.println("il numero"+numero+"è pari");	
		}
		else {
			System.out.println("il numero"+numero+"è dispari");
		}
		key.close();
	}

}
