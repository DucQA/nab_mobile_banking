package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static ui.LoginPage.*;

public class Error implements Question<Boolean> {
    String message;

    public Error(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return errorPopup(message).resolveFor(actor).isPresent();
    }

    public static Error isPresent(String message) {
        return new Error(message);
    }
}