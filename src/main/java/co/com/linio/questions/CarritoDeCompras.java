package co.com.linio.questions;

import co.com.linio.models.Producto;
import co.com.linio.models.builders.ProductoBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.linio.userinterfaces.CarritoDeCompras.*;

public class CarritoDeCompras implements Question<Boolean>{
	
	private String nombre, precio, parametro;
	
	public CarritoDeCompras(Producto productoM, String parametro) {
		nombre = productoM.getNombre();
		precio = productoM.getPrecio();
		this.parametro = parametro;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		switch (parametro) {
		case "Nombre":
			if(LBL_NOMBRE_PRODUCTO.of(nombre).resolveFor(actor).isVisible()) {
				return true;
			}
			break;
		case "Precio":
			if(LBL_PRECIO_PRODUCTO.of(precio).resolveFor(actor).isVisible()) {
				return true;
			}
			break;
		case "Subtotal":
			if(LBL_PRECIO_SUBTOTAL.of(precio).resolveFor(actor).isVisible()) {
				return true;
			}
			break;
		case "Total":
			if(LBL_PRECIO_TOTAL.of(precio).resolveFor(actor).isVisible()) {
				return true;
			}
			break;
		default:
			break;
		}
		return false;
	}
	
	/**
	 * Retorna la clase que valida el nombre del producto y los precios, retornando true o false.
	 * @param productB Es el Builder del Producto.
	 * @param parametro Es el elemento al cual se va validar
	 * @return esta clase.
	 */
	public static CarritoDeCompras confirmacionDel(ProductoBuilder productB, String parametro) {
		return new CarritoDeCompras(productB.build(), parametro);
	}
}