package co.com.linio.models;

import co.com.linio.models.builders.ProductoBuilder;

public class Producto {
	
	private String nombre, precio;
	
	public Producto(ProductoBuilder productB) {
		this.nombre = productB.getNombre();
		this.precio = productB.getPrecio();
	}

	public String getNombre() {
		return nombre;
	}

	public String getPrecio() {
		return precio;
	}

}
