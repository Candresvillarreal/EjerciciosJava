package ArraysUnidimensionales;
import java.util.*;
public class ArraysUnidimensionales {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo un array unidimensional de n�meros
		
		int num=0;						//num guardar� la longitud del array
		
		//Creo el objeto Scanner para recoger los n�meros que se introduzca
		
		Scanner sc = new Scanner(System.in);
		
		//Pido el tama�o que tendr� el array
		
		System.out.println("-----Introduzca cuantos n�meros quiere que contenga el array-----");
		num = sc.nextInt();
		
		//Creo un array unidimensional de n�meros
		
		int [] numeros = new int[num];
		//Relleno el array con los n�meros que se introduzcan
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Introduzca el n�mero " + (i+1));
			numeros[i]=sc.nextInt();
		}
		System.out.println("\n");
		
		//Muestro los n�meros introducidos con el m�todo muestraNumeros
		muestraNumeros(numeros);
		//Busco un n�mero introducido con el m�todo buscaNumero
		buscaNumero(numeros);
		//Ordena los n�mero introducidos con el m�todo burbuja ascendente
		burbujaAscendente(numeros);
		//Busco un n�mero introducido con el m�todo busquedaBinaria
		busquedaBinaria(numeros);	
		//Ordeno los n�meros introducidos con el m�todo burbuja descendente
		burbujaDescendente(numeros);
		
		sc.close();
	}
	
	//M�todo que imprime los n�meros
	
	public static void muestraNumeros(int[] muestra) {
		System.out.println("--------- Los n�meros introducidos son: -----------" + "\n");
		for(int i=0; i<muestra.length; i++) {
			System.out.print(muestra[i] + "  ");
		}
		System.out.println("\n" + "---------------------------------------------------" +"\n");
	}
	
	//M�todo que busca un n�mero introducido por pantalla
	
	public static void buscaNumero(int[] encontrar) {
	
		int i=0;
		int buscado=0;				//Almacenar� el n�mero introducido por consola
		int contador=0;				//Sumar� los intentos de encontrar el n�mero introducido
		boolean encontrado=false;
	
		Scanner vb = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("-----Introduzca el n�mero que quiere buscar: -----" + "\n");
		buscado = vb.nextInt();
	
		for(i=0; i<encontrar.length; i++) {
			contador ++;
			if(encontrar[i] == buscado) {
				System.out.println("\n" + "Encontrado: " + buscado);
				encontrado = true;	
				System.out.println("\n" + "Se han necesitado " + contador + " intentos.");
				System.out.println("---------------------------------------------------" +"\n");
			}
		}
		System.out.println("\n");
		if(!encontrado) {
			System.out.println("\n" + "El n�mero introducido no se ha encontrado " );
			System.out.println("\n" + "Se han realizado " + contador + " b�squedas.");
			System.out.println("---------------------------------------------------" +"\n");
		}
		System.out.println("\n");
		
		vb.close();
		
	}
	
		
	
	//M�todo que busca un n�mero introducido por pantalla mediante b�squeda binaria
	
	public static void busquedaBinaria (int[] encontrar) {
		
		int indInf = 0;
		int indSup = encontrar.length-1;
		int indMed;
		int buscado = 0;
		int contador = 0;
		boolean encontrado = false;
		
		Scanner bb = new Scanner(System.in);
		System.out.println("-----Introduzca el n�mero que quiere buscar: -----" + "\n");
		buscado = bb.nextInt();
		
		while((indInf <= indSup) && (!encontrado)) {
			indMed = (indInf + indSup)/2;
			if(buscado > encontrar[indMed]) {
				indInf = indMed + 1;
			}
			else if (buscado < encontrar[indMed]) {
				indSup = indMed - 1;
			}
			else {
				encontrado=true;
			}
			
			contador++;
		}
		
		if(indInf > indSup) {
			System.out.println("\n" +"El n�mero " + buscado + " no se ha encontrado");
			System.out.println("\n" + "Se han realizado " + contador + " b�squedas." + "\n");
			System.out.println("\n" + "---------------------------------------------------" +"\n");
		}
		else {
			System.out.println("\n" + "N�mero encontrado");
			System.out.println("\n" + "Se han necesitado " + contador + " intentos" + "\n");
			System.out.println("\n" + "---------------------------------------------------" +"\n");
		}
		
		bb.close();
		
	}
	
	//Creo el m�todo burbuja para ordenar los n�meros introducidos en orden ascendente
	
	public static void burbujaAscendente (int[] ordenaA) {
		int i, j, temp;
		
		for(i=0; i<ordenaA.length-1; i++) {
			for(j=0; j<ordenaA.length-i-1; j++) {
				if(ordenaA[j+1]<ordenaA[j]) {
					temp=ordenaA[j+1];
					ordenaA[j+1]=ordenaA[j];
					ordenaA[j]=temp;
				}
			}
		}
		System.out.println("Estos son los n�meros ordenados de forma ascendente: " + "\n");
		for(i=0; i<ordenaA.length; i++) {
			System.out.print("  " + ordenaA[i]);
		}
		System.out.println("\n" + "---------------------------------------------------" +"\n");
	}
	
	//M�todo burbuja en orden descendente (es igual, s�lo cambia la condici�n del if)
	
	public static void burbujaDescendente (int[] ordenaD) {
		int i, j, temp;
		for(i=0; i<ordenaD.length-1; i++) {
			for(j=0; j<ordenaD.length-i-1; j++) {
				if(ordenaD[j+1]>ordenaD[j]) {
					temp=ordenaD[j+1];
					ordenaD[j+1]=ordenaD[j];
					ordenaD[j]=temp;
				}
			}
		}
		System.out.println("\n" + "Estos son los n�meros ordenados de forma descendente: " + "\n");
		for(i=0; i<ordenaD.length; i++) {
			System.out.print("  " + ordenaD[i]);
		}
		System.out.println("\n" + "---------------------------------------------------" +"\n");
		
	}
	
}
