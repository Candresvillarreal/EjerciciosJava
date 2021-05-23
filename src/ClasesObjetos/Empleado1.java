package ClasesObjetos;

public class Empleado1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Empleado Empleado1=new Empleado("INF001", "Jose", "Martínez Fernández", "12345678A", "987654321",
			"Informatica", 1200.00);
	
	Empleado1.setnombre("David");
	
	System.out.println(Empleado1.getnombre());
	

	Empleado1.mostrartodoslosdatos();
	System.out.println("***********************************************");

	
	
	}

}
