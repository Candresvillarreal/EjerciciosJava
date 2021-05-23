package ArraysUnidimensionales;

import java.util.Random;

public class CreandoVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		int i, num;
		
		//Creando e imprimiendo vector
		
		int vector[] = new int[9];
		
		System.out.println("Creando Vector");
		
		for(i=0;i<vector.length;i++) {
			num=rd.nextInt(50);
			vector[i]=num;
			System.out.println(i + "=[" +vector[i] + "]");
			
			
		}
		
		

	}

}
