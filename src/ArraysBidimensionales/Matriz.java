package ArraysBidimensionales;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz= {{7, 1, 3}, {5, 6 ,8}, {4, 2, 5}};
		
		//Para recorrer todas las columnas de una fila, por ejemplo, la segunda fila
		//Primera fila = 0
		
		for(int i=0; i<matriz[0].length;i++){
			System.out.println(matriz[0][i]);
		}
		
		System.out.println("\n");
		
		//Para recorrer todas las filas de una columna, por ejemplo, la primera columna
		//Primera columna = 0
		
		for(int i=0; i<matriz.length; i++) {
			System.out.println(matriz[i][0]);
		}

	}

}
