package Selectivos;

import java.util.*;

public class PrecioVenta {
	
	//Se pide el precio de un producto, el tipo de iva y las unidades vendidas y se muestra el PVP

	public static void main(String[] args) {
		
		double precio;
		double iva;
		double ivaAplicado;
		double importeIva;
		double bruto;
		double unidades;
		double pvp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el precio del producto: ");
		precio = sc.nextDouble();
		System.out.println("Introduzca el iva que se aplica al producto");
		iva = sc.nextDouble();
		System.out.println("Introduzca las unidades vendidas");
		unidades = sc.nextDouble();
		
		ivaAplicado = (iva/100);
		bruto = unidades * precio;
		importeIva = bruto * ivaAplicado;
		pvp = bruto + importeIva;
		
	
		System.out.println("Unidades: " + "\t" + unidades + "\n" + "Precio: " + "\t" + precio + "\n" + "Importe Bruto: " +  "\t" + bruto  +"\n" +"% IVA: " + "\t" + "\t" + iva + 
							 "\n" + "Importe IVA: " + "\t" + importeIva + "\n" + "Precio Venta: " + "\t" + pvp);
	
		
		sc.close();
	}

}
