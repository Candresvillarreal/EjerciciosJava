package Iterativos;

import java.util.Scanner;

public class TresNumeros {
	
	//Se introducen tres n�meros, comprobando que son distintos entre ellos, y se muestra el mayor de los tres
	
	public static void main(String[] args) {
	
	int num1, num2, num3, mayor;
	Scanner sc = new Scanner(System.in);
	
		do {
			System.out.println("Introduzca un n�mero");
			num1 =  sc.nextInt();
			System.out.println("Introduzca otro n�mero");
			num2 = sc.nextInt();
			System.out.println("Introduzca otro n�mero");
			num3 = sc.nextInt();
			if(num1==num2 || num1==num3 || num2==num3) {
			System.out.println("Debe introducir tres n�meros distitnos");	
			}
		}while(num1==num2 || num1==num3 || num2==num3); 
		
		
		if(num1>num2) {
			mayor = num1;
		}else {
			mayor = num2;
		}
		
		if(num3>mayor) {
			System.out.println(num3 + " es el n�mero mayor de los tres introducidos");
		}else {
			System.out.println(mayor + " es el n�mero mayor de los tres introducidos");
		}
		
		sc.close();
		
	}
}
