package co.com.linio.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static co.com.linio.userinterfaces.PaginaPrincipal.*;

public class BuscarElProducto implements Task{
	
	static String strProducto;
	
	public BuscarElProducto() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(strProducto).into(TXT_BUSCAR),
				Click.on(BTN_BUSCAR)
				);
	}
	
	public static Performable deseado(String producto) {
		strProducto = producto;
		return instrumented(BuscarElProducto.class);
	}

}
