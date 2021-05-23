package ArraysBidimensionales;

import java.util.*;

public class OperacionesMatrices {
	
	//Se pide que se introduzcan las dimensiones de dos matrices y sus valores y se presenta un menú con distintas operacioes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo dos martrices, matriz1 y matriz2
		
		//Voy a pedir los números para rellenar las matrices por consola, por eso creo un objeto Scanner
		
		Scanner sc = new Scanner(System.in);
		//Empiezo pidiendo número de filas y columnas
		
		System.out.println("Indique cuantas filas quiere que tenga la primera matriz");
		int x = sc.nextInt();
		System.out.println("Indique cuantas columnas quiere que tenga la primera matriz");
		int y = sc.nextInt();
		int[][] matriz1 = new int[x][y];
	
		System.out.println("La matriz tiene " + x + " filas " + y + " columnas " + "\n");
		
		//Pido que introduzcan los números para la matriz1 por consola y los almaceno
		
		for(int i=0; i<matriz1.length; i++) {
			for(int j=0; j<matriz1[0].length; j++) {
				System.out.println("Introduczca el elemento [" + i + " , " + j + "]");
				matriz1[i][j] = sc.nextInt();
			}	
		}
		
		//Pido filas y columnas de la segunda matriz
		
		System.out.println("Indique cuantas filas quiere que tenga la segunda matriz");
		int w = sc.nextInt();
		System.out.println("Indique cuantas columnas quiere que tenga la segunda matriz");
		int z = sc.nextInt();
		int[][] matriz2 = new int[w][z];
		System.out.println("La matriz tiene "+ w + " filas " + z + " columnas" + "\n");
		
		//Pido que introduzcan los número para la matriz2 por consola y los almaceno
		
		for(int k=0; k<matriz2.length; k++) {
			for(int l=0; l<matriz2[0].length; l++) {
				System.out.println("Introduzca el elemento [" + k + " , " + l + "]");
				matriz2[k][l] = sc.nextInt();
			}
		}
		//Muestro las matrices introducidas utilizando el método muestraMatrices (lin.60)
		System.out.println("\n" + "-- Matriz 1 -------");
		muestraMatrices(matriz1);
		System.out.println("\n");
		System.out.println("-- Matriz 2 -------");
		muestraMatrices(matriz2);
		System.out.println("\n");
		System.out.println("---------------------");
		
		//A través de un menú de opciones pregunto que operación quieren realizar	
		
		int opcion;							//guardo la opción escogida por el usuario
		boolean salir=false;				//mientras elección sea falso, sigo pidiendo opción
		
		while(!salir) {
			
			System.out.println("Escoja una opción: ");
			System.out.println("1. Sumar matrices");
			System.out.println("2. Restar matrices");
			System.out.println("3. Multiplicar matrices");
			System.out.println("4. Sumar, restar y multiplicar matrices");
			System.out.println("5. Salir");
			
			opcion = sc.nextInt();	
	
			switch(opcion) {
				case 1:
					//Muestro el resultado de la suma con el método sumarMatrices (lin.80)
					sumarMatrices(matriz1, matriz2);
					System.out.println("\n");
					System.out.println("---------------------" + "\n");
					break;
				case 2:
					//Muestro el resultado de la resta con el método restarMatrices (lin. 116)
					restarMatrices(matriz1, matriz2);
					System.out.println("\n");
					System.out.println("---------------------" + "\n");
					break;
				case 3:
					//Muestro el resultado de la multiplicación con el método multiplicarMatrices (lin.153)
					multiplicarMatrices(matriz1, matriz2);
					System.out.println("\n");
					System.out.println("---------------------" + "\n");
					break;
				case 4:
					//Muestro los tres métodos anteriores
					sumarMatrices(matriz1, matriz2);
					System.out.println("\n");
					System.out.println("---------------------" + "\n");
					restarMatrices(matriz1, matriz2);
					System.out.println("\n");
					System.out.println("---------------------" + "\n");;
					multiplicarMatrices(matriz1, matriz2);
					System.out.println("\n");
					System.out.println("---------------------" + "\n");
					break;
				case 5:
					System.out.println("-------------------------------------");
					System.out.println("Aplicación terminada.  Muchas gracias");
					System.out.println("-------------------------------------");
					salir=true;
					break;
				default:
					System.out.println("\n" + "Debe introducir un número entre 1 y 5" + "\n");					
			}
		}
	}
		
	//Método que muestra las matrices rellenas
		
	public static void muestraMatrices(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			System.out.println("\n");
			for(int j=0; j<matriz[0].length; j++) {
				System.out.print(" ");
				System.out.print(matriz[i][j]);
			}
		}
	}
		
	//Método que suma matrices
	
	public static void sumarMatrices(int[][] m1,int[][] m2){
		//Creo que la matriz que guardará el resultado
		int[][] suma = new int[m1.length][m2[0].length];
		
		//Compruebo si se pueden sumar: ambas matrices tienen igual número de filas y columnas
		
		if((m1.length == m2.length) && (m1[0].length == m2[0].length)) {
			
			// Si pueden sumarse, ejecuto la suma
			
			for(int i=0; i<m1.length; i++) {
				for(int j=0; j<m1[0].length; j++) {
					suma[i][j] = m1[i][j]+m2[i][j];
				}
			}
			
			//e imprimo el resultado
			System.out.println("\n" + "-- Suma ------------");
			for(int i=0; i<suma.length; i++) {
				System.out.println("\n");
				for(int j=0; j<suma[0].length; j++) {
					System.out.print(" ");
					System.out.print(suma[i][j]);
				}
			}
			
			
			
		}else {
			System.out.println("Las matrices no pueden sumarse");
		}
			
	}
	
	//Método que resta las matrices
		
	public static void restarMatrices(int[][] m1,int[][] m2 ) {
		
		//Creo la matriz resta que guardará el resultado
		
		int[][] resta = new int[m1.length][m2[0].length];
		
		//Compruebo si pueden restarse: deben tener igual número de filas y columnas
		
		if((m1.length == m2.length) && m1[0].length == m2[0].length) {
			
			//Si la condicion es cierta, ejecuto la resta
			
			for(int i=0; i<m1.length; i++) {
				for(int j=0; j<m1[0].length; j++) {
					resta[i][j]=m1[i][j]-m2[i][j];
				}
			}
			
			//e imprimo el resultado
			
			System.out.println("\n" + "-- Resta -----------");
			for(int i=0; i<resta.length; i++) {
				System.out.println("\n");
				for(int j=0; j<resta[0].length; j++) {
					System.out.print(" ");
					System.out.print(resta[i][j]);
				}
			}
		}else {
			System.out.println("Las matrices no pueden restarse");
		}
	}
			
	//Método que multiplica Matrices
	
	public static void multiplicarMatrices(int[][] m1, int[][] m2) {
		
		//Creo la matriz que guardará el resultado
		
		int[][] multiplicacion = new int[m1[0].length][m2.length];
		
		/*Compruebo si pueden multiplicarse: número de columnas de la primera matriz debe
		 * ser igual al número de filas de la segunda matriz*/
		
		if(m1[0].length == m2.length) {
			
			//Si la condición es cierta, ejecuto la multiplicación
			
			for(int i=0; i<m1.length; i++) {
				for(int j=0; j<m2[0].length; j++) {
					for(int k=0; k<m1[0].length; k++) {
						multiplicacion[i][j] += m1[i][k]*m2[k][j];
					}
				}
			}
			
			// imprimo el resultado
			
			System.out.println("\n" + "-- Multiplicacion --");
			for(int i=0; i<multiplicacion.length; i++) {
				System.out.println("\n");
				for(int j=0; j<multiplicacion[0].length; j++) {
					System.out.print(" ");
					System.out.print(multiplicacion[i][j]);
				}
			}
		}else {
			System.out.println("Las matrices no pueden multiplicarse");
		}
	}		
}


