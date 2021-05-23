package Condicionales;

import java.util.*;

public class Multiplo10 {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Introduzca un número");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num%10==0) {
			System.out.println("El número es múltiplo de 10");
		}else {
			System.out.println("El número no es múltiplo de 10");
		}
		
		sc.close();
	}

}
