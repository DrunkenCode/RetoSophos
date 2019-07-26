package co.com.linio.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal extends PageObject{
	public static final Target TXT_BUSCAR = Target.the("Ingresar el articujlo deseado").locatedBy("//div[@class='input-group hidden-sm-down input-group-search']//input[@name='q']");
	public static final Target BTN_BUSCAR = Target.the("Boton de busqueda").locatedBy("//button[@class='btn btn-primary']");
	public static final Target LBL_TITULO = Target.the("Nombre del producto").locatedBy("//*[@content='{0}']//ancestor::div[@class='detail-container']//span[@class='title-section' and contains(text(),'{1}')]");
}
