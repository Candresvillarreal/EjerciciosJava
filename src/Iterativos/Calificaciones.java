package Iterativos;

import java.util.*;

public class Calificaciones {
	
	//Se introduce una nota y se muestra su calificación

	public static void main(String[] args) {
		
		int nota;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Introduzca la nota:");
		
		nota = sc.nextInt();
		}while(nota<0 || nota>10);  //Se repiten las instrucciones mientras la nota sea menor O mayor que cero
		
		switch (nota){
		
			case 1: 
				System.out.println("Insuficiente");
				break;
			case 2:
				System.out.println("Insuficiente");
				break;
			case 3:
				System.out.println("Insuficiente");
				break;
			case 4:
				System.out.println("Regular");
				break;
			case 5:
				System.out.println("Regular");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
				System.out.println("Notable");
				break;
			case 8:
				System.out.println("Notable");
				break;
			case 9:
				System.out.println("Excelente");
				break;
			case 10:
				System.out.println("Excelente");
				break;			
		}
		
		sc.close();
	
	}

}
