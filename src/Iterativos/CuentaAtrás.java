package Iterativos;

import java.util.*;

public class CuentaAtr�s {
	
	//Se introduce un n�mero y se muestran todos los n�meros hasta llegar a 0

	public static void main(String[] args) {
		
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero");
		
		num = sc.nextInt();
		
		//Ejecuto la cuenta atr�s con un bucle for y voy imprimiendo los n�meros hasta llegar a 0
		
		for(int i=num; i>0; i--) {
			System.out.println(i);
		}
		
		sc.close();
		
	}

}
