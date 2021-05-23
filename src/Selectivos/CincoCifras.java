package Selectivos;

import java.util.*;

public class CincoCifras {
	
	//Se pide un número de 5 cifras y se muestra el número y se le va quitando una cifra y mostrando

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduzca un número de 5 cifras");
			num = sc.nextInt();
		}while(num<10000 || num>99999);
		
		System.out.println(num/10000);
		System.out.println(num/1000);
		System.out.println(num/100);
		System.out.println(num/10);
		System.out.println(num);
		
		sc.close();

	}

}
