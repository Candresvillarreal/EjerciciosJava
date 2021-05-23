package Iterativos;

import java.util.Scanner;

public class TresNumeros {
	
	//Se introducen tres números, comprobando que son distintos entre ellos, y se muestra el mayor de los tres
	
	public static void main(String[] args) {
	
	int num1, num2, num3, mayor;
	Scanner sc = new Scanner(System.in);
	
		do {
			System.out.println("Introduzca un número");
			num1 =  sc.nextInt();
			System.out.println("Introduzca otro número");
			num2 = sc.nextInt();
			System.out.println("Introduzca otro número");
			num3 = sc.nextInt();
			if(num1==num2 || num1==num3 || num2==num3) {
			System.out.println("Debe introducir tres números distitnos");	
			}
		}while(num1==num2 || num1==num3 || num2==num3); 
		
		
		if(num1>num2) {
			mayor = num1;
		}else {
			mayor = num2;
		}
		
		if(num3>mayor) {
			System.out.println(num3 + " es el número mayor de los tres introducidos");
		}else {
			System.out.println(mayor + " es el número mayor de los tres introducidos");
		}
		
		sc.close();
		
	}
}
