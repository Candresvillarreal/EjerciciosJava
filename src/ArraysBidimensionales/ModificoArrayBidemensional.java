package ArraysBidimensionales;

public class ModificoArrayBidemensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creo un array
		
		double[][] temperaturas = { {20.5,30.6,28.3},
				{-38.7,-18.3,-16.2} };
		
		//Quiero reemplazar el valor 30.6 por 21.3:
		
		temperaturas[0][1]=21.3;
		
		//Imprimo el resultado:
		
		System.out.println(temperaturas[0][1]);
		

	}

}
