package ClasesObjetos;

public class Informatico1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Informatico Informatico1=new Informatico("Inf001", "David", "Pérez Sancho", "456231455D", 
				"654213265", "Informartico", 1500.00, "Desarrollo", "Ingeniero", "Implantación ERP");
		
		Informatico1.setespecialidad("Desarrollo");
		System.out.println(Informatico1.getespecialidad());
		
		Informatico1.mostrartodoslosdatos();
	}
	
	
	


}
