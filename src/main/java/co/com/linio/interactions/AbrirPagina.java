package co.com.linio.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.linio.userinterfaces.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Interaction {

    private PaginaPrincipal principal;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(principal)
        );
        BrowseTheWeb.as(actor).getDriver().manage().window().maximize();
    }

    /**
     * Retorna el navegador y lo maximiza
     * @return esta clase
     */
    public static Performable paraComprar(){
        return instrumented(AbrirPagina.class);
    }

}
