package ArraysUnidimensionales;

public class BurbujaDescendente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j, temp;
		
		int[] array = {4, -8, 90, 54, 324, 45, 76};
		
		//Creo el metodo burbuja pero en orden descendente (sólo cambio la condición del if):
		
		for(i=0; i<array.length-1; i++) {
			for(j=0; j<array.length-i-1; j++) {
				if(array[j+1]>array[j]) {
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
					
				}
			}
		}
		
		for(i=0; i<array.length; i++) {
			System.out.println("Elemento " + i + ": " + array[i]);
		}

	}

}
