package co.com.linio.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static co.com.linio.models.builders.ProductoBuilder.*;
import static co.com.linio.tasks.SeleccionarProducto.*;

import co.com.linio.interactions.AbrirPagina;
import co.com.linio.questions.CarritoDeCompras;
import co.com.linio.tasks.BuscarElProducto;
import co.com.linio.tasks.SeleccionarProducto;

public class AgregarAlCarritoDeComprasDefinition {
	
	@Before
	public void prepararEscenario() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Dado("que el usuario desea buscar un (.*)")
	public void queElUsuarioDeseaBuscarUn(String producto) {
		theActorCalled("Certificador").attemptsTo(
				AbrirPagina.paraComprar(),
				BuscarElProducto.deseado(producto().conNombre(producto))
				);
	}

	@Cuando("el usuario agregue al carrito el (.*) especifico deseado con (.*)")
	public void elUsuarioAgregueAlCarritoElEspecificoDeseadoCon(String producto, String precio) {
		theActorInTheSpotlight().attemptsTo(
				SeleccionarProducto.deseado(producto()
						.conNombre(producto)
						.conPrecio(precio))
				);
	}

	@Entonces("validara que el producto fue agregado exitosamente")
	public void validaraQueElProductoFueAgregadoExitosamente() {
		theActorInTheSpotlight().should(
				seeThat(CarritoDeCompras.confirmacionDel(
						producto().conNombre(strNombreCompleto),"Nombre")),
				seeThat(CarritoDeCompras.confirmacionDel(
						producto().conPrecio(strPrecio),"Precio")),
				seeThat(CarritoDeCompras.confirmacionDel(
						producto().conPrecio(strPrecio),"Subtotal")),
				seeThat(CarritoDeCompras.confirmacionDel(
						producto().conPrecio(strPrecio),"Total")
				));
	}
}