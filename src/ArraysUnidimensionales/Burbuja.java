package ArraysUnidimensionales;

public class Burbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {20, 15, 12, 30, -5, 72, 456};  //declaro el array que quiero ordenar
		
		int i, j, temp;                              //declaro las variables que voy a necesitar
		
		for(i=0; i<array.length-1; i++) {           //el primer bucle for recorre al array completo
			for(j=0; j<array.length-i-1; j++) {     //el segundo for compara una posición con la siguiente
				if(array[j+1]<array[j]){            //con el if intercambio posiciones si es necesario
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
				
			}
			
		}
		
		for(i=0; i<array.length; i++) {
			System.out.println("Elemento " + i + " : " + array[i]);
			
		}
		
	}

}
