package ArraysBidimensionales;

public class Array2Dimensiones {

	public static void main(String[] args) {
		
		//Creo un array bidemensional que tendrá dos filas
		
		double[][] temperaturas = new double[2][];
		
		//La primera fila tendrá 3 columnas
		
		temperaturas[0]=new double[3];
		
		//La segunda fila tendrá también 3 columnas
		
		temperaturas[1]= new double[3];
		
		//Asigno los valores para la fila 1:
		
		temperaturas[0][0]=15.5;
		temperaturas[0][1]=7.2;
		temperaturas[0][2]=11.6;
		
		//Relleno los valores para la fila 2:
		
		temperaturas[1][0]=-8.3;
		temperaturas[1][1]=-14.1;
		temperaturas[1][2]=-9.0;
		
		//Muestro el array bidemensional:
		//El primer for recorre las columnas y el segundo las filas, por eso escribo j<temperaturas[i].lenght
		for(int i=0; i<temperaturas.length; i++) {
			for(int j=0; j<temperaturas[i].length; j++) {
			System.out.println(temperaturas[i][j]);
			}
		}

	}

}
