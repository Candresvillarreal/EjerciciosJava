package Selectivos;

import java.util.*;

public class CifrasSeparadas {
	
	//Se pide un número de tres cifras y se muestra cada una de sus cifras

	public static void main(String[] args) {
		
		int num;
		int primera;
		int segunda;
		int tercera;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número de 3 cifras");
		num = sc.nextInt();
		
		//Primera cifra 
		
		primera = num / 100;
		segunda = (num/10)%10;
		tercera = (num%10);
		
		System.out.println("Primera cifra: " + primera);
		System.out.println("segunda cifra: " + segunda);
		System.out.println("Tercera cifra: " + tercera);
		
		sc.close();

	}

}
