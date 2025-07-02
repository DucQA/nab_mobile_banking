package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static ui.SummaryPage.*;

public class Total implements Question<Boolean> {
    String number;

    public Total(String number) {
        this.number = number;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return total(number).resolveFor(actor).isPresent();
    }

    public static Total isPresent(String message) {
        return new Total(message);
    }
}