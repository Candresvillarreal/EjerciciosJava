package Selectivos;

import java.util.*;

public class DobleTriple {
	
	//Se pide un n�mero y se muestra su doble y su triple

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un n�mero: ");
		num = sc.nextInt();
		
		System.out.println("Doble de " + num + " -> " + (2*num));
		System.out.println("Triple de " + num + " -> " + (3*num));
		
		sc.close();
	}

}
