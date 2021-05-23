package ClasesObjetos;

public class Informatico extends Empleado{
	
	private String especialidad;
	private String titulacion;
	private String proyecto;
	
	//constructor por defecto
	
	public Informatico() {
		super();
	}
	//constructor con parámetros
	
	public Informatico(String IdEmpleado, String nombre, String apellidos, String DNI, String telefono,
			String categoria, double sueldo, String especialidad, String titulacion, String proyecto) {
		super(IdEmpleado, nombre, apellidos, DNI, telefono, categoria, sueldo);
		this.especialidad=especialidad;
		this.titulacion=titulacion;
		this.proyecto=proyecto;
	}
	//métodos getters y setters
	
	public String getespecialidad() {
		return especialidad;
	}
	public void setespecialidad(String especialidad) {
		this.especialidad=especialidad;
	}
	public String gettitulacion() {
		return titulacion;
	}
	public void settitulacion(String titulacion) {
		this.titulacion=titulacion;
	}
	public String getproyecto() {
		return proyecto;
	}
	public void setproyecto(String proyecto) {
		this.proyecto=proyecto;
	}
	//Método que muestra todos los datos de un informatico
	@Override
	public void mostrartodoslosdatos() {
		System.out.println("Los datos de " + nombre + " , " + apellidos + " son: ");
		System.out.println("Código Empleado: " + IdEmpleado);
		System.out.println("DNI: " + DNI);
		System.out.println("Teléfono: " + telefono);
		System.out.println("Categoría: " + categoria);
		System.out.println("Sueldo: " + sueldo);
		System.out.println("Especialidad: " + especialidad);
		System.out.println("Titulación: " + titulacion);
		System.out.println("Proyecto: " + proyecto);
	}
}
