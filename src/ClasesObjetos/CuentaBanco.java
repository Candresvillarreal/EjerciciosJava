package ClasesObjetos;

// Utilizo la clase ClienteBanco (es una relación de asociación)
public class CuentaBanco {
	
	private String numCuenta;
	private long saldo;
	private ClienteBanco titular;
	
	public CuentaBanco(String numCuenta, long saldo, ClienteBanco titular) {
		this.numCuenta=numCuenta;
		this.saldo=saldo;
		this.titular=titular;
	}
	
	public String getnumCuenta() {
		return numCuenta;
	}
	
	public void setnumCuenta(String numCuenta) {
		this.numCuenta=numCuenta;
	}
	
	public long getsaldo() {
		return saldo;
	}
	
	public void setsaldo(long saldo) {
		this.saldo=saldo;
	}
	
	public ClienteBanco gettitular() {
		return titular;
	}
	
	public void settitular(ClienteBanco titular) {
		this.titular=titular;
	}	

}
