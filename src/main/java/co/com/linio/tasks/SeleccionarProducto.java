package co.com.linio.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class SeleccionarProducto implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
	}

	public static Performable deseado() {
		return instrumented(SeleccionarProducto.class);
	}
}
