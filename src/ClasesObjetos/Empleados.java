package ClasesObjetos;

public class Empleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado Empleado1=new Empleado("Inf001", "Jose", "Martínez Fernández", "12345678A", "987654321",
				"Informatica", 1200.00);
		
		Administrativo Administrativo1=new Administrativo("Adm001", "Marta", "Fernandez Martínez",
				"87654321Z", "65432144", "Administracion", 1100.00,"Logística","Responsable");
		
		Contable Contable1=new Contable("Adm0002", "Juan", "Villa Redondo", "55661453C", "654789654",
				"Administrativo", 1600.00, "Administracion", "Contable", "Fiscal");
		
		Informatico Informatico1=new Informatico("Inf001", "Jose", "Martínez Fernández", "12345678A",
				"987654321","Informatica", 1200.00 , "Desarrollo", "Ingeniero", "Implantación ERP");
		
		Empleado1.mostrartodoslosdatos();
		System.out.println("***********************************************");
		Administrativo1.mostrartodoslosdatos();
		System.out.println("***********************************************");
		Contable1.mostrartodoslosdatos();
		System.out.println("***********************************************");
		Informatico1.mostrartodoslosdatos();
		System.out.println("***********************************************");
	}
	
	


}
