package ArraysUnidimensionales;

import java.util.*;

public class Burbuja2 {
	
	//Ordenación Burbuja, pero en este caso pido por consola los números del array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primero pido por consola la longitud y los números del array
		//Declaro las variables que necesito
		
		int num;
		
		//creo el objeto scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el tamaño del array: ");
		num=sc.nextInt();   										//Guardo en num el número introducido por consola
		
		//creo el array que tendrá el tamaño de num que he guardado
		
		int[] array = new int[num];
		
		//creo un bucle for para ir rellenando el array con los números que se vayan introduciendo por pantalla
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Introduce un número para el elemento " + (i+1) + ".");	//Pido un número
			array[i]=sc.nextInt();														//Guardo el número en el array
		}
		System.out.println("-----------Este es el array introducido sin ordenar-----------------");
		muestraArray(array);															//Llamo al método creado para mostrar el array
		
		System.out.println("Quiere ordenar los números introducidos? S / N ");
		Scanner sc2 = new Scanner(System.in);											//Creo un nuevo escaner
		
		String opcion=sc2.nextLine();													//Creo una nueva variable
		//Si la opcion es no, termina el programa (else)
		//Si la opcion es si, llamo al método ordenaBurbuja (creado al final).  (if)
		
		if(opcion.equalsIgnoreCase("S")) {
			System.out.println("---------Este es el array ordenado---------------");
			ordenaBurbuja(array);													//Primero lo ordena
			muestraArray(array);													//Segundo lo muestro
		}
		else
			System.out.println("Ejecución terminda. Muchas gracias");			
		
	}



		//Creo un método para mostrar el array que se introduce

	static void muestraArray(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.println("Elemento " + (i+1) + ": "+ array[i]);
		}
	}
	
		// Creo el método ordernaBurbuja
	
	static void ordenaBurbuja(int array[]) {
		int i, j, temp;
		
		for(i=0; i<array.length-1; i++) {
			for(j=0; j<array.length-i-1; j++) {
				if(array[j+1]<array[j]) {
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
		
	}
}