package co.com.linio.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static co.com.linio.userinterfaces.PaginaPrincipal.*;

import co.com.linio.models.Producto;
import co.com.linio.models.builders.ProductoBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SeleccionarProducto implements Task{
	
	public static String strNombreCompleto, strNombre, strPrecio;
	
	public SeleccionarProducto(Producto productoM) {
		strNombre = productoM.getNombre();
		strPrecio = productoM.getPrecio();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				WaitUntil.the(LBL_TITULO.of(strPrecio.replace(",", ""), strNombre), isPresent()),
				Click.on(LBL_TITULO.of(strPrecio.replace(",", ""), strNombre)));
		strNombreCompleto = LBL_NOMBRE_PRODUCTO.resolveFor(actor).getText();
		System.out.println(strNombreCompleto);
		actor.attemptsTo(
				WaitUntil.the(BTN_AGREGAR_AL_CARRITO, isPresent()),
				Click.on(BTN_AGREGAR_AL_CARRITO),
				WaitUntil.the(BTN_IR_AL_CARRITO, isPresent()),
				Click.on(BTN_IR_AL_CARRITO)
				);
	}

	public static Performable deseado(ProductoBuilder productoB) {
		return instrumented(SeleccionarProducto.class, productoB.build());
	}
}