package Iterativos;

public class Del100al1 {
	
	//Se muestran los números del 100 al 1 utilizando while, do-while y for

	public static void main(String[] args) {
		
		int num=100;
		
		//Utilizando while
		
		System.out.println("Números del 100 al 1 utilizando while");
		System.out.println(" ");
		
		while(num>=1) {
			System.out.println(num);
			num--;
		}
		
		//Utilizando do - while
		
		num=100;
		
		System.out.println(" ");
		System.out.println("Números del 100 al 1 utilizando do - while");
		System.out.println(" ");
		
		do {
			System.out.println(num);
			num--;
		}while(num>=1);
		
		//Utilizando for
		
		System.out.println(" ");
		System.out.println("Números del 100 al 1 utilizando for");
		System.out.println(" ");
		
		for(int i=100; i>=1; i--) {
			System.out.println(i);
		}
		

	}

}
