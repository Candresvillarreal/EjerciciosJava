package ArraysUnidimensionales;

public class CopiaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo dos arrays que luego copiaré en un tercer array
		
		double[] array1 = new double[5];
		double[] array2 = new double[10];
		double[] copia = new double[array1.length+array2.length];
		
		//Relleno el array 1 utilizando un bucle for:
		
		for(int i=0; i<array1.length; i++) {
			array1[i]=i;
		}
		
		//Relleno el array2 utilizando un bucle for y Math.random():
		
		for(int i=0; i<array2.length; i++) {
			array2[i]=Math.random();
		}
		
		//Copio el contenido de array1 y array2 en copia:
		//Al copiar array2, no empezamos en la posición 0 de copia sino a continuación del último elemnento
		// de array1, por eso indico array1.lenght en lugar de 0 (como aparece al copiar array1
		
		System.arraycopy(array1, 0, copia, 0, array1.length);
		System.arraycopy(array2, 0, copia, array1.length, array2.length);
		
		//Muestro el resultado por consola:
		
		System.out.println("\nArray1");
		for(int i=0; i<array1.length; i++) {
			System.out.println(i + " - " + array1[i]);
		}
		
		System.out.println("\nArray2");
		for(int i=0; i<array2.length; i++) {
			System.out.println(i + " - " + array2[i]);
		}
		
		System.out.println("\nCopia");
		for(int i=0; i<copia.length; i++) {
			System.out.println(i + " - " + copia[i]);
		}
		

	}

}
