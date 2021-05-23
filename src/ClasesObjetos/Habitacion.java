package ClasesObjetos;

public class Habitacion {
	
	private double metroscuadrados;
	private int numVentanas;
	
	public Habitacion(double metroscuadrados, int numVentanas) {
		this.metroscuadrados=metroscuadrados;
		this.numVentanas=numVentanas;
	}
	
	public double getmetroscuadrados() {
		return metroscuadrados;
	}
	
	public void setmetroscuadrados (double metroscuadrados) {
		this.metroscuadrados=metroscuadrados;
	}
	
	public int numVentanas() {
		return numVentanas;
	}
	
	public void setnumVentanas (int numVentanas) {
		this.numVentanas=numVentanas;
	}

}
