package ArraysBidimensionales;

import java.util.*;

public class OperacionesMatrices {
	
	//Se pide que se introduzcan las dimensiones de dos matrices y sus valores y se presenta un men� con distintas operacioes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo dos martrices, matriz1 y matriz2
		
		//Voy a pedir los n�meros para rellenar las matrices por consola, por eso creo un objeto Scanner
		
		Scanner sc = new Scanner(System.in);
		//Empiezo pidiendo n�mero de filas y columnas
		
		System.out.println("Indique cuantas filas quiere que tenga la primera matriz");
		int x = sc.nextInt();
		System.out.println("Indique cuantas columnas quiere que tenga la primera matriz");
		int y = sc.nextInt();
		int[][] matriz1 = new int[x][y];
	
		System.out.println("La matriz tiene " + x + " filas " + y + " columnas " + "\n");
		
		//Pido que introduzcan los n�meros para la matriz1 por consola y los almaceno
		
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
		
		//Pido que introduzcan los n�mero para la matriz2 por consola y los almaceno
		
		for(int k=0; k<matriz2.length; k++) {
			for(int l=0; l<matriz2[0].length; l++) {
				System.out.println("Introduzca el elemento [" + k + " , " + l + "]");
				matriz2[k][l] = sc.nextInt();
			}
		}
		//Muestro las matrices introducidas utilizando el m�todo muestraMatrices (lin.60)
		System.out.println("\n" + "-- Matriz 1 -------");
		muestraMatrices(matriz1);
		System.out.println("\n");
		System.out.println("-- Matriz 2 -------");
		muestraMatrices(matriz2);
		System.out.println("\n");
		System.out.println("---------------------");
		
		//A trav�s de un men� de opciones pregunto que operaci�n quieren realizar	
		
		int opcion;							//guardo la opci�n escogida por el usuario
		boolean salir=false;				//mientras elecci�n sea falso, sigo pidiendo opci�n
		
		while(!salir) {
			
			System.out.println("Escoja una opci�n: ");
			System.out.println("1. Sumar matrices");
			System.out.println("2. Restar matrices");
			System.out.println("3. Multiplicar matrices");
			System.out.println("4. Sumar, restar y multiplicar matrices");
			System.out.println("5. Salir");
			
			opcion = sc.nextInt();	
	
			switch(opcion) {
				case 1:
					//Muestro el resultado de la suma con el m�todo sumarMatrices (lin.80)
					sumarMatrices(matriz1, matriz2);
					System.out.println("\n");
					System.out.println("---------------------" + "\n");
					break;
				case 2:
					//Muestro el resultado de la resta con el m�todo restarMatrices (lin. 116)
					restarMatrices(matriz1, matriz2);
					System.out.println("\n");
					System.out.println("---------------------" + "\n");
					break;
				case 3:
					//Muestro el resultado de la multiplicaci�n con el m�todo multiplicarMatrices (lin.153)
					multiplicarMatrices(matriz1, matriz2);
					System.out.println("\n");
					System.out.println("---------------------" + "\n");
					break;
				case 4:
					//Muestro los tres m�todos anteriores
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
					System.out.println("Aplicaci�n terminada.  Muchas gracias");
					System.out.println("-------------------------------------");
					salir=true;
					break;
				default:
					System.out.println("\n" + "Debe introducir un n�mero entre 1 y 5" + "\n");					
			}
		}
	}
		
	//M�todo que muestra las matrices rellenas
		
	public static void muestraMatrices(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			System.out.println("\n");
			for(int j=0; j<matriz[0].length; j++) {
				System.out.print(" ");
				System.out.print(matriz[i][j]);
			}
		}
	}
		
	//M�todo que suma matrices
	
	public static void sumarMatrices(int[][] m1,int[][] m2){
		//Creo que la matriz que guardar� el resultado
		int[][] suma = new int[m1.length][m2[0].length];
		
		//Compruebo si se pueden sumar: ambas matrices tienen igual n�mero de filas y columnas
		
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
	
	//M�todo que resta las matrices
		
	public static void restarMatrices(int[][] m1,int[][] m2 ) {
		
		//Creo la matriz resta que guardar� el resultado
		
		int[][] resta = new int[m1.length][m2[0].length];
		
		//Compruebo si pueden restarse: deben tener igual n�mero de filas y columnas
		
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
			
	//M�todo que multiplica Matrices
	
	public static void multiplicarMatrices(int[][] m1, int[][] m2) {
		
		//Creo la matriz que guardar� el resultado
		
		int[][] multiplicacion = new int[m1[0].length][m2.length];
		
		/*Compruebo si pueden multiplicarse: n�mero de columnas de la primera matriz debe
		 * ser igual al n�mero de filas de la segunda matriz*/
		
		if(m1[0].length == m2.length) {
			
			//Si la condici�n es cierta, ejecuto la multiplicaci�n
			
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


