package ClasesObjetos;

// Utilizo la clase Habitación para formar la Casa (relacion de AGREGACION)

public class Casa {
	
	Habitacion comedor = new Habitacion(30, 2);
	Habitacion dormitorio = new Habitacion (25, 2);
	Habitacion cocina = new Habitacion (15, 1);
	Habitacion bano = new Habitacion (5, 0);

}
