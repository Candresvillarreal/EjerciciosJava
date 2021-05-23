package ClasesObjetos;

public class Administrativo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Administrativo Administrativo1=new Administrativo("Adm001", "Marta", "Fernandez Martínez",
				"87654321Z", "65432144", "Administracion", 1100.00,"Logística","Responsable");
		
		Administrativo1.setnivel("Incidencias");
		System.out.println(Administrativo1.getnivel());
		
		Administrativo1.setapellidos("Ramos García");
		System.out.println(Administrativo1.getapellidos());
		Administrativo1.mostrartodoslosdatos();

	
	
	
	}

}

