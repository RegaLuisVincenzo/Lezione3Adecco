package lezione3Adecco;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 *  due numeri di tipo int 
		 *  dire se il 2 secondo numero è il divisore del pimo numero 
		 *  
		 *  10 e 2-->ok
		 *  3 e 2-->no
		 *  bisogno del modulo
		 */
		
		
		Scanner numero=new Scanner(System.in);
		System.err.println("inserire il numero");
		int numb1=numero.nextInt(), numb2=numero.nextInt();
		
		String ris =(numb2 % numb1 !=0)?"ok":"no";
		System.out.println(ris);
		
		numero.close();
		
		/*
		Scanner numero=new Scanner(System.in);
		System.err.println("inserire il numero");
		int numb1=numero.nextInt(), numb2=numero.nextInt();
		
		if(numb1%numb2 ==0) {
		System.out.println("ok");
		}
		else {
			System.out.println("no");
		}
		numero.close();
		*/
	}

}
