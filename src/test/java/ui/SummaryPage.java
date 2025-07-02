package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class SummaryPage {
    public static Target total(String number) {
        return Target.the("Savings Total text")
                .located(AppiumBy.xpath("(//*[@name='" + number + "'])[1]"));
    }

    public static Target backButton = Target.the("Back button")
            .located(AppiumBy.accessibilityId("Back button"));
}


