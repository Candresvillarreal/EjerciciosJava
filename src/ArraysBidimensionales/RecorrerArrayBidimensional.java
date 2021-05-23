package ArraysBidimensionales;

public class RecorrerArrayBidimensional {

	public static void main(String[] args) {
		
		
		//Creo un array de 3 filas y 5 columnas
		
		int[][] array = new int[3][5];
		
		//Para asignar un valor, por ejemplo, el 5 en la fila 0 y columna 1:
		
		array[0][1]=5;
		
		//Para definir el array completo
		
		int[][] array1 = {{4,5,1,2,3}, {7,1,2,5,3}, {7,1,3,5,2}};
		
		//Para recorrer el array utilizo dos bucles for anidados. El primero controla las filas y el segundo las columnas
		
		for(int i=0; i<array1.length; i++) {
			System.out.println("\n");
			for(int j=0; j<array1[0].length; j++) {
				System.out.println(array1[i][j]);
			}
		}
		
		System.out.println("\n");
		
		//Si solo quiero recorrer una columna, por ejemplo la primera columna de todas las filas
		
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i][0]);
		}
		
		System.out.println("\n");
		
		//Si solo quiero recorrer una fila, por ejemplo la segunda fila mostrando todas las columnas
		
		for(int i=0; i<array1[0].length; i++) {
			System.out.println(array1[1][i]);
		}
		
		System.out.println("\n");
		
		//Selecciono la fila 1 y todas sus columnas
		
		for(int i=0; i<array1[0].length; i++) {
			System.out.println(array1[1][i]);		
			}
		
		System.out.println("\n");
		
		//Selecciono la columna 2 y todas sus filas
		
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i][2]);
		}

	}

}
