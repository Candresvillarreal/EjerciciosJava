package ClasesObjetos;

public class Administrativo extends Empleado{
	protected String departamento;
	protected String nivel;
	
	//constructor por defecto
	public Administrativo() {
		super();
	}
	
	//contructor con parámetros
	public Administrativo(String IdEmpleado, String nombre, String apellidos, String DNI,
			String telefono, String categoria, double sueldo, String departamento, String nivel) {
		super(IdEmpleado, nombre, apellidos, DNI, telefono, categoria, sueldo);
		this.departamento=departamento;
		this.nivel=nivel;
	}
	
	//métodos getters y setters
	public String getdepartamento() {
		return departamento;
		
	}
	public void setdepartamento(String departamento) {
		this.departamento=departamento;
	}
	public String getnivel() {
		return nivel;
	}
	public void setnivel(String nivel) {
		this.nivel=nivel;
	}
	
	//Método que muestra todos los datos de un administrativo
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
		}		
}


