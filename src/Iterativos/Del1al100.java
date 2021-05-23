package Iterativos;

public class Del1al100 {
	
	//Se muestran los números del 1 al 100 utilizando las estrucutras while, for, do-while

	public static void main(String[] args) {
		
		int num=1;
		
		//Utilizando while
		
		System.out.println("Números del 1 al 100 utilizando while: " + "\n");
		
		while(num>=1 && num<=100) {
			
			System.out.println(num);
			num++;
			
		}
		
		System.out.println("----------");
		
		num=1;
		
		//Utilizando do - while
		
		System.out.println("Números del 1 al 100 utilizando do - while: " + "\n");
		
		do {
			System.out.println(num);
			num++;
		}while(num>=1 && num<=100);
		
		System.out.println("----------");
		
		//Utilizando for:
		
		System.out.println("Números del 1 al 100 utilizando for: " + "\n");
		
		for(num=1; num<=100; num++) {
			System.out.println(num);
			
		}
		
		System.out.println("----------");
		
	}

}
