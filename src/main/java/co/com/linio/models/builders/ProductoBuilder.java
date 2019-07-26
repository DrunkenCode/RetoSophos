package co.com.linio.models.builders;

import co.com.linio.models.Producto;
import co.com.linio.utils.Builder;

public class ProductoBuilder implements Builder<Producto>{
	
	private String nombre, precio;
	
	private ProductoBuilder() {
		this.nombre = "";
		this.precio = "";
	}
	
	public static ProductoBuilder producto() {
		return new ProductoBuilder();
	}
	
	public ProductoBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public ProductoBuilder conPrecio(String precio) {
		this.precio = precio;
		return this;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPrecio() {
		return precio;
	}

	@Override
	public Producto build() {
		return new Producto(this);
	}
}
