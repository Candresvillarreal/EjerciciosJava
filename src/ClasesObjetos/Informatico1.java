package ClasesObjetos;

public class Informatico1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Informatico Informatico1=new Informatico("Inf001", "David", "P�rez Sancho", "456231455D", 
				"654213265", "Informartico", 1500.00, "Desarrollo", "Ingeniero", "Implantaci�n ERP");
		
		Informatico1.setespecialidad("Desarrollo");
		System.out.println(Informatico1.getespecialidad());
		
		Informatico1.mostrartodoslosdatos();
	}
	
	
	


}
