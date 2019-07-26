package co.com.linio.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoDeCompras {
	public static final Target LBL_NOMBRE_PRODUCTO = Target.the("Nombre del producto").locatedBy("//div[@class='item-title col-md-12 col-sm-11 col-xs-10']//child::a[contains(.,'{0}')]");
	public static final Target LBL_PRECIO_PRODUCTO = Target.the("Precio del producto").locatedBy("//div[@class='lowest-price' and contains(div,'{0}')]");
	public static final Target LBL_PRECIO_SUBTOTAL = Target.the("Precio del Subtotal").locatedBy("//span[@class='price-main price-highlight pull-xs-right' and contains(.,'{0}')]//ancestor::li[1]//p[contains(text(),'Subtotal')]");
	public static final Target LBL_PRECIO_TOTAL = Target.the("Precio del Total").locatedBy("//span[@class='price-main price-highlight pull-xs-right' and contains(.,'{0}')]//ancestor::li[1]//h4[contains(text(),'Total')]");
}
