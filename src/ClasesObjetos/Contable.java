package ClasesObjetos;

public class Contable extends Administrativo {
	
	private String seccion;
	
	//constructor por defecto
	
	public Contable() {
		super();
	}
	
	//constructor con parámetros
	
	public Contable(String IdEmpleado, String nombre, String apellidos, String DNI, 
			String telefono, String categoria, double sueldo, String departamento,
			String nivel, String seccion) {
		super(IdEmpleado,  nombre, apellidos, DNI, telefono, categoria, sueldo, departamento, nivel);
		this.seccion=seccion;
	}
	
	//métodos: getter y setter
	
	public String getseccion() {
		return seccion;
	}
	
	public void setseccion(String seccion) {
		this.seccion=seccion;
	}
	
	//Método que muestra todos los datos de un contable
	@Override
	public void mostrartodoslosdatos() {
		System.out.println("Los datos de " + nombre + " , " + apellidos + " son: ");
		System.out.println("Código Empleado: " + IdEmpleado);
		System.out.println("DNI: " + DNI);
		System.out.println("Teléfono: " + telefono);
		System.out.println("Categoría: " + categoria);
		System.out.println("Sueldo: " + sueldo);
		System.out.println("Departamento: " + departamento);
		System.out.println("Nivel: " + nivel);
		System.out.println("Seccion: " + seccion);
	}

}
	
	

