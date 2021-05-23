package Iterativos;

import java.util.*;

public class CuentaAtrás {
	
	//Se introduce un número y se muestran todos los números hasta llegar a 0

	public static void main(String[] args) {
		
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		
		num = sc.nextInt();
		
		//Ejecuto la cuenta atrás con un bucle for y voy imprimiendo los números hasta llegar a 0
		
		for(int i=num; i>0; i--) {
			System.out.println(i);
		}
		
		sc.close();
		
	}

}
