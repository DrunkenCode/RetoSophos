package co.com.linio.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.linio.models.Producto;
import co.com.linio.models.builders.ProductoBuilder;

import static co.com.linio.userinterfaces.PaginaPrincipal.*;

public class BuscarElProducto implements Task{
	
	static String strProducto;
	
	public BuscarElProducto(Producto productoM) {
		strProducto = productoM.getNombre();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(strProducto).into(TXT_BUSCAR),
				Click.on(BTN_BUSCAR)
				);
	}
	
	/**
	 * Retorna la clase que ingresa el producto a buscar y luego presiona en el boton buscar.
	 * @param productoB Es el Builder del Producto.
	 * @return Esta clase
	 */
	public static Performable deseado(ProductoBuilder productoB) {
		return instrumented(BuscarElProducto.class, productoB.build());
	}

}
