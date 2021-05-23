package ClasesObjetos;

public class Parking {
	
	private int numPlazas;
	private PlazaAparcamiento[] plazas;
	
	public Parking(int numPlazas) {
		this.numPlazas=numPlazas;
		plazas=new PlazaAparcamiento[numPlazas];
	}
	
	public int getnumPlazas() {
		return numPlazas;
	}
	
	public void setnumPlazas(int numPlazas) {
		this.numPlazas=numPlazas;
	}
	
	public PlazaAparcamiento[] getplazas() {
		return plazas;
	}
	
	public void setplazas (PlazaAparcamiento[] plazas) {
		this.plazas=plazas;
	}

}
