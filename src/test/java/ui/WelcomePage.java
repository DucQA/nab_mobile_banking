package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class WelcomePage {
    public static Target loginButton = Target.the("Login button")
            .located(AppiumBy.accessibilityId("loginButton"));
    public static Target findUsButton = Target.the("Find us button")
            .located(AppiumBy.accessibilityId("Find us"));
    public static Target moreButton = Target.the("More button")
            .located(AppiumBy.accessibilityId("More"));

    public static Target menu(String menu) {
        return Target.the("Menu: " + menu)
                .locatedBy("//*[@name='" + menu + "']");
    }
}


