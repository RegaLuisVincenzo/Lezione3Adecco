package lezione3Adecco;
/*
 * 
 * creare un programma che 
 * stampa tutti i numeri 
 * compresi tra 20 e 60 
 * estrimi inclusi
 * 
 * 
 */

public class Esercizio7Cicli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///--ESERCIZIO1--
		
		/*
		//PARTIAMO DAL NUMERO VENTI E ARRIVIAMO AL 60 
		int index = 20;
		while(index<=60) 
		//I NUMERI SELEZIONATI LI METTIAMO IN ORDINE 
		{
			System.out.print(index + " ");
			index+=1;
			if(index % 10==0) {
			System.out.println("");	}
		}
		*/
		
		///--ESERCIZIO 2--
		
		// IMPOSTA UN CONTO A ROVESCIA MINUTI
		int index = 20;
		int cont=0 ;
		while(index<=60) {
			System.out.print(index + "  ");
			index++;// aumentare il ripetere dell'index
			
			//--------------ESEMPIO1
			/*
			//CON "if(cont % 5==0" DICHIARIAMO DI RIPETERLO OGNI 5 VOLTE
			if(cont % 5==0) {
			System.out.println("");	}
			*/
			
			
			
			/*
			//--------------ESEMPIO 2
			
			// dichiariamo di contare ogni 5 volte 
			if (cont==5) {
				System.out.println();
				cont=0;// per poi ritornare sempre a zero
			}
			*/
			
			//-------------ESEMPIO 3
			// dichiariamo di contare ogni 5 volte 
			cont++; // questo va a sostituire "index ++;"
			
			if (cont == 5) {
				System.out.println();
				cont=0;// per poi ritornare sempre a zero
			}
			
		}
		System.out.println("fine");
	}

}
