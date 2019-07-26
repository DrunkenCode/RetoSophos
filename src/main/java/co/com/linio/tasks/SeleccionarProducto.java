package co.com.linio.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.linio.userinterfaces.PaginaPrincipal.*;

import co.com.linio.models.Producto;
import co.com.linio.models.builders.ProductoBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarProducto implements Task{
	
	static String nombre, precio;
	
	public SeleccionarProducto(Producto productoM) {
		nombre = productoM.getNombre();
		precio = productoM.getPrecio();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(LBL_TITULO.of(precio, nombre))
				);
		
	}

	public static Performable deseado(ProductoBuilder productoB) {
		return instrumented(SeleccionarProducto.class, productoB.build());
	}
}
