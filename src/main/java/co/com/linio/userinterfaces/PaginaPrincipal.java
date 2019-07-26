package co.com.linio.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
/**
 * Mapeo de los elementos usados en la pagina Principal
 * @author Leider
 *
 */
public class PaginaPrincipal extends PageObject{
	public static final Target TXT_BUSCAR = Target.the("Ingresar el articujlo deseado").locatedBy("//div[@class='input-group hidden-sm-down input-group-search']//input[@name='q']");
	public static final Target BTN_BUSCAR = Target.the("Boton de busqueda").locatedBy("//button[@class='btn btn-primary']");
	public static final Target LBL_TITULO = Target.the("Nombre del producto").locatedBy("//*[@content='{0}']//ancestor::div[@class='detail-container']//span[@class='title-section' and contains(text(),'{1}')]");
	public static final Target LBL_NOMBRE_PRODUCTO = Target.the("Nombre completo del producto").locatedBy("//h1[1]//span[@itemprop='name']");
	public static final Target BTN_AGREGAR_AL_CARRITO = Target.the("Boton que agrega al carrito de compras").locatedBy("//*[@id='buy-now'][1]");
	public static final Target BTN_IR_AL_CARRITO = Target.the("Boton se dirige al carrito de compras").locatedBy("//a[text()='Ir al carrito']");
}
