package ClasesObjetos;

public class Contable1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Contable Contable1=new Contable("Adm0002", "Juan", "Villa Redondo", "55661453C", "654789654",
			"Administrativo", 1600.00, "Administracion", "Contable", "Fiscal");
	
	
	Contable1.mostrartodoslosdatos();
	Contable1.setsueldo(2100.00);
	System.out.println(Contable1.getsueldo());
	Contable1.setnivel("Director");
	System.out.println(Contable1.getnivel());
	Contable1.setseccion("Finanzas");
	System.out.println(Contable1.getseccion());
	
	}
	
	

}

