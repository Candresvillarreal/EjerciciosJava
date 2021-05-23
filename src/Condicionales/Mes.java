package Condicionales;

import java.util.*;

public class Mes {
	
	//Se introduce el n�mero de un mes y se muestra el nombre del mes y el n�mero de d�as que tiene este mes

	public static void main(String[] args) {
		
		int mes;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Introduzca el n�mero del mes: ");
		
		mes = sc.nextInt();
		//Compruebo que el mes introducido corresponde a un n�mero entre el 1 y el 12
		
		}while(mes<0 || mes>12);
		
		switch(mes){
			
			case 1:
				System.out.print("Enero");
				break;
			case 2:
				System.out.print("Febrero");
				break;
			case 3:
				System.out.print("Marzo");
				break;
			case 4:
				System.out.print("Abril");
				break;
			case 5:
				System.out.print("Mayo");
				break;
			case 6: 
				System.out.print("Junio");
				break;
			case 7:
				System.out.print("Julio");
				break;
			case 8:
				System.out.print("Agosto");
				break;
			case 9:
				System.out.print("Septiembre");
				break;
			case 10:
				System.out.print("Octubre");
				break;
			case 11:
				System.out.print("Noviembre");
				break;
			case 12:
				System.out.print("Diciembre");
				break;
		}
		
		if(mes ==4 || mes == 6 || mes ==11) {
			System.out.println(" , es un mes de 30 d�as");
		}else if(mes == 2) {
			System.out.println(" , es un mes de 28 d�as");
		}else {
			System.out.println(" , es un mes de 31 d�as");
		}
		
		sc.close();

	}

}
