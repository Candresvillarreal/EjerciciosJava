package ArraysBidimensionales;

public class MultiplicoMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Defino las dos matrices que voy a multiplicar
		
		int[][] a = {{7,1,3}, {5,6,8}, {4,2,5}};
		int[][] b = {{7,10,2}, {3,5,1}, {6,2,4}};
		
		//El resultado esperado es
		//int [][] resultado= {{70,81,27},{101,96,48},{64,60,30}};
		
		//Para multiplicar dos matrices, las columnas de la primera deben ser iguales a las filas de la segunda
		//Compruebo si se cumple la condición.  En caso contrario lanzo un mensaje de error
		
		if(a[0].length!=b.length) {
			System.err.println("------------- Las matrices indicadas no pueden multiplicarse---------------------- \r\n"+
								"El número de columnas de la matriz a es distinto al número de filas de la matriz b");
			
		}else {
			System.out.println("Las matrices pueden multiplicarse");
		}
		
		//Creo la matriz resultado, cuyo tamaño serán las filas de la primera y las columnas de la segunda
		
		int[][] resultado = new int [a.length][b[0].length];
		
		//Multiplico las matrices
		
		for(int i=0; i<a.length; i++) { 			//Para cada bucle completado, avanzo una fila
			for(int j=0; j<b[0].length; j++) {			//Entro en la matriz b y avanzo por sus columnas (7,3,6)
				for(int k=0; k<a[0].length; k++) {		//Entro en la matriz a y avanzo por la fila (7,1,3). 
					resultado[i][j] += a[i][k] * b[k][j];
				}
			}	
		}
		
		//Relleno la matriz con el resultado
		
		for(int i=0; i<resultado.length; i++){
			System.out.println("\n");
			for(int j=0; j<resultado.length; j++) {
				System.out.print(" ");
				System.out.print(resultado[i][j]);
			}
		}

	}

}
